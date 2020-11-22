package typingsSlinky.bootstrap.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.bootstrapStrings.dynamic
import typingsSlinky.bootstrap.bootstrapStrings.parent
import typingsSlinky.bootstrap.bootstrapStrings.static
import typingsSlinky.bootstrap.bootstrapStrings.toggle
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.PopperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options> */
@js.native
trait PartialOptionsBoundary extends js.Object {
  
  var boundary: js.UndefOr[Boundary | Element] = js.native
  
  var display: js.UndefOr[dynamic | static] = js.native
  
  var flip: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var popperConfig: js.UndefOr[PopperOptions | Null] = js.native
  
  var reference: js.UndefOr[toggle | parent | Element] = js.native
}
object PartialOptionsBoundary {
  
  @scala.inline
  def apply(): PartialOptionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsBoundary]
  }
  
  @scala.inline
  implicit class PartialOptionsBoundaryOps[Self <: PartialOptionsBoundary] (val x: Self) extends AnyVal {
    
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
    def setBoundaryElement(value: Element): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundary(value: Boundary | Element): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setDisplay(value: dynamic | static): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPopperConfig(value: PopperOptions): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    
    @scala.inline
    def setPopperConfigNull: Self = this.set("popperConfig", null)
    
    @scala.inline
    def setReferenceElement(value: Element): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: toggle | parent | Element): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
  }
}
