package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAutoInstallPolicy extends js.Object {
  /**
    * The constraints for auto-installing the app. You can specify a maximum of
    * one constraint.
    */
  var autoInstallConstraint: js.UndefOr[js.Array[SchemaAutoInstallConstraint]] = js.native
  /**
    * The auto-install mode. If unset defaults to &quot;doNotAutoInstall&quot;.
    */
  var autoInstallMode: js.UndefOr[String] = js.native
  /**
    * The priority of the install, as an unsigned integer. A lower number means
    * higher priority.
    */
  var autoInstallPriority: js.UndefOr[Double] = js.native
  /**
    * The minimum version of the app. If a lower version of the app is
    * installed, then the app will be auto-updated according to the
    * auto-install constraints, instead of waiting for the regular auto-update.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
}

object SchemaAutoInstallPolicy {
  @scala.inline
  def apply(): SchemaAutoInstallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallPolicy]
  }
  @scala.inline
  implicit class SchemaAutoInstallPolicyOps[Self <: SchemaAutoInstallPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoInstallConstraint(value: js.Array[SchemaAutoInstallConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInstallConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoInstallMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInstallMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallMode")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoInstallPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInstallPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInstallPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumVersionCode")(js.undefined)
        ret
    }
  }
  
}

