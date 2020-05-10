package typingsSlinky.fabric.fabricImplMod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.fabric.fabricStrings._empty
import typingsSlinky.fabric.fabricStrings.`use-credentials`
import typingsSlinky.fabric.fabricStrings.anonymous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPatternOptions extends js.Object {
  /**
  	 * crossOrigin value (one of "", "anonymous", "use-credentials")
  	 * @see https://developer.mozilla.org/en-US/docs/HTML/CORS_settings_attributes
  	 * @type String
  	 */
  var crossOrigin: js.UndefOr[_empty | anonymous | `use-credentials`] = js.native
  /**
  	 * Pattern horizontal offset from object's left/top corner
  	 */
  var offsetX: js.UndefOr[Double] = js.native
  /**
  	 * Pattern vertical offset from object's left/top corner
  	 */
  var offsetY: js.UndefOr[Double] = js.native
  /**
  	 * Transform matrix to change the pattern, imported from svgs
  	 */
  var patternTransform: js.UndefOr[js.Array[Double]] = js.native
  /**
  	 * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
  	 */
  var repeat: js.UndefOr[String] = js.native
  /**
  	 * The source for the pattern
  	 */
  var source: String | HTMLImageElement = js.native
}

object IPatternOptions {
  @scala.inline
  def apply(source: String | HTMLImageElement): IPatternOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPatternOptions]
  }
  @scala.inline
  implicit class IPatternOptionsOps[Self <: IPatternOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceHTMLImageElement(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String | HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrossOrigin(value: _empty | anonymous | `use-credentials`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withPatternTransform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatternTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
  }
  
}

