package typingsSlinky.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancelledby extends js.Object {
  var cancelled_by: js.UndefOr[String] = js.native
  var cancelled_date: js.UndefOr[String] = js.native
  var created_by: js.UndefOr[String] = js.native
  var created_date: js.UndefOr[String] = js.native
  var first_sent_date: js.UndefOr[String] = js.native
  var last_sent_by: js.UndefOr[String] = js.native
  var last_sent_date: js.UndefOr[String] = js.native
  var last_updated_by: js.UndefOr[String] = js.native
  var last_updated_date: js.UndefOr[String] = js.native
  var payer_view_url: js.UndefOr[String] = js.native
}

object Cancelledby {
  @scala.inline
  def apply(): Cancelledby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelledby]
  }
  @scala.inline
  implicit class CancelledbyOps[Self <: Cancelledby] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelled_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_by")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_date")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_by")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_date")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_sent_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_sent_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_sent_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_sent_date")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_sent_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_sent_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_sent_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_sent_by")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_sent_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_sent_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_sent_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_sent_date")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_updated_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_updated_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated_by")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_updated_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_updated_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_updated_date")(js.undefined)
        ret
    }
    @scala.inline
    def withPayer_view_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_view_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayer_view_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer_view_url")(js.undefined)
        ret
    }
  }
  
}

