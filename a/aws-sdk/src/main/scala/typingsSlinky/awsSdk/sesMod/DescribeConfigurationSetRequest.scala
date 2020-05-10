package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationSetRequest extends js.Object {
  /**
    * A list of configuration set attributes to return.
    */
  var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.native
  /**
    * The name of the configuration set to describe.
    */
  var ConfigurationSetName: typingsSlinky.awsSdk.sesMod.ConfigurationSetName = js.native
}

object DescribeConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DescribeConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationSetRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationSetRequestOps[Self <: DescribeConfigurationSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSetName(value: ConfigurationSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationSetAttributeNames(value: ConfigurationSetAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetAttributeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSetAttributeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSetAttributeNames")(js.undefined)
        ret
    }
  }
  
}

