package typingsSlinky.reactSyntaxHighlighter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactSyntaxHighlighter.lineTagPropsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxHighlighterProps
  extends /* spread */ StringDictionary[js.Any] {
  var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.native
  var customStyle: js.UndefOr[js.Any] = js.native
  var language: js.UndefOr[String] = js.native
  var lineNumberStyle: js.UndefOr[js.Any] = js.native
  var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.native
  var showLineNumbers: js.UndefOr[Boolean] = js.native
  var startingLineNumber: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var useInlineStyles: js.UndefOr[Boolean] = js.native
}

object SyntaxHighlighterProps {
  @scala.inline
  def apply(): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
  @scala.inline
  implicit class SyntaxHighlighterPropsOps[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeTagProps(value: HTMLProps[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTagProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeTagProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTagProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyle")(js.undefined)
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
    def withLineNumberStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumberStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineNumberStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumberStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLinePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineProps")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLineNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLineNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLineNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLineNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingLineNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingLineNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUseInlineStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInlineStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseInlineStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useInlineStyles")(js.undefined)
        ret
    }
  }
  
}

