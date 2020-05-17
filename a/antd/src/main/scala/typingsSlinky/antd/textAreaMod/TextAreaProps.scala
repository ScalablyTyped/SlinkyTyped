package typingsSlinky.antd.textAreaMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.antd.anon.Height
import typingsSlinky.antd.resizableTextAreaMod.AutoSizeType
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.TextareaHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  var allowClear: js.UndefOr[Boolean] = js.native
  var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.native
  var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object TextAreaProps {
  @scala.inline
  def apply(): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaProps]
  }
  @scala.inline
  implicit class TextAreaPropsOps[Self <: TextAreaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSize(value: Boolean | AutoSizeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPressEnter(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPressEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPressEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* size */ Height => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
  }
  
}

