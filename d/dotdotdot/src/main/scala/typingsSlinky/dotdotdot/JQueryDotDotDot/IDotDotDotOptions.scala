package typingsSlinky.dotdotdot.JQueryDotDotDot

import typingsSlinky.dotdotdot.JQuery
import typingsSlinky.dotdotdot.dotdotdotStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDotDotDotOptions extends js.Object {
  /** jQuery-selector for the element to keep and put after the ellipsis.
    * Default: null
    */
  var after: js.UndefOr[String | JQuery] = js.native
   //
  /** Callback function that is fired after the ellipsis is added,
    * receives two parameters:
    * @param isTruncated (boolean)
    * @param orgContent (string) Documentation says it is string but it is object
    *        which has e.g.
    *                 context: HTMLHtmlElement;
    *                 length: number; // seems to be always 1
    *                 [index] // this contains the text: orgContent[0].data
    */
  var callback: js.UndefOr[js.Function2[/* isTruncated */ Boolean, /* orgContent */ js.Any, Unit]] = js.native
  /**	The text to add as ellipsis.
    * Default: '... '
    */
  var ellipsis: js.UndefOr[String] = js.native
  /** Wrap-option fallback to 'letter' for long words
    * Default: true
    */
  var fallbackToLetter: js.UndefOr[Boolean] = js.native
  /** Optionally set a max-height, if null, the height will be measured.
    * Default: null
    */
  var height: js.UndefOr[Double] = js.native
  var lastCharacter: js.UndefOr[IDotDotDotOptionsLastCharacter] = js.native
  /** Deviation for the height-option.
    * Default: 0
    */
  var tolerance: js.UndefOr[Double] = js.native
  /** Whether to update the ellipsis: true/'window'
    * Default: false
    */
  var watch: js.UndefOr[Boolean | window] = js.native
  /** How to cut off the text/html: 'word'/'letter'/'children'
    * Default: 'word'
    */
  var wrap: js.UndefOr[String] = js.native
}

object IDotDotDotOptions {
  @scala.inline
  def apply(): IDotDotDotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDotDotDotOptions]
  }
  @scala.inline
  implicit class IDotDotDotOptionsOps[Self <: IDotDotDotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: String | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: (/* isTruncated */ Boolean, /* orgContent */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackToLetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackToLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackToLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackToLetter")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLastCharacter(value: IDotDotDotOptionsLastCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean | window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
  }
  
}

