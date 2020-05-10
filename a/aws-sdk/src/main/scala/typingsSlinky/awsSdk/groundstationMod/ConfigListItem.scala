package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigListItem extends js.Object {
  /**
    * ARN of a Config.
    */
  var configArn: js.UndefOr[ConfigArn] = js.native
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Name of a Config.
    */
  var name: js.UndefOr[String] = js.native
}

object ConfigListItem {
  @scala.inline
  def apply(): ConfigListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigListItem]
  }
  @scala.inline
  implicit class ConfigListItemOps[Self <: ConfigListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigArn(value: ConfigArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigType(value: ConfigCapabilityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
  }
  
}

