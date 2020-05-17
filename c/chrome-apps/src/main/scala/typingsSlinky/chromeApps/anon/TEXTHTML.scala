package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.textHtml
import typingsSlinky.chromeApps.chromeAppsStrings.textPlain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TEXTHTML extends js.Object {
  var TEXT_HTML: textHtml = js.native
  var TEXT_PLAIN: textPlain = js.native
}

object TEXTHTML {
  @scala.inline
  def apply(TEXT_HTML: textHtml, TEXT_PLAIN: textPlain): TEXTHTML = {
    val __obj = js.Dynamic.literal(TEXT_HTML = TEXT_HTML.asInstanceOf[js.Any], TEXT_PLAIN = TEXT_PLAIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TEXTHTML]
  }
  @scala.inline
  implicit class TEXTHTMLOps[Self <: TEXTHTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTEXT_HTML(value: textHtml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_HTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEXT_PLAIN(value: textPlain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEXT_PLAIN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

