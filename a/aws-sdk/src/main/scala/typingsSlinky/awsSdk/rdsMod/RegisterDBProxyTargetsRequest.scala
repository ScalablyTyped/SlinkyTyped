package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDBProxyTargetsRequest extends js.Object {
  /**
    * One or more DB cluster identifiers.
    */
  var DBClusterIdentifiers: js.UndefOr[StringList] = js.native
  /**
    * One or more DB instance identifiers.
    */
  var DBInstanceIdentifiers: js.UndefOr[StringList] = js.native
  /**
    * The identifier of the DBProxy that is associated with the DBProxyTargetGroup.
    */
  var DBProxyName: String = js.native
  /**
    * The identifier of the DBProxyTargetGroup.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
}

object RegisterDBProxyTargetsRequest {
  @scala.inline
  def apply(DBProxyName: String): RegisterDBProxyTargetsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDBProxyTargetsRequest]
  }
  @scala.inline
  implicit class RegisterDBProxyTargetsRequestOps[Self <: RegisterDBProxyTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBProxyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBProxyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBClusterIdentifiers(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceIdentifiers(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGroupName")(js.undefined)
        ret
    }
  }
  
}

