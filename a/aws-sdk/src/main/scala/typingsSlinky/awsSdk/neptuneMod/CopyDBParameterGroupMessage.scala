package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBParameterGroupMessage extends js.Object {
  /**
    * The identifier or ARN for the source DB parameter group. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN). Constraints:   Must specify a valid DB parameter group.   Must specify a valid DB parameter group identifier, for example my-db-param-group, or a valid ARN.  
    */
  var SourceDBParameterGroupIdentifier: String = js.native
  /**
    * The tags to be assigned to the copied DB parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A description for the copied DB parameter group.
    */
  var TargetDBParameterGroupDescription: String = js.native
  /**
    * The identifier for the copied DB parameter group. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 letters, numbers, or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: my-db-parameter-group 
    */
  var TargetDBParameterGroupIdentifier: String = js.native
}

object CopyDBParameterGroupMessage {
  @scala.inline
  def apply(
    SourceDBParameterGroupIdentifier: String,
    TargetDBParameterGroupDescription: String,
    TargetDBParameterGroupIdentifier: String
  ): CopyDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(SourceDBParameterGroupIdentifier = SourceDBParameterGroupIdentifier.asInstanceOf[js.Any], TargetDBParameterGroupDescription = TargetDBParameterGroupDescription.asInstanceOf[js.Any], TargetDBParameterGroupIdentifier = TargetDBParameterGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBParameterGroupMessage]
  }
  @scala.inline
  implicit class CopyDBParameterGroupMessageOps[Self <: CopyDBParameterGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceDBParameterGroupIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDBParameterGroupIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDBParameterGroupDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDBParameterGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDBParameterGroupIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDBParameterGroupIdentifier")(value.asInstanceOf[js.Any])
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

