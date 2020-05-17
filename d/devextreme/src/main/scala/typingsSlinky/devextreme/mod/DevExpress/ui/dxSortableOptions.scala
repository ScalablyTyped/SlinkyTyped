package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ComponentDropInsideItem
import typingsSlinky.devextreme.anon.DropInsideItemElement
import typingsSlinky.devextreme.anon.FromComponentFromData
import typingsSlinky.devextreme.anon.FromDataFromIndex
import typingsSlinky.devextreme.anon.FromIndexItemData
import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.indicate
import typingsSlinky.devextreme.devextremeStrings.push
import typingsSlinky.devextreme.devextremeStrings.vertical
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSortableOptions extends DraggableBaseOptions[dxSortable] {
  /** Allows a user to drop an item inside another item. */
  var allowDropInsideItem: js.UndefOr[Boolean] = js.native
  /** Allows a user to reorder sortable items. */
  var allowReordering: js.UndefOr[Boolean] = js.native
  /** Specifies custom markup to be shown instead of the item being dragged. */
  var dragTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ FromIndexItemData, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies how to highlight the item's drop position. */
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.native
  /** Specifies a CSS selector for the items that can be dragged. */
  var filter: js.UndefOr[String] = js.native
  /** Notifies the widget of the items' orientation. */
  var itemOrientation: js.UndefOr[horizontal | vertical] = js.native
  /** Moves an element in the HTML markup when it is dropped. */
  var moveItemOnDrop: js.UndefOr[Boolean] = js.native
  /** A function that is called when a new item is added. */
  var onAdd: js.UndefOr[js.Function1[/* e */ ComponentDropInsideItem, _]] = js.native
  /** A function that is called when the dragged item's position in the list is changed. */
  var onDragChange: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.native
  /** A function that is called when the drag gesture is finished. */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.native
  /** A function that is called every time a draggable item is moved. */
  var onDragMove: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.native
  /** A function that is called when drag gesture is initialized. */
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromDataFromIndex, _]] = js.native
  /** A function that is called when a draggable item is removed. */
  var onRemove: js.UndefOr[js.Function1[/* e */ FromComponentFromData, _]] = js.native
  /** A function that is called when the draggable items are reordered. */
  var onReorder: js.UndefOr[js.Function1[/* e */ ComponentDropInsideItem, _]] = js.native
}

object dxSortableOptions {
  @scala.inline
  def apply(): dxSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSortableOptions]
  }
  @scala.inline
  implicit class dxSortableOptionsOps[Self <: dxSortableOptions] (val x: Self) extends AnyVal {
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
    def withDragTemplateFunction2(
      value: (/* dragInfo */ FromIndexItemData, /* containerElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* dragInfo */ FromIndexItemData, 
          /* containerElement */ dxElement, 
          String | Element | JQuery
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
    def withItemOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveItemOnDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveItemOnDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveItemOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveItemOnDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdd(value: /* e */ ComponentDropInsideItem => _): Self = {
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
    def withOnDragChange(value: /* e */ DropInsideItemElement => _): Self = {
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
    def withOnDragEnd(value: /* e */ DropInsideItemElement => _): Self = {
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
    def withOnDragMove(value: /* e */ DropInsideItemElement => _): Self = {
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
    def withOnDragStart(value: /* e */ FromDataFromIndex => _): Self = {
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
    def withOnRemove(value: /* e */ FromComponentFromData => _): Self = {
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
    def withOnReorder(value: /* e */ ComponentDropInsideItem => _): Self = {
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
  }
  
}

