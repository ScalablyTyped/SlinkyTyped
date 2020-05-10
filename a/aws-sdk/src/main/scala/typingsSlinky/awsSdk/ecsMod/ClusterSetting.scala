package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSetting extends js.Object {
  /**
    * The name of the cluster setting. The only supported value is containerInsights.
    */
  var name: js.UndefOr[ClusterSettingName] = js.native
  /**
    * The value to set for the cluster setting. The supported values are enabled and disabled. If enabled is specified, CloudWatch Container Insights will be enabled for the cluster, otherwise it will be disabled unless the containerInsights account setting is enabled. If a cluster value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var value: js.UndefOr[String] = js.native
}

object ClusterSetting {
  @scala.inline
  def apply(): ClusterSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSetting]
  }
  @scala.inline
  implicit class ClusterSettingOps[Self <: ClusterSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ClusterSettingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

