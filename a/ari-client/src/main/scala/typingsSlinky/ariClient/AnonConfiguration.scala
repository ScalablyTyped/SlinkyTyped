package typingsSlinky.ariClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConfiguration extends js.Object {
  var configuration: String = js.native
  var logChannelName: String = js.native
}

object AnonConfiguration {
  @scala.inline
  def apply(configuration: String, logChannelName: String): AnonConfiguration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], logChannelName = logChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfiguration]
  }
  @scala.inline
  implicit class AnonConfigurationOps[Self <: AnonConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogChannelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logChannelName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

