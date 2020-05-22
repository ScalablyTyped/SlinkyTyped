package typingsSlinky.pulumiAws.dynamodbMixinsMod

import typingsSlinky.pulumiAws.anon.ApproximateCreationDateTime
import typingsSlinky.pulumiAws.anon.PrincipalId
import typingsSlinky.pulumiAws.pulumiAwsStrings.INSERT
import typingsSlinky.pulumiAws.pulumiAwsStrings.MODIFY
import typingsSlinky.pulumiAws.pulumiAwsStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEventRecord extends js.Object {
  var awsRegion: String = js.native
  var dynamodb: ApproximateCreationDateTime = js.native
  var eventID: String = js.native
  var eventName: INSERT | MODIFY | REMOVE = js.native
  var eventSource: String = js.native
  var eventVersion: String = js.native
  var userIdentity: PrincipalId = js.native
}

object TableEventRecord {
  @scala.inline
  def apply(
    awsRegion: String,
    dynamodb: ApproximateCreationDateTime,
    eventID: String,
    eventName: INSERT | MODIFY | REMOVE,
    eventSource: String,
    eventVersion: String,
    userIdentity: PrincipalId
  ): TableEventRecord = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], dynamodb = dynamodb.asInstanceOf[js.Any], eventID = eventID.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableEventRecord]
  }
}

