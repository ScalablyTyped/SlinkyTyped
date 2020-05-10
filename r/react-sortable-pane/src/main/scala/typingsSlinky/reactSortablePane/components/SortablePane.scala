package typingsSlinky.reactSortablePane.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMotion.mod.SpringHelperConfig
import typingsSlinky.reactSortablePane.mod.PaneKey
import typingsSlinky.reactSortablePane.mod.PaneResizeDirection
import typingsSlinky.reactSortablePane.mod.PaneSize
import typingsSlinky.reactSortablePane.mod.SortablePaneProps
import typingsSlinky.reactSortablePane.reactSortablePaneStrings.horizontal
import typingsSlinky.reactSortablePane.reactSortablePaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SortablePane {
  @JSImport("react-sortable-pane", "SortablePane")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSortablePane.mod.SortablePane] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOrder(value: js.Array[String]): this.type = set("defaultOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def disableEffect(value: Boolean): this.type = set("disableEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def dragHandleClassName(value: String): this.type = set("dragHandleClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def isSortable(value: Boolean): this.type = set("isSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Double): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragStart(
      value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* key */ PaneKey, /* elementRef */ HTMLElement) => Unit
    ): this.type = set("onDragStart", js.Any.fromFunction3(value))
    @scala.inline
    def onDragStop(
      value: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* elementRef */ HTMLElement, /* order */ js.Array[String]) => Unit
    ): this.type = set("onDragStop", js.Any.fromFunction4(value))
    @scala.inline
    def onOrderChange(value: /* order */ js.Array[String] => Unit): this.type = set("onOrderChange", js.Any.fromFunction1(value))
    @scala.inline
    def onResize(
      value: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
    ): this.type = set("onResize", js.Any.fromFunction5(value))
    @scala.inline
    def onResizeStart(
      value: (/* e */ SyntheticMouseEvent[HTMLElement] | SyntheticTouchEvent[HTMLElement], /* key */ PaneKey, /* dir */ PaneResizeDirection) => Unit
    ): this.type = set("onResizeStart", js.Any.fromFunction3(value))
    @scala.inline
    def onResizeStop(
      value: (/* e */ MouseEvent | TouchEvent, /* key */ PaneKey, /* dir */ PaneResizeDirection, /* elementRef */ HTMLElement, /* delta */ PaneSize) => Unit
    ): this.type = set("onResizeStop", js.Any.fromFunction5(value))
    @scala.inline
    def order(value: js.Array[String]): this.type = set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def springConfig(value: SpringHelperConfig): this.type = set("springConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SortablePaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SortablePane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

