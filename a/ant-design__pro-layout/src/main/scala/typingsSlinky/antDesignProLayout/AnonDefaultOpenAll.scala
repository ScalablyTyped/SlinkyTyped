package typingsSlinky.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultOpenAll extends js.Object {
  var defaultOpenAll: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[Boolean] = js.native
}

object AnonDefaultOpenAll {
  @scala.inline
  def apply(): AnonDefaultOpenAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultOpenAll]
  }
  @scala.inline
  implicit class AnonDefaultOpenAllOps[Self <: AnonDefaultOpenAll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultOpenAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpenAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenAll")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

