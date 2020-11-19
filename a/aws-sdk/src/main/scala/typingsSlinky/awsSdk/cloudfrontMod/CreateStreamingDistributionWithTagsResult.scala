package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamingDistributionWithTagsResult extends js.Object {
  
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The fully qualified URI of the new streaming distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.native
  
  /**
    * The streaming distribution's information. 
    */
  var StreamingDistribution: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.StreamingDistribution] = js.native
}
object CreateStreamingDistributionWithTagsResult {
  
  @scala.inline
  def apply(): CreateStreamingDistributionWithTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamingDistributionWithTagsResult]
  }
  
  @scala.inline
  implicit class CreateStreamingDistributionWithTagsResultOps[Self <: CreateStreamingDistributionWithTagsResult] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setStreamingDistribution(value: StreamingDistribution): Self = this.set("StreamingDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingDistribution: Self = this.set("StreamingDistribution", js.undefined)
  }
}
