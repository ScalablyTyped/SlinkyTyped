package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Y
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableBaseOptions[T] extends DOMComponentOptions[T] {
  /** Enables automatic scrolling while dragging an item beyond the viewport. */
  var autoScroll: js.UndefOr[Boolean] = js.native
  /** Specifies a DOM element that limits the dragging area. */
  var boundary: js.UndefOr[String | Element | JQuery] = js.native
  /** Specifies a custom container in which the draggable item should be rendered. */
  var container: js.UndefOr[String | Element | JQuery] = js.native
  /** Specifies the cursor offset from the dragged item. */
  var cursorOffset: js.UndefOr[String | Y] = js.native
  /** A container for custom data. */
  var data: js.UndefOr[js.Any] = js.native
  /** Specifies the directions in which an item can be dragged. */
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.native
  /** Allows you to group several widgets, so that users can drag and drop items between them. */
  var group: js.UndefOr[String] = js.native
  /** Specifies a CSS selector (ID or class) that should act as the drag handle(s) for the item(s). */
  var handle: js.UndefOr[String] = js.native
  /** Specifies the distance in pixels from the edge of viewport at which scrolling should start. Applies only if autoScroll is true. */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /** Specifies the scrolling speed when dragging an item beyond the viewport. Applies only if autoScroll is true. */
  var scrollSpeed: js.UndefOr[Double] = js.native
}

object DraggableBaseOptions {
  @scala.inline
  def apply[T](): DraggableBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableBaseOptions[T]]
  }
  @scala.inline
  implicit class DraggableBaseOptionsOps[Self[t] <: DraggableBaseOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAutoScroll(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScroll: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | Element | JQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorOffset(value: String | Y): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorOffset: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDirection(value: both | horizontal | vertical): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDirection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSensitivity(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSensitivity: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
  }
  
}

