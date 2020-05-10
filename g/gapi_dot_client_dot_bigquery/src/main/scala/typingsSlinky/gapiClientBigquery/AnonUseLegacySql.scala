package typingsSlinky.gapiClientBigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUseLegacySql extends js.Object {
  /** True if view is defined in legacy SQL dialect, false if in standard SQL. */
  var useLegacySql: js.UndefOr[Boolean] = js.native
}

object AnonUseLegacySql {
  @scala.inline
  def apply(): AnonUseLegacySql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUseLegacySql]
  }
  @scala.inline
  implicit class AnonUseLegacySqlOps[Self <: AnonUseLegacySql] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseLegacySql(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacySql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLegacySql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLegacySql")(js.undefined)
        ret
    }
  }
  
}

