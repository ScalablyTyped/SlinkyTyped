package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestingLevel extends js.Object {
  var bulletAlignment: js.UndefOr[String] = js.native
  var glyphFormat: js.UndefOr[String] = js.native
  var glyphSymbol: js.UndefOr[String] = js.native
  var glyphType: js.UndefOr[String] = js.native
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  var indentStart: js.UndefOr[Dimension] = js.native
  var startNumber: js.UndefOr[Double] = js.native
  var textStyle: js.UndefOr[TextStyle] = js.native
}

object NestingLevel {
  @scala.inline
  def apply(): NestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevel]
  }
  @scala.inline
  implicit class NestingLevelOps[Self <: NestingLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFirstLine(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFirstLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentStart(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStartNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

