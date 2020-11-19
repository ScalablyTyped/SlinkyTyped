package typingsSlinky.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveSynonymResponse extends js.Object {
  
  /**
    * The operation task id. May be used to perform a wait task.
    */
  var taskID: Double = js.native
  
  /**
    * When the given synonyms got saved.
    */
  var updatedAt: Double = js.native
}
object SaveSynonymResponse {
  
  @scala.inline
  def apply(taskID: Double, updatedAt: Double): SaveSynonymResponse = {
    val __obj = js.Dynamic.literal(taskID = taskID.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveSynonymResponse]
  }
  
  @scala.inline
  implicit class SaveSynonymResponseOps[Self <: SaveSynonymResponse] (val x: Self) extends AnyVal {
    
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
    def setTaskID(value: Double): Self = this.set("taskID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
}
