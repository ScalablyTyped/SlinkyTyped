package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleDestinationConfiguration extends js.Object {
  /**
    * Configuration of the HTTP URL.
    */
  var httpUrlConfiguration: js.UndefOr[HttpUrlDestinationConfiguration] = js.native
}

object TopicRuleDestinationConfiguration {
  @scala.inline
  def apply(): TopicRuleDestinationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleDestinationConfiguration]
  }
  @scala.inline
  implicit class TopicRuleDestinationConfigurationOps[Self <: TopicRuleDestinationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpUrlConfiguration(value: HttpUrlDestinationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpUrlConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpUrlConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpUrlConfiguration")(js.undefined)
        ret
    }
  }
  
}

