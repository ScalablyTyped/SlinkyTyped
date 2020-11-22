package typingsSlinky.instagramPrivateApi.directThreadRepositoryUpdateTitleResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadRepositoryUpdateTitleResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var thread: DirectThreadRepositoryUpdateTitleResponseThread = js.native
}
object DirectThreadRepositoryUpdateTitleResponseRootObject {
  
  @scala.inline
  def apply(status: String, thread: DirectThreadRepositoryUpdateTitleResponseThread): DirectThreadRepositoryUpdateTitleResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseRootObject]
  }
  
  @scala.inline
  implicit class DirectThreadRepositoryUpdateTitleResponseRootObjectOps[Self <: DirectThreadRepositoryUpdateTitleResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread(value: DirectThreadRepositoryUpdateTitleResponseThread): Self = this.set("thread", value.asInstanceOf[js.Any])
  }
}
