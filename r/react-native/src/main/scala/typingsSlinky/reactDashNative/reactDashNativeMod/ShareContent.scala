package typingsSlinky.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareContent extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ShareContent {
  @scala.inline
  def apply(message: String = null, title: String = null, url: String = null): ShareContent = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}

