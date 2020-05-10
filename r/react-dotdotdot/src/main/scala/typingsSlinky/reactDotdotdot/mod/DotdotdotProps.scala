package typingsSlinky.reactDotdotdot.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactDotdotdot.reactDotdotdotStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotdotdotProps
  extends AllHTMLAttributes[Dotdotdot]
     with ClassAttributes[Dotdotdot] {
  /** Animate clamp */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * The number of lines that should be displayed, a css pixel value for height
    * as a string (i.e. "100px"), or "auto" to try and fill the available space
    */
  var clamp: String | Double | auto = js.native
  /** Split on sentences (periods), hypens, en-dashes, em-dashes, and words */
  var splitOnChars: js.UndefOr[js.Array[String]] = js.native
  /** The type of HTML tag which will wrap the component's content */
  var tagName: js.UndefOr[String] = js.native
  /**
    * The character to insert at the end of the HTML element after trunation is
    * performed.
    */
  var truncationChar: js.UndefOr[String] = js.native
  /** String of HTML to use instead of truncationChar */
  var truncationHTML: js.UndefOr[String] = js.native
  /** Use -webkit-line-clamp available in WebKit (Chrome, Safari) only */
  var useNativeClamp: js.UndefOr[Boolean] = js.native
}

object DotdotdotProps {
  @scala.inline
  def apply(clamp: String | Double | auto): DotdotdotProps = {
    val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotdotdotProps]
  }
  @scala.inline
  implicit class DotdotdotPropsOps[Self <: DotdotdotProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClamp(value: String | Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitOnChars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitOnChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitOnChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitOnChars")(js.undefined)
        ret
    }
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncationChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncationChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationChar")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncationHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncationHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncationHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeClamp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeClamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeClamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeClamp")(js.undefined)
        ret
    }
  }
  
}

