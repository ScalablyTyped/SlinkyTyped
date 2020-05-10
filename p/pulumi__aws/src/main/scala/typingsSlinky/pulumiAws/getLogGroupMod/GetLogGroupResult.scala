package typingsSlinky.pulumiAws.getLogGroupMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLogGroupResult extends js.Object {
  /**
    * The ARN of the Cloudwatch log group
    */
  val arn: String = js.native
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  val creationTime: Double = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN of the KMS Key to use when encrypting log data.
    */
  val kmsKeyId: String = js.native
  val name: String = js.native
  /**
    * The number of days log events retained in the specified log group.
    */
  val retentionInDays: Double = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetLogGroupResult {
  @scala.inline
  def apply(
    arn: String,
    creationTime: Double,
    id: String,
    kmsKeyId: String,
    name: String,
    retentionInDays: Double,
    tags: StringDictionary[js.Any]
  ): GetLogGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retentionInDays = retentionInDays.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogGroupResult]
  }
  @scala.inline
  implicit class GetLogGroupResultOps[Self <: GetLogGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetentionInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

