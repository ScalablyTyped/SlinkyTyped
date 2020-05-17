package typingsSlinky.reResizable.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.reResizable.anon.X
import typingsSlinky.reResizable.reResizableStrings.parent
import typingsSlinky.reResizable.reResizableStrings.window
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizableProps extends js.Object {
  var bounds: js.UndefOr[parent | window | HTMLElement] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultSize: js.UndefOr[Size] = js.native
  var enable: js.UndefOr[Enable] = js.native
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var handleClasses: js.UndefOr[HandleClassName] = js.native
  var handleComponent: js.UndefOr[HandleComponent] = js.native
  var handleStyles: js.UndefOr[HandleStyles] = js.native
  var handleWrapperClass: js.UndefOr[String] = js.native
  var handleWrapperStyle: js.UndefOr[CSSProperties] = js.native
  var lockAspectRatio: js.UndefOr[Boolean | Double] = js.native
  var lockAspectRatioExtraHeight: js.UndefOr[Double] = js.native
  var lockAspectRatioExtraWidth: js.UndefOr[Double] = js.native
  var maxHeight: js.UndefOr[String | Double] = js.native
  var maxWidth: js.UndefOr[String | Double] = js.native
  var minHeight: js.UndefOr[String | Double] = js.native
  var minWidth: js.UndefOr[String | Double] = js.native
  var onResize: js.UndefOr[ResizeCallback] = js.native
  var onResizeStart: js.UndefOr[ResizeStartCallback] = js.native
  var onResizeStop: js.UndefOr[ResizeCallback] = js.native
  var resizeRatio: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Size] = js.native
  var snap: js.UndefOr[X] = js.native
  var snapGap: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ResizableProps {
  @scala.inline
  def apply(): ResizableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizableProps]
  }
  @scala.inline
  implicit class ResizablePropsOps[Self <: ResizableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundsHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: parent | window | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
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
    def withEnable(value: Enable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClasses(value: HandleClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleComponent(value: HandleComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleStyles(value: HandleStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWrapperClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWrapperStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatio(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatioExtraHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatioExtraHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLockAspectRatioExtraWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockAspectRatioExtraWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockAspectRatioExtraWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
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
    def withOnResize(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStart(
      value: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction, /* elementRef */ HTMLDivElement) => Unit | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStop(
      value: (/* event */ MouseEvent | TouchEvent, /* direction */ Direction, /* elementRef */ HTMLDivElement, /* delta */ NumberSize) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
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
    def withSnap(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapGap")(js.undefined)
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

