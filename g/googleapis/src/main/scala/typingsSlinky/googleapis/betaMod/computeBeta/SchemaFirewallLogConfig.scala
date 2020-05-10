package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available logging options for a firewall rule.
  */
@js.native
trait SchemaFirewallLogConfig extends js.Object {
  /**
    * This field denotes whether to enable logging for a particular firewall
    * rule.
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object SchemaFirewallLogConfig {
  @scala.inline
  def apply(): SchemaFirewallLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFirewallLogConfig]
  }
  @scala.inline
  implicit class SchemaFirewallLogConfigOps[Self <: SchemaFirewallLogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
  }
  
}

