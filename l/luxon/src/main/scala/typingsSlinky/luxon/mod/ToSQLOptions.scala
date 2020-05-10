package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToSQLOptions extends js.Object {
  var includeOffset: js.UndefOr[Boolean] = js.native
  var includeZone: js.UndefOr[Boolean] = js.native
}

object ToSQLOptions {
  @scala.inline
  def apply(): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToSQLOptions]
  }
  @scala.inline
  implicit class ToSQLOptionsOps[Self <: ToSQLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeZone")(js.undefined)
        ret
    }
  }
  
}

