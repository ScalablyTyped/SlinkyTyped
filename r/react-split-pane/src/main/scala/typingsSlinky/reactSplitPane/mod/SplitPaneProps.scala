package typingsSlinky.reactSplitPane.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.first
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.horizontal
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.second
import typingsSlinky.reactSplitPane.reactSplitPaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitPaneProps extends js.Object {
  var allowResize: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultSize: js.UndefOr[Size] = js.native
  var maxSize: js.UndefOr[Size] = js.native
  var minSize: js.UndefOr[Size] = js.native
  var onChange: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.native
  var onDragFinished: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.native
  var onDragStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var onResizerClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var pane1Style: js.UndefOr[CSSProperties] = js.native
  var pane2Style: js.UndefOr[CSSProperties] = js.native
  var paneStyle: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[first | second] = js.native
  var resizerClassName: js.UndefOr[String] = js.native
  var resizerStyle: js.UndefOr[CSSProperties] = js.native
  var size: js.UndefOr[Size] = js.native
  var split: js.UndefOr[vertical | horizontal] = js.native
  var step: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SplitPaneProps {
  @scala.inline
  def apply(): SplitPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitPaneProps]
  }
  @scala.inline
  implicit class SplitPanePropsOps[Self <: SplitPaneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResize")(js.undefined)
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
    def withDefaultSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* newSize */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragFinished(value: /* newSize */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragFinished")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragFinished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragFinished")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStarted(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDragStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizerClick(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizerDoubleClick(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizerDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizerDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizerDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPane1Style(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane1Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane1Style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane1Style")(js.undefined)
        ret
    }
    @scala.inline
    def withPane2Style(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane2Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane2Style: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane2Style")(js.undefined)
        ret
    }
    @scala.inline
    def withPaneStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaneStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paneStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: first | second): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(js.undefined)
        ret
    }
    @scala.inline
    def withResizerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withResizerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
  }
  
}

