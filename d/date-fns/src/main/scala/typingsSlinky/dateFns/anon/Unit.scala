package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.ceil
import typingsSlinky.dateFns.dateFnsStrings.day
import typingsSlinky.dateFns.dateFnsStrings.floor
import typingsSlinky.dateFns.dateFnsStrings.hour
import typingsSlinky.dateFns.dateFnsStrings.minute
import typingsSlinky.dateFns.dateFnsStrings.month
import typingsSlinky.dateFns.dateFnsStrings.round
import typingsSlinky.dateFns.dateFnsStrings.second
import typingsSlinky.dateFns.dateFnsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unit extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[typingsSlinky.dateFns.Locale] = js.native
  var roundingMethod: js.UndefOr[floor | ceil | round] = js.native
  var unit: js.UndefOr[second | minute | hour | day | month | year] = js.native
}

object Unit {
  @scala.inline
  def apply(): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unit]
  }
  @scala.inline
  implicit class UnitOps[Self <: Unit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: typingsSlinky.dateFns.Locale): Self = {
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
    @scala.inline
    def withRoundingMethod(value: floor | ceil | round): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: second | minute | hour | day | month | year): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

