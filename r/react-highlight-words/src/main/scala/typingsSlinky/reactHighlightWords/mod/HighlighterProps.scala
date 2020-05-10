package typingsSlinky.reactHighlightWords.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlighterProps
  extends /** Allows to pass through any parameter to wrapped component */
/* index */ StringDictionary[js.Any] {
  /** The class name to be applied to an active match. Use along with activeIndex */
  var activeClassName: js.UndefOr[String] = js.native
  /** Specify the match index that should be actively highlighted. Use along with activeClassName */
  var activeIndex: js.UndefOr[Double] = js.native
  /** The inline style to be applied to an active match. Use along with activeIndex */
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  /** Escape characters in searchWords which are meaningful in regular expressions */
  var autoEscape: js.UndefOr[Boolean] = js.native
  /** Search should be case sensitive; defaults to false */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** CSS class name applied to the outer/wrapper <span> */
  var className: js.UndefOr[String] = js.native
  /**
    * Use a custom function to search for matching chunks. This makes it possible to use arbitrary logic
    * when looking for matches. See the default findChunks function in highlight-words-core for signature.
    * Have a look at the custom findChunks example on how to use it.
    */
  var findChunks: js.UndefOr[js.Function1[/* options */ FindChunks, js.Array[Chunk]]] = js.native
  /** CSS class name applied to highlighted text */
  var highlightClassName: js.UndefOr[String] = js.native
  /** Inline styles applied to highlighted text */
  var highlightStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Type of tag to wrap around highlighted matches; defaults to mark but can also be a React element
    * (class or functional)
    */
  var highlightTag: js.UndefOr[String | ReactComponentClass[_]] = js.native
  /**
    * Process each search word and text to highlight before comparing (eg remove accents); signature
    * (text: string): string
    */
  var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  /** Array of search words. The search terms are treated as RegExps unless autoEscape is set. */
  var searchWords: js.Array[String] = js.native
  /** Text to highlight matches in */
  var textToHighlight: String = js.native
  /** CSS class name applied to unhighlighted text */
  var unhighlightClassName: js.UndefOr[String] = js.native
  /** Inline styles applied to unhighlighted text */
  var unhighlightStyle: js.UndefOr[CSSProperties] = js.native
}

object HighlighterProps {
  @scala.inline
  def apply(searchWords: js.Array[String], textToHighlight: String): HighlighterProps = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlighterProps]
  }
  @scala.inline
  implicit class HighlighterPropsOps[Self <: HighlighterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextToHighlight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withFindChunks(value: /* options */ FindChunks => js.Array[Chunk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChunks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFindChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightTagFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightTagComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightTag(value: String | ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightTag")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitize(value: /* text */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhighlightClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlightClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnhighlightClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlightClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withUnhighlightStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnhighlightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhighlightStyle")(js.undefined)
        ret
    }
  }
  
}

