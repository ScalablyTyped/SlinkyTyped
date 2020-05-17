package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings to define a hyperlink.
  */
@js.native
trait HyperlinkSettings extends js.Object {
  /**
    * Specifies a hyperlink's bookmark.
    */
  var bookmark: String = js.native
  /**
    * Specifies a hyperlink text.
    */
  var text: String = js.native
  /**
    * Specifies a tooltip text.
    */
  var tooltip: String = js.native
  /**
    * Specifies a hyperlink's destination.
    */
  var url: String = js.native
}

object HyperlinkSettings {
  @scala.inline
  def apply(bookmark: String, text: String, tooltip: String, url: String): HyperlinkSettings = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkSettings]
  }
  @scala.inline
  implicit class HyperlinkSettingsOps[Self <: HyperlinkSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBookmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

