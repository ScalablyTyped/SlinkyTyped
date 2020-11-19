package typingsSlinky.recoil.anon

import typingsSlinky.recoil.mod.GetRecoilValue
import typingsSlinky.recoil.mod.RecoilValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends js.Object {
  
  var get: GetRecoilValue = js.native
}
object Get {
  
  @scala.inline
  def apply(get: /* recoilVal */ RecoilValue[js.Any] => js.Any): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Get]
  }
  
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
    
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
    def setGet(value: /* recoilVal */ RecoilValue[js.Any] => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
