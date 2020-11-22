package typingsSlinky.reactOverlays.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends js.Object {
  
  var placement: typingsSlinky.reactOverlays.usePopperMod.Placement = js.native
  
  var popper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any = js.native
  
  var reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any = js.native
}
object Placement {
  
  @scala.inline
  def apply(
    placement: typingsSlinky.reactOverlays.usePopperMod.Placement,
    popper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any,
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any
  ): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlacement(value: typingsSlinky.reactOverlays.usePopperMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any
    ): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ js.Any
    ): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
