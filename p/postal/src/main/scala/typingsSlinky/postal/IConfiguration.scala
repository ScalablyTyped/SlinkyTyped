package typingsSlinky.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfiguration extends js.Object {
  var DEFAULT_CHANNEL: String = js.native
  var SYSTEM_CHANNEL: String = js.native
  var resolver: IResolver = js.native
}

object IConfiguration {
  @scala.inline
  def apply(DEFAULT_CHANNEL: String, SYSTEM_CHANNEL: String, resolver: IResolver): IConfiguration = {
    val __obj = js.Dynamic.literal(DEFAULT_CHANNEL = DEFAULT_CHANNEL.asInstanceOf[js.Any], SYSTEM_CHANNEL = SYSTEM_CHANNEL.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
  @scala.inline
  implicit class IConfigurationOps[Self <: IConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEFAULT_CHANNEL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CHANNEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSYSTEM_CHANNEL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_CHANNEL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolver(value: IResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

