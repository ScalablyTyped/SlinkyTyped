package typingsSlinky.jqueryTimeago

import typingsSlinky.jqueryTimeago.anon.Day
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeagoSetings extends js.Object {
  var allowFuture: js.UndefOr[Boolean] = js.native
  var refreshMillis: js.UndefOr[Double] = js.native
  var strings: js.UndefOr[Day] = js.native
}

object TimeagoSetings {
  @scala.inline
  def apply(): TimeagoSetings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeagoSetings]
  }
  @scala.inline
  implicit class TimeagoSetingsOps[Self <: TimeagoSetings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFuture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFuture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFuture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFuture")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: Day): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
  }
  
}

