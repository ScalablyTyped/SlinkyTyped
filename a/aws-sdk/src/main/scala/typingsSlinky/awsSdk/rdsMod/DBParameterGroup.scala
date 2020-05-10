package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBParameterGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB parameter group.
    */
  var DBParameterGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group family that this DB parameter group is compatible with.
    */
  var DBParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * Provides the name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the customer-specified description for this DB parameter group.
    */
  var Description: js.UndefOr[String] = js.native
}

object DBParameterGroup {
  @scala.inline
  def apply(): DBParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroup]
  }
  @scala.inline
  implicit class DBParameterGroupOps[Self <: DBParameterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBParameterGroupArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupArn")(js.undefined)
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
    def withDBParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroupName")(js.undefined)
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

