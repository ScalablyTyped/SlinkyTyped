package typingsSlinky.cleanCss.mod

import typingsSlinky.cleanCss.AnonAfterAtRule
import typingsSlinky.cleanCss.AnonAroundSelectorRelation
import typingsSlinky.cleanCss.cleanCssBooleans.`false`
import typingsSlinky.cleanCss.cleanCssStrings.space
import typingsSlinky.cleanCss.cleanCssStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained options for configuring the CSS formatting
  */
@js.native
trait FormatOptions extends js.Object {
  /**
    * Controls the new line character, can be `'\r\n'` or `'\n'`(aliased as `'windows'` and `'unix'`
    * or `'crlf'` and `'lf'`); defaults to system one, so former on Windows and latter on Unix
    */
  var breakWith: js.UndefOr[String] = js.native
  /**
    *  Controls where to insert breaks
    */
  var breaks: js.UndefOr[AnonAfterAtRule] = js.native
  /**
    * Controls number of characters to indent with; defaults to `0`
    */
  var indentBy: js.UndefOr[Double] = js.native
  /**
    * Controls a character to indent with, can be `'space'` or `'tab'`; defaults to `'space'`
    */
  var indentWith: js.UndefOr[space | tab] = js.native
  /**
    * Controls where to insert spaces
    */
  var spaces: js.UndefOr[AnonAroundSelectorRelation] = js.native
  /**
    * Controls maximum line length; defaults to `false`
    */
  var wrapAt: js.UndefOr[`false` | Double] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWith")(js.undefined)
        ret
    }
    @scala.inline
    def withBreaks(value: AnonAfterAtRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaks")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentBy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentBy")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentWith(value: space | tab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentWith")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaces(value: AnonAroundSelectorRelation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAt(value: `false` | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAt")(js.undefined)
        ret
    }
  }
  
}

