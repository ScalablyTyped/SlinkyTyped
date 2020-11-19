package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameOnly extends js.Object {
  
  var nameOnly: js.UndefOr[Boolean] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
}
object NameOnly {
  
  @scala.inline
  def apply(): NameOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameOnly]
  }
  
  @scala.inline
  implicit class NameOnlyOps[Self <: NameOnly] (val x: Self) extends AnyVal {
    
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
    def setNameOnly(value: Boolean): Self = this.set("nameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameOnly: Self = this.set("nameOnly", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
