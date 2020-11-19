package typingsSlinky.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonAsterisk
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCompleteMultipartUpload
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonCopy
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPost
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectCreatedColonPut
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonAsterisk
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDelete
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonObjectRemovedColonDeleteMarkerCreated
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.s3ColonReducedRedundancyLostObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicConfigurationDeprecated extends js.Object {
  
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
    * <p>Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.</p>
    */
  var Topic: js.UndefOr[String] = js.native
}
object TopicConfigurationDeprecated {
  
  @scala.inline
  def apply(): TopicConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicConfigurationDeprecated]
  }
  
  @scala.inline
  implicit class TopicConfigurationDeprecatedOps[Self <: TopicConfigurationDeprecated] (val x: Self) extends AnyVal {
    
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
    def setTopic(value: String): Self = this.set("Topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("Topic", js.undefined)
  }
}
