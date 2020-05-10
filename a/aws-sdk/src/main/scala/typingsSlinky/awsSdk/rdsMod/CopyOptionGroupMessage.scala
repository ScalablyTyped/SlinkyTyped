package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptionGroupMessage extends js.Object {
  /**
    * The identifier or ARN for the source option group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon RDS User Guide.  Constraints:   Must specify a valid option group.   If the source option group is in the same AWS Region as the copy, specify a valid option group identifier, for example my-option-group, or a valid ARN.   If the source option group is in a different AWS Region than the copy, specify a valid option group ARN, for example arn:aws:rds:us-west-2:123456789012:og:special-options.  
    */
  var SourceOptionGroupIdentifier: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The description for the copied option group.
    */
  var TargetOptionGroupDescription: String = js.native
  /**
    * The identifier for the copied option group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-option-group 
    */
  var TargetOptionGroupIdentifier: String = js.native
}

object CopyOptionGroupMessage {
  @scala.inline
  def apply(
    SourceOptionGroupIdentifier: String,
    TargetOptionGroupDescription: String,
    TargetOptionGroupIdentifier: String
  ): CopyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(SourceOptionGroupIdentifier = SourceOptionGroupIdentifier.asInstanceOf[js.Any], TargetOptionGroupDescription = TargetOptionGroupDescription.asInstanceOf[js.Any], TargetOptionGroupIdentifier = TargetOptionGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyOptionGroupMessage]
  }
  @scala.inline
  implicit class CopyOptionGroupMessageOps[Self <: CopyOptionGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceOptionGroupIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceOptionGroupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetOptionGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetOptionGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetOptionGroupIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetOptionGroupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

