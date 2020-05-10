package typingsSlinky.officeUiFabricReact.draggableZoneTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDraggableZoneProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Specifies a selector to be used as the handle that initiates drag
    */
  var handleSelector: js.UndefOr[String] = js.native
  /**
    * Callback for when the drag changes, while dragging
    */
  var onDragChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], 
      /* dragData */ IDragData, 
      Unit
    ]
  ] = js.native
  /**
    * Callback for when dragging starts
    */
  var onStart: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], 
      /* dragData */ IDragData, 
      Unit
    ]
  ] = js.native
  /**
    * Callback for when dragging stops
    */
  var onStop: js.UndefOr[
    js.Function2[
      /* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], 
      /* dragData */ IDragData, 
      Unit
    ]
  ] = js.native
  /**
    * the X and Y coordinates to use as an offest to position the draggable content
    */
  var position: js.UndefOr[ICoordinates] = js.native
  /**
    * Specifies a selector to be used to prevent drag initialization.
    * For example, if you do not want buttons inside of your handleSelector
    * to have the cursor change to move or to allow users to select from buttons,
    * you could pass button here (the close button in the header of a dialog is a concrete example)
    */
  var preventDragSelector: js.UndefOr[String] = js.native
}

object IDraggableZoneProps {
  @scala.inline
  def apply(): IDraggableZoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDraggableZoneProps]
  }
  @scala.inline
  implicit class IDraggableZonePropsOps[Self <: IDraggableZoneProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragChange(
      value: (/* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(
      value: (/* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(
      value: (/* event */ SyntheticMouseEvent[HTMLElement] with SyntheticTouchEvent[HTMLElement], /* dragData */ IDragData) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ICoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDragSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDragSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDragSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDragSelector")(js.undefined)
        ret
    }
  }
  
}

