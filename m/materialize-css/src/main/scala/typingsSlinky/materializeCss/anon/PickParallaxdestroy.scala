package typingsSlinky.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Parallax, 'destroy'> */
@js.native
trait PickParallaxdestroy extends js.Object {
  
  var destroy: js.UndefOr[js.Any] = js.native
}
object PickParallaxdestroy {
  
  @scala.inline
  def apply(): PickParallaxdestroy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickParallaxdestroy]
  }
  
  @scala.inline
  implicit class PickParallaxdestroyOps[Self <: PickParallaxdestroy] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: js.Any): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
}
