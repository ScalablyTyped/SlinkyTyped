package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OSBackgroundImageLayout extends js.Object {
  var bodyTextColor: String = js.native
  var image: String = js.native
  var titleTextColor: String = js.native
}

object OSBackgroundImageLayout {
  @scala.inline
  def apply(bodyTextColor: String, image: String, titleTextColor: String): OSBackgroundImageLayout = {
    val __obj = js.Dynamic.literal(bodyTextColor = bodyTextColor.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], titleTextColor = titleTextColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSBackgroundImageLayout]
  }
  @scala.inline
  implicit class OSBackgroundImageLayoutOps[Self <: OSBackgroundImageLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

