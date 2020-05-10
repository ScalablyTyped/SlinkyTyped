package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The auto-install constraint. Defines a set of restrictions for
  * installation. At least one of the fields must be set.
  */
@js.native
trait SchemaAutoInstallConstraint extends js.Object {
  /**
    * Charging state constraint.
    */
  var chargingStateConstraint: js.UndefOr[String] = js.native
  /**
    * Device idle state constraint.
    */
  var deviceIdleStateConstraint: js.UndefOr[String] = js.native
  /**
    * Network type constraint.
    */
  var networkTypeConstraint: js.UndefOr[String] = js.native
}

object SchemaAutoInstallConstraint {
  @scala.inline
  def apply(): SchemaAutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallConstraint]
  }
  @scala.inline
  implicit class SchemaAutoInstallConstraintOps[Self <: SchemaAutoInstallConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChargingStateConstraint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargingStateConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChargingStateConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chargingStateConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceIdleStateConstraint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdleStateConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIdleStateConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdleStateConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkTypeConstraint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTypeConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkTypeConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkTypeConstraint")(js.undefined)
        ret
    }
  }
  
}

