package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.indicate
import typingsSlinky.devextreme.devextremeStrings.push
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowDropInsideItem extends js.Object {
  var allowDropInsideItem: js.UndefOr[Boolean] = js.native
  var allowReordering: js.UndefOr[Boolean] = js.native
  var autoScroll: js.UndefOr[Boolean] = js.native
  var boundary: js.UndefOr[String | org.scalajs.dom.raw.Element | JQuery] = js.native
  var container: js.UndefOr[String | org.scalajs.dom.raw.Element | JQuery] = js.native
  var cursorOffset: js.UndefOr[String | Y] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.native
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | org.scalajs.dom.raw.Element | JQuery
    ])
  ] = js.native
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.native
  var filter: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var handle: js.UndefOr[String] = js.native
  var onAdd: js.UndefOr[js.Function1[/* e */ DropInsideItem, _]] = js.native
  var onDragChange: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  var onDragMove: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromData, _]] = js.native
  var onRemove: js.UndefOr[js.Function1[/* e */ FromIndex, _]] = js.native
  var onReorder: js.UndefOr[js.Function1[/* e */ DropInsideItem, _]] = js.native
  var scrollSensitivity: js.UndefOr[Double] = js.native
  var scrollSpeed: js.UndefOr[Double] = js.native
  var showDragIcons: js.UndefOr[Boolean] = js.native
}

object AllowDropInsideItem {
  @scala.inline
  def apply(): AllowDropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDropInsideItem]
  }
  @scala.inline
  implicit class AllowDropInsideItemOps[Self <: AllowDropInsideItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDropInsideItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropInsideItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDropInsideItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDropInsideItem")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundary(value: String | org.scalajs.dom.raw.Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | org.scalajs.dom.raw.Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorOffset(value: String | Y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDragDirection(value: both | horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTemplateFunction2(
      value: (/* dragInfo */ ItemDataItemElement, /* containerElement */ dxElement) => String | org.scalajs.dom.raw.Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ ItemDataItemElement, 
          /* containerElement */ dxElement, 
          String | org.scalajs.dom.raw.Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDropFeedbackMode(value: push | indicate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropFeedbackMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropFeedbackMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropFeedbackMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: /* e */ DropInsideItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragChange(value: /* e */ FromComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* e */ FromComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragMove(value: /* e */ FromComponent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* e */ FromData => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: /* e */ FromIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReorder(value: /* e */ DropInsideItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReorder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReorder")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSensitivity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDragIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDragIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDragIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDragIcons")(js.undefined)
        ret
    }
  }
  
}

