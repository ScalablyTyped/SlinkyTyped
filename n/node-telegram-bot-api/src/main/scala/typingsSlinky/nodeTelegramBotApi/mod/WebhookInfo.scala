package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookInfo extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[String]] = js.native
  var has_custom_certificate: Boolean = js.native
  var last_error_date: js.UndefOr[Double] = js.native
  var last_error_message: js.UndefOr[String] = js.native
  var max_connections: js.UndefOr[Double] = js.native
  var pending_update_count: Double = js.native
  var url: String = js.native
}

object WebhookInfo {
  @scala.inline
  def apply(has_custom_certificate: Boolean, pending_update_count: Double, url: String): WebhookInfo = {
    val __obj = js.Dynamic.literal(has_custom_certificate = has_custom_certificate.asInstanceOf[js.Any], pending_update_count = pending_update_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookInfo]
  }
  @scala.inline
  implicit class WebhookInfoOps[Self <: WebhookInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_custom_certificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_custom_certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending_update_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_update_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowed_updates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_updates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_updates")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_error_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_error_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_date")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_error_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_error_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_error_message")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_connections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_connections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_connections")(js.undefined)
        ret
    }
  }
  
}

