package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectUsersParams extends js.Object {
  
  var userId: Double = js.native
}
object DeleteProjectUsersParams {
  
  @scala.inline
  def apply(userId: Double): DeleteProjectUsersParams = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectUsersParams]
  }
  
  @scala.inline
  implicit class DeleteProjectUsersParamsOps[Self <: DeleteProjectUsersParams] (val x: Self) extends AnyVal {
    
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
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
