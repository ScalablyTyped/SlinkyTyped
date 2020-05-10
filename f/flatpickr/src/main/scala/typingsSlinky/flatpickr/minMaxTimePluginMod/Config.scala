package typingsSlinky.flatpickr.minMaxTimePluginMod

import typingsSlinky.flatpickr.globalsMod._Global_.Date
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var getTimeLimits: js.UndefOr[js.Function1[/* date */ Date, MinMaxTime]] = js.native
  var table: js.UndefOr[Record[String, MinMaxTime]] = js.native
  var tableDateFormat: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTimeLimits(value: /* date */ Date => MinMaxTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeLimits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetTimeLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withTable(value: Record[String, MinMaxTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableDateFormat")(js.undefined)
        ret
    }
  }
  
}

