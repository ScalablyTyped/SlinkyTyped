package typingsSlinky.inboxsdk.mod.Router

import typingsSlinky.inboxsdk.mod.Lists.LabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDescriptor extends js.Object {
  var body: String = js.native
  var iconClass: js.UndefOr[String] = js.native
  var iconHtml: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var isRead: String = js.native
  var labels: js.Array[LabelDescriptor] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var routeID: js.UndefOr[String] = js.native
  var routeParams: js.UndefOr[js.Array[String]] = js.native
  var shortDetailText: String = js.native
  var title: String = js.native
}

object RowDescriptor {
  @scala.inline
  def apply(
    body: String,
    isRead: String,
    labels: js.Array[LabelDescriptor],
    shortDetailText: String,
    title: String
  ): RowDescriptor = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], shortDetailText = shortDetailText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDescriptor]
  }
  @scala.inline
  implicit class RowDescriptorOps[Self <: RowDescriptor] (val x: Self) extends AnyVal {
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
    def withIsRead(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[LabelDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDetailText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDetailText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIconHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeID")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteParams(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeParams")(js.undefined)
        ret
    }
  }
  
}

