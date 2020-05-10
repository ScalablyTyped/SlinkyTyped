package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of logging on a NAT.
  */
@js.native
trait SchemaRouterNatLogConfig extends js.Object {
  /**
    * Indicates whether or not to export logs. This is false by default.
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the desired filtering of logs on this NAT. If unspecified, logs
    * are exported for all connections handled by this NAT.
    */
  var filter: js.UndefOr[String] = js.native
}

object SchemaRouterNatLogConfig {
  @scala.inline
  def apply(): SchemaRouterNatLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNatLogConfig]
  }
  @scala.inline
  implicit class SchemaRouterNatLogConfigOps[Self <: SchemaRouterNatLogConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

