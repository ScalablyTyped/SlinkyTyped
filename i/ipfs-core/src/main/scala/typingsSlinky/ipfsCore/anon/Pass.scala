package typingsSlinky.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pass extends js.Object {
  
  var pass: js.UndefOr[String] = js.native
}
object Pass {
  
  @scala.inline
  def apply(): Pass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pass]
  }
  
  @scala.inline
  implicit class PassOps[Self <: Pass] (val x: Self) extends AnyVal {
    
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
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
  }
}
