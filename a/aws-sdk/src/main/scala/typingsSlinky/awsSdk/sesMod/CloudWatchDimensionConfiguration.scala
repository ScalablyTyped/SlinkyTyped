package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchDimensionConfiguration extends js.Object {
  /**
    * The default value of the dimension that is published to Amazon CloudWatch if you do not provide the value of the dimension when you send an email. The default value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var DefaultDimensionValue: typingsSlinky.awsSdk.sesMod.DefaultDimensionValue = js.native
  /**
    * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.  
    */
  var DimensionName: typingsSlinky.awsSdk.sesMod.DimensionName = js.native
  /**
    * The place where Amazon SES finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon SES to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose messageTag. If you want Amazon SES to use your own email headers, choose emailHeader.
    */
  var DimensionValueSource: typingsSlinky.awsSdk.sesMod.DimensionValueSource = js.native
}

object CloudWatchDimensionConfiguration {
  @scala.inline
  def apply(
    DefaultDimensionValue: DefaultDimensionValue,
    DimensionName: DimensionName,
    DimensionValueSource: DimensionValueSource
  ): CloudWatchDimensionConfiguration = {
    val __obj = js.Dynamic.literal(DefaultDimensionValue = DefaultDimensionValue.asInstanceOf[js.Any], DimensionName = DimensionName.asInstanceOf[js.Any], DimensionValueSource = DimensionValueSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDimensionConfiguration]
  }
  @scala.inline
  implicit class CloudWatchDimensionConfigurationOps[Self <: CloudWatchDimensionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDimensionValue(value: DefaultDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionName(value: DimensionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DimensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionValueSource(value: DimensionValueSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DimensionValueSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

