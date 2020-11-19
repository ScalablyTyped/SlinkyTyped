package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreserveFoldsReversed extends js.Object {
  
  var autoscroll: js.UndefOr[Boolean] = js.native
  
  var preserveFolds: js.UndefOr[Boolean] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
}
object PreserveFoldsReversed {
  
  @scala.inline
  def apply(): PreserveFoldsReversed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFoldsReversed]
  }
  
  @scala.inline
  implicit class PreserveFoldsReversedOps[Self <: PreserveFoldsReversed] (val x: Self) extends AnyVal {
    
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
    def setAutoscroll(value: Boolean): Self = this.set("autoscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscroll: Self = this.set("autoscroll", js.undefined)
    
    @scala.inline
    def setPreserveFolds(value: Boolean): Self = this.set("preserveFolds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveFolds: Self = this.set("preserveFolds", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
  }
}
