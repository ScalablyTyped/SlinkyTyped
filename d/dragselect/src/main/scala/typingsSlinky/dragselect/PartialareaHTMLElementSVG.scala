package typingsSlinky.dragselect

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.dragselect.dragselectStrings.altKey
import typingsSlinky.dragselect.dragselectStrings.ctrlKey
import typingsSlinky.dragselect.dragselectStrings.metaKey
import typingsSlinky.dragselect.dragselectStrings.shiftKey
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  area  :std.HTMLElement | std.SVGElement | std.Document,   autoScrollSpeed  :number, callback (selected : std.Array<std.HTMLElement | std.SVGElement>, event : std.MouseEvent | std.TouchEvent): void,   customStyles  :boolean,   hoverClass  :string,   multiSelectKeys  :std.ReadonlyArray<'ctrlKey' | 'shiftKey' | 'metaKey' | 'altKey'>,   multiSelectMode  :boolean, onDragMove (event : std.MouseEvent | std.TouchEvent): void, onDragStart (event : std.MouseEvent | std.TouchEvent): void, onDragStartBegin (event : std.MouseEvent | std.TouchEvent): void, onElementSelect (selected : std.HTMLElement | std.SVGElement): void, onElementUnselect (selected : std.HTMLElement | std.SVGElement): void,   selectableClass  :string,   selectables  :std.ArrayLike<std.HTMLElement | std.SVGElement> | std.HTMLElement | std.SVGElement,   selectedClass  :string,   selector  :std.HTMLElement,   selectorClass  :string,   zoom  :number}> */
@js.native
trait PartialareaHTMLElementSVG extends js.Object {
  var area: js.UndefOr[HTMLElement | SVGElement | Document_] = js.native
  var autoScrollSpeed: js.UndefOr[Double] = js.native
  var callback: js.UndefOr[
    js.Function2[
      /* selected */ js.Array[HTMLElement | SVGElement], 
      /* event */ MouseEvent | TouchEvent, 
      Unit
    ]
  ] = js.native
  var customStyles: js.UndefOr[Boolean] = js.native
  var hoverClass: js.UndefOr[String] = js.native
  var multiSelectKeys: js.UndefOr[js.Array[ctrlKey | shiftKey | metaKey | altKey]] = js.native
  var multiSelectMode: js.UndefOr[Boolean] = js.native
  var onDragMove: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.native
  var onDragStartBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.native
  var onElementSelect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.native
  var onElementUnselect: js.UndefOr[js.Function1[/* selected */ HTMLElement | SVGElement, Unit]] = js.native
  var selectableClass: js.UndefOr[String] = js.native
  var selectables: js.UndefOr[(ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement] = js.native
  var selectedClass: js.UndefOr[String] = js.native
  var selector: js.UndefOr[HTMLElement] = js.native
  var selectorClass: js.UndefOr[String] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object PartialareaHTMLElementSVG {
  @scala.inline
  def apply(): PartialareaHTMLElementSVG = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialareaHTMLElementSVG]
  }
  @scala.inline
  implicit class PartialareaHTMLElementSVGOps[Self <: PartialareaHTMLElementSVG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaSVGElement(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreaHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArea(value: HTMLElement | SVGElement | Document_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScrollSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(
      value: (/* selected */ js.Array[HTMLElement | SVGElement], /* event */ MouseEvent | TouchEvent) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelectKeys(value: js.Array[ctrlKey | shiftKey | metaKey | altKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelectMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelectMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragMove(value: /* event */ MouseEvent | TouchEvent => Unit): Self = {
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
    def withOnDragStart(value: /* event */ MouseEvent | TouchEvent => Unit): Self = {
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
    def withOnDragStartBegin(value: /* event */ MouseEvent | TouchEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStartBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnElementSelect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnElementSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnElementUnselect(value: /* selected */ HTMLElement | SVGElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementUnselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnElementUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onElementUnselect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectableClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectableClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectablesSVGElement(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectablesHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectables(value: (ArrayLike[HTMLElement | SVGElement]) | HTMLElement | SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectables")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

