package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTag extends js.Object {
  /**
    * The configuration ID for the item to tag. You can specify a list of keys and values.
    */
  var configurationId: js.UndefOr[ConfigurationId] = js.native
  /**
    * A type of IT asset to tag.
    */
  var configurationType: js.UndefOr[ConfigurationItemType] = js.native
  /**
    * A type of tag on which to filter. For example, serverType.
    */
  var key: js.UndefOr[TagKey] = js.native
  /**
    * The time the configuration tag was created in Coordinated Universal Time (UTC).
    */
  var timeOfCreation: js.UndefOr[js.Date] = js.native
  /**
    * A value on which to filter. For example key = serverType and value = web server.
    */
  var value: js.UndefOr[TagValue] = js.native
}

object ConfigurationTag {
  @scala.inline
  def apply(): ConfigurationTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationTag]
  }
  @scala.inline
  implicit class ConfigurationTagOps[Self <: ConfigurationTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationId(value: ConfigurationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationType(value: ConfigurationItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationType")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: TagKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOfCreation(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOfCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: TagValue): Self = {
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

