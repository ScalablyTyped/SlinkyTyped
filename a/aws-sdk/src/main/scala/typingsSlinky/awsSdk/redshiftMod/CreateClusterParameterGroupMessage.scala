package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterParameterGroupMessage extends js.Object {
  /**
    * A description of the parameter group.
    */
  var Description: String = js.native
  /**
    * The Amazon Redshift engine version to which the cluster parameter group applies. The cluster engine version determines the set of parameters. To get a list of valid parameter group family names, you can call DescribeClusterParameterGroups. By default, Amazon Redshift returns a list of all the parameter groups that are owned by your AWS account, including the default parameter groups for each Amazon Redshift engine version. The parameter group family names associated with the default parameter groups provide you the valid values. For example, a valid family name is "redshift-1.0". 
    */
  var ParameterGroupFamily: String = js.native
  /**
    * The name of the cluster parameter group. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique withing your AWS account.    This value is stored as a lower-case string. 
    */
  var ParameterGroupName: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateClusterParameterGroupMessage {
  @scala.inline
  def apply(Description: String, ParameterGroupFamily: String, ParameterGroupName: String): CreateClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ParameterGroupFamily = ParameterGroupFamily.asInstanceOf[js.Any], ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterParameterGroupMessage]
  }
  @scala.inline
  implicit class CreateClusterParameterGroupMessageOps[Self <: CreateClusterParameterGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterGroupFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(value.asInstanceOf[js.Any])
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

