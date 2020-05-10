package typingsSlinky.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationAlertOptions extends js.Object {
  var `action-loc-key`: js.UndefOr[String] = js.native
  var body: String = js.native
  var `launch-image`: js.UndefOr[String] = js.native
  var `loc-args`: js.UndefOr[js.Array[String]] = js.native
  var `loc-key`: js.UndefOr[String] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `title-loc-args`: js.UndefOr[js.Array[String]] = js.native
  var `title-loc-key`: js.UndefOr[String] = js.native
}

object NotificationAlertOptions {
  @scala.inline
  def apply(body: String): NotificationAlertOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAlertOptions]
  }
  @scala.inline
  implicit class NotificationAlertOptionsOps[Self <: NotificationAlertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAction-loc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action-loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAction-loc-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action-loc-key")(js.undefined)
        ret
    }
    @scala.inline
    def `withLaunch-image`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch-image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLaunch-image`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launch-image")(js.undefined)
        ret
    }
    @scala.inline
    def `withLoc-args`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLoc-args`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-args")(js.undefined)
        ret
    }
    @scala.inline
    def `withLoc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLoc-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc-key")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def `withTitle-loc-args`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTitle-loc-args`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-args")(js.undefined)
        ret
    }
    @scala.inline
    def `withTitle-loc-key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTitle-loc-key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title-loc-key")(js.undefined)
        ret
    }
  }
  
}

