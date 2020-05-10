package typingsSlinky.reactInputAutosize.mod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosizeInputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement] {
  var inputClassName: js.UndefOr[String] = js.native
  var inputRef: js.UndefOr[js.Function1[/* instance */ HTMLInputElement | Null, Unit]] = js.native
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  var minWidth: js.UndefOr[String | Double] = js.native
  var onAutosize: js.UndefOr[js.Function1[/* inputWidth */ String | Double, Unit]] = js.native
  var placeholderIsMinWidth: js.UndefOr[Boolean] = js.native
}

object AutosizeInputProps {
  @scala.inline
  def apply(): AutosizeInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutosizeInputProps]
  }
  @scala.inline
  implicit class AutosizeInputPropsOps[Self <: AutosizeInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputRef(value: /* instance */ HTMLInputElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInputRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAutosize(value: /* inputWidth */ String | Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutosize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAutosize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutosize")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderIsMinWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderIsMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderIsMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderIsMinWidth")(js.undefined)
        ret
    }
  }
  
}

