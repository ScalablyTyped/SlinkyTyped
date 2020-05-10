package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigResponse extends js.Object {
  /**
    * ARN of a Config 
    */
  var configArn: ConfigArn = js.native
  /**
    * Data elements in a Config.
    */
  var configData: ConfigTypeData = js.native
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Name of a Config.
    */
  var name: String = js.native
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object GetConfigResponse {
  @scala.inline
  def apply(configArn: ConfigArn, configData: ConfigTypeData, configId: String, name: String): GetConfigResponse = {
    val __obj = js.Dynamic.literal(configArn = configArn.asInstanceOf[js.Any], configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigResponse]
  }
  @scala.inline
  implicit class GetConfigResponseOps[Self <: GetConfigResponse] (val x: Self) extends AnyVal {
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
    def withConfigData(value: ConfigTypeData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withTags(value: TagsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

