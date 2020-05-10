package typingsSlinky.antvG2.mod.Styles

import typingsSlinky.antvG2.antvG2Strings.`small-caps`
import typingsSlinky.antvG2.antvG2Strings.bottom
import typingsSlinky.antvG2.antvG2Strings.center
import typingsSlinky.antvG2.antvG2Strings.end
import typingsSlinky.antvG2.antvG2Strings.italic
import typingsSlinky.antvG2.antvG2Strings.left
import typingsSlinky.antvG2.antvG2Strings.middle
import typingsSlinky.antvG2.antvG2Strings.normal
import typingsSlinky.antvG2.antvG2Strings.oblique
import typingsSlinky.antvG2.antvG2Strings.right
import typingsSlinky.antvG2.antvG2Strings.start
import typingsSlinky.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait text extends common {
  var font: js.UndefOr[String] = js.native
  /**
    * 文本字体名称
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * 文本字号大小
    */
  var fontSize: js.UndefOr[String | Double] = js.native
  /**
    * 文本样式
    */
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.native
  /**
    * 文本变体
    */
  var fontVariant: js.UndefOr[normal | `small-caps`] = js.native
  /**
    * 文本粗细
    */
  var fontWeight: js.UndefOr[String | Double] = js.native
  /**
    * 文本旋转角度
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * 文本对齐方向
    */
  var textAlign: js.UndefOr[center | end | left | right | start] = js.native
  /**
    * 文本基准线，默认为`middle`
    */
  var textBaseline: js.UndefOr[top | middle | bottom] = js.native
}

object text {
  @scala.inline
  def apply(): text = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[text]
  }
  @scala.inline
  implicit class textOps[Self <: text] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: normal | italic | oblique): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontVariant(value: normal | `small-caps`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: center | end | left | right | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBaseline(value: top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(js.undefined)
        ret
    }
  }
  
}

