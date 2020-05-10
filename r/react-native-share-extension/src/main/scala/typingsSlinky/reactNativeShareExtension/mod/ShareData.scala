package typingsSlinky.reactNativeShareExtension.mod

import typingsSlinky.reactNativeShareExtension.reactNativeShareExtensionStrings.imagesSlashAsterisk
import typingsSlinky.reactNativeShareExtension.reactNativeShareExtensionStrings.textSlashplain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareData extends js.Object {
  var `type`: textSlashplain | imagesSlashAsterisk = js.native
  var value: String = js.native
}

object ShareData {
  @scala.inline
  def apply(`type`: textSlashplain | imagesSlashAsterisk, value: String): ShareData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareData]
  }
  @scala.inline
  implicit class ShareDataOps[Self <: ShareData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: textSlashplain | imagesSlashAsterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

