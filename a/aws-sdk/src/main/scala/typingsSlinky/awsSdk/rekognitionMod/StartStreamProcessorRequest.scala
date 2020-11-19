package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartStreamProcessorRequest extends js.Object {
  
  /**
    * The name of the stream processor to start processing.
    */
  var Name: StreamProcessorName = js.native
}
object StartStreamProcessorRequest {
  
  @scala.inline
  def apply(Name: StreamProcessorName): StartStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartStreamProcessorRequest]
  }
  
  @scala.inline
  implicit class StartStreamProcessorRequestOps[Self <: StartStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
