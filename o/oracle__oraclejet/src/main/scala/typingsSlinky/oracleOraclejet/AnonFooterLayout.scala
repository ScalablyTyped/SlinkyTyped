package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings._empty
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.focus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.image
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFooterLayout extends js.Object {
  var footerLayout: _empty | now = js.native
  var showOn: focus | image = js.native
  var timeIncrement: String = js.native
}

object AnonFooterLayout {
  @scala.inline
  def apply(footerLayout: _empty | now, showOn: focus | image, timeIncrement: String): AnonFooterLayout = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFooterLayout]
  }
  @scala.inline
  implicit class AnonFooterLayoutOps[Self <: AnonFooterLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFooterLayout(value: _empty | now): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOn(value: focus | image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeIncrement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeIncrement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

