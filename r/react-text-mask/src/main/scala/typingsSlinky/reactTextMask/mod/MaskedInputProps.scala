package typingsSlinky.reactTextMask.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.reactTextMask.anon.IndexesOfPipedChars
import typingsSlinky.reactTextMask.reactTextMaskBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskedInputProps extends InputHTMLAttributes[HTMLInputElement] {
  var guide: js.UndefOr[Boolean] = js.native
  var keepCharPositions: js.UndefOr[Boolean] = js.native
  var mask: js.UndefOr[maskArray | (js.Function1[/* value */ String, maskArray])] = js.native
  var pipe: js.UndefOr[
    js.Function2[
      /* conformedValue */ String, 
      /* config */ js.Any, 
      `false` | String | IndexesOfPipedChars
    ]
  ] = js.native
  var placeholderChar: js.UndefOr[String] = js.native
  var render: js.UndefOr[
    js.Function2[/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any, _]
  ] = js.native
  var showMask: js.UndefOr[Boolean] = js.native
}

object MaskedInputProps {
  @scala.inline
  def apply(): MaskedInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskedInputProps]
  }
  @scala.inline
  implicit class MaskedInputPropsOps[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCharPositions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCharPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCharPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCharPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskFunction1(value: /* value */ String => maskArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMask(value: maskArray | (js.Function1[/* value */ String, maskArray])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withPipe(
      value: (/* conformedValue */ String, /* config */ js.Any) => `false` | String | IndexesOfPipedChars
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderChar")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: (/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMask")(js.undefined)
        ret
    }
  }
  
}

