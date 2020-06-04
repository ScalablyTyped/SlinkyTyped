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

trait TextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    @scala.inline
    def setAutoSize(value: Boolean | AutoSizeType): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    @scala.inline
    def setOnPressEnter(value: SyntheticKeyboardEvent[HTMLTextAreaElement] => Unit): Self = this.set("onPressEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPressEnter: Self = this.set("onPressEnter", js.undefined)
    @scala.inline
    def setOnResize(value: /* size */ Height => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

