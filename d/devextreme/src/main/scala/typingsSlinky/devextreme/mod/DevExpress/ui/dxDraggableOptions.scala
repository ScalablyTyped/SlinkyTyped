package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.EventFromData
import typingsSlinky.devextreme.anon.ItemDataItemElement
import typingsSlinky.devextreme.anon.ToComponent
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDraggableOptions extends DraggableBaseOptions[dxDraggable] {
  /** Allows a user to drag clones of items instead of actual items. */
  @JSName("clone")
  var clone_FdxDraggableOptions: js.UndefOr[Boolean] = js.native
  /** Specifies custom markup to be shown instead of the item being dragged. */
  var dragTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** A function that is called when drag gesture is finished. */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ ToComponent, _]] = js.native
  /** A function that is called every time a draggable item is moved. */
  var onDragMove: js.UndefOr[js.Function1[/* e */ ToComponent, _]] = js.native
  /** A function that is called when the drag gesture is initialized. */
  var onDragStart: js.UndefOr[js.Function1[/* e */ EventFromData, _]] = js.native
}

object dxDraggableOptions {
  @scala.inline
  def apply(): dxDraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDraggableOptions]
  }
  @scala.inline
  implicit class dxDraggableOptionsOps[Self <: dxDraggableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTemplateFunction2(
      value: (/* dragInfo */ ItemDataItemElement, /* containerElement */ dxElement) => String | Element | JQuery
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
          /* dragInfo */ ItemDataItemElement, 
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
    def withOnDragEnd(value: /* e */ ToComponent => _): Self = {
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
    def withOnDragMove(value: /* e */ ToComponent => _): Self = {
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
    def withOnDragStart(value: /* e */ EventFromData => _): Self = {
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
  }
  
}

