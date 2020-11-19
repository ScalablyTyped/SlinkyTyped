package typingsSlinky.awsSdkClientXrayNode.typesGetServiceGraphOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesServiceMod.UnmarshalledService
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceGraphOutput extends OutputTypesUnion {
  
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  
  /**
    * <p>The end of the time frame for which the graph was generated.</p>
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * <p>The services that have processed a traced request during the specified time frame.</p>
    */
  var Services: js.UndefOr[js.Array[UnmarshalledService]] = js.native
  
  /**
    * <p>The start of the time frame for which the graph was generated.</p>
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}
object GetServiceGraphOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetServiceGraphOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceGraphOutput]
  }
  
  @scala.inline
  implicit class GetServiceGraphOutputOps[Self <: GetServiceGraphOutput] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: UnmarshalledService*): Self = this.set("Services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[UnmarshalledService]): Self = this.set("Services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServices: Self = this.set("Services", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
