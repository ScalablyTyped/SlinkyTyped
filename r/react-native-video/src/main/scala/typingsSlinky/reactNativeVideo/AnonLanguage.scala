package typingsSlinky.reactNativeVideo

import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.`applicationSlashx-subrip`
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.applicationSlashttmlPlussignxml
import typingsSlinky.reactNativeVideo.reactNativeVideoStrings.textSlashvtt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLanguage extends js.Object {
  var language: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt = js.native
  var uri: String = js.native
}

object AnonLanguage {
  @scala.inline
  def apply(`type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt, uri: String): AnonLanguage = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLanguage]
  }
  @scala.inline
  implicit class AnonLanguageOps[Self <: AnonLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
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
  }
  
}

