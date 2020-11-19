package typingsSlinky.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxTouchOptions extends js.Object {
  
  /**
    * Continue movement after releasing mouse/touch when panning
    */
  var momentum: js.UndefOr[Boolean] = js.native
  
  /**
    *  Allow to drag content vertically
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object FancyBoxTouchOptions {
  
  @scala.inline
  def apply(): FancyBoxTouchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxTouchOptions]
  }
  
  @scala.inline
  implicit class FancyBoxTouchOptionsOps[Self <: FancyBoxTouchOptions] (val x: Self) extends AnyVal {
    
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
    def setMomentum(value: Boolean): Self = this.set("momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
