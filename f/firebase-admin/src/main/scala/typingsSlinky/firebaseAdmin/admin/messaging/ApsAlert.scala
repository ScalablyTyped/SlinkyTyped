package typingsSlinky.firebaseAdmin.admin.messaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApsAlert extends js.Object {
  var actionLocKey: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var launchImage: js.UndefOr[String] = js.native
  var locArgs: js.UndefOr[js.Array[String]] = js.native
  var locKey: js.UndefOr[String] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var subtitleLocArgs: js.UndefOr[js.Array[String]] = js.native
  var subtitleLocKey: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titleLocArgs: js.UndefOr[js.Array[String]] = js.native
  var titleLocKey: js.UndefOr[String] = js.native
}

object ApsAlert {
  @scala.inline
  def apply(): ApsAlert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApsAlert]
  }
  @scala.inline
  implicit class ApsAlertOps[Self <: ApsAlert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionLocKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionLocKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchImage")(js.undefined)
        ret
    }
    @scala.inline
    def withLocArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locKey")(js.undefined)
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
    def withSubtitleLocArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLocArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLocArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitleLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLocKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitleLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitleLocKey")(js.undefined)
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
    def withTitleLocArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLocArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLocKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLocKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLocKey")(js.undefined)
        ret
    }
  }
  
}

