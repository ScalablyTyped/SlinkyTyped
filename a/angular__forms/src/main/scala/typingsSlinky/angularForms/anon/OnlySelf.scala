package typingsSlinky.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnlySelf extends js.Object {
  
  var onlySelf: js.UndefOr[Boolean] = js.native
}
object OnlySelf {
  
  @scala.inline
  def apply(): OnlySelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlySelf]
  }
  
  @scala.inline
  implicit class OnlySelfOps[Self <: OnlySelf] (val x: Self) extends AnyVal {
    
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
    def setOnlySelf(value: Boolean): Self = this.set("onlySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlySelf: Self = this.set("onlySelf", js.undefined)
  }
}
