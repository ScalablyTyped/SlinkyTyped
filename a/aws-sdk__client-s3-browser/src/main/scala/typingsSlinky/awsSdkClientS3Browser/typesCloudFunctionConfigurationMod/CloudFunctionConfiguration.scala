package typingsSlinky.awsSdkClientS3Browser.typesCloudFunctionConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonAsterisk
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonCopy
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPost
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectCreatedColonPut
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonAsterisk
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDelete
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.s3ColonReducedRedundancyLostObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFunctionConfiguration extends js.Object {
  
  /**
    * _CloudFunction shape
    */
  var CloudFunction: js.UndefOr[String] = js.native
  
  /**
    * <p>Bucket event for which to send notifications.</p>
    */
  var Event: js.UndefOr[
    s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
  ] = js.native
  
  /**
    * _EventList shape
    */
  var Events: js.UndefOr[
    (js.Array[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ]) | (js.Iterable[
      s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ])
  ] = js.native
  
  /**
    * <p>Optional unique identifier for configurations in a notification configuration. If you don't provide one, Amazon S3 will assign an ID.</p>
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * _CloudFunctionInvocationRole shape
    */
  var InvocationRole: js.UndefOr[String] = js.native
}
object CloudFunctionConfiguration {
  
  @scala.inline
  def apply(): CloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFunctionConfiguration]
  }
  
  @scala.inline
  implicit class CloudFunctionConfigurationOps[Self <: CloudFunctionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCloudFunction(value: String): Self = this.set("CloudFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudFunction: Self = this.set("CloudFunction", js.undefined)
    
    @scala.inline
    def setEvent(
      value: s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
    ): Self = this.set("Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("Event", js.undefined)
    
    @scala.inline
    def setEventsVarargs(
      value: (s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String)*
    ): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEventsIterable(
      value: js.Iterable[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]
    ): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(
      value: (js.Array[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ]) | (js.Iterable[
          s3ColonReducedRedundancyLostObject | s3ColonObjectCreatedColonAsterisk | s3ColonObjectCreatedColonPut | s3ColonObjectCreatedColonPost | s3ColonObjectCreatedColonCopy | s3ColonObjectCreatedColonCompleteMultipartUpload | s3ColonObjectRemovedColonAsterisk | s3ColonObjectRemovedColonDelete | s3ColonObjectRemovedColonDeleteMarkerCreated | String
        ])
    ): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInvocationRole(value: String): Self = this.set("InvocationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationRole: Self = this.set("InvocationRole", js.undefined)
  }
}
