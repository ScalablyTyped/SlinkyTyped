package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONMappingParameters extends js.Object {
  
  /**
    * The path to the top-level parent that contains the records.
    */
  var RecordRowPath: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RecordRowPath = js.native
}
object JSONMappingParameters {
  
  @scala.inline
  def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONMappingParameters]
  }
  
  @scala.inline
  implicit class JSONMappingParametersOps[Self <: JSONMappingParameters] (val x: Self) extends AnyVal {
    
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
    def setRecordRowPath(value: RecordRowPath): Self = this.set("RecordRowPath", value.asInstanceOf[js.Any])
  }
}
