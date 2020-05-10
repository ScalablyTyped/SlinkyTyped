package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB cluster parameter group.
    */
  var DBClusterParameterGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB cluster parameter group.
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group family that this DB cluster parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides the customer-specified description for this DB cluster parameter group.
    */
  var Description: js.UndefOr[String] = js.native
}

object DBClusterParameterGroup {
  @scala.inline
  def apply(): DBClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroup]
  }
  @scala.inline
  implicit class DBClusterParameterGroupOps[Self <: DBClusterParameterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterParameterGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDBParameterGroupFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroupFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

