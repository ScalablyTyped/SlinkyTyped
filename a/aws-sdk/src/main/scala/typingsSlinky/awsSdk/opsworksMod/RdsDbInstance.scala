package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsDbInstance extends js.Object {
  /**
    * The instance's address.
    */
  var Address: js.UndefOr[String] = js.native
  /**
    * The DB instance identifier.
    */
  var DbInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var DbPassword: js.UndefOr[String] = js.native
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The instance's database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Set to true if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks Stacks attempts to discover the instance only once. If this value is set to true, you must deregister the instance, and then register it again.
    */
  var MissingOnRds: js.UndefOr[Boolean] = js.native
  /**
    * The instance's ARN.
    */
  var RdsDbInstanceArn: js.UndefOr[String] = js.native
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the stack with which the instance is registered.
    */
  var StackId: js.UndefOr[String] = js.native
}

object RdsDbInstance {
  @scala.inline
  def apply(): RdsDbInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbInstance]
  }
  @scala.inline
  implicit class RdsDbInstanceOps[Self <: RdsDbInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Address")(js.undefined)
        ret
    }
    @scala.inline
    def withDbInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDbPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withDbUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingOnRds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingOnRds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingOnRds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingOnRds")(js.undefined)
        ret
    }
    @scala.inline
    def withRdsDbInstanceArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstanceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRdsDbInstanceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RdsDbInstanceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
  }
  
}

