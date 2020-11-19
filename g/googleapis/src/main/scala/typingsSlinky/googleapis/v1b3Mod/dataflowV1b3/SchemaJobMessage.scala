package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A particular message pertaining to a Dataflow job.
  */
@js.native
trait SchemaJobMessage extends js.Object {
  
  /**
    * Deprecated.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Importance level of the message.
    */
  var messageImportance: js.UndefOr[String] = js.native
  
  /**
    * The text of the message.
    */
  var messageText: js.UndefOr[String] = js.native
  
  /**
    * The timestamp of the message.
    */
  var time: js.UndefOr[String] = js.native
}
object SchemaJobMessage {
  
  @scala.inline
  def apply(): SchemaJobMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobMessage]
  }
  
  @scala.inline
  implicit class SchemaJobMessageOps[Self <: SchemaJobMessage] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMessageImportance(value: String): Self = this.set("messageImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageImportance: Self = this.set("messageImportance", js.undefined)
    
    @scala.inline
    def setMessageText(value: String): Self = this.set("messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageText: Self = this.set("messageText", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
