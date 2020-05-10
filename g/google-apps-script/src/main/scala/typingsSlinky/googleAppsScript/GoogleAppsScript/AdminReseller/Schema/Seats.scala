package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Seats extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var licensedNumberOfSeats: js.UndefOr[Double] = js.native
  var maximumNumberOfSeats: js.UndefOr[Double] = js.native
  var numberOfSeats: js.UndefOr[Double] = js.native
}

object Seats {
  @scala.inline
  def apply(): Seats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seats]
  }
  @scala.inline
  implicit class SeatsOps[Self <: Seats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLicensedNumberOfSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedNumberOfSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicensedNumberOfSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensedNumberOfSeats")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumNumberOfSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumNumberOfSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfSeats")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfSeats(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSeats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfSeats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSeats")(js.undefined)
        ret
    }
  }
  
}

