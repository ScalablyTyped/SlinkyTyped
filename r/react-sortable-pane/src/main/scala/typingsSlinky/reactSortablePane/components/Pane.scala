package typingsSlinky.reactSortablePane.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSortablePane.anon.Height
import typingsSlinky.reactSortablePane.paneMod.IsPaneResizable
import typingsSlinky.reactSortablePane.paneMod.PaneProps
import typingsSlinky.reactSortablePane.paneMod.PaneSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pane {
  @JSImport("react-sortable-pane", "Pane")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSortablePane.mod.Pane] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSize(value: Height): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    @scala.inline
    def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeight(value: PaneSize): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidth(value: PaneSize): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: PaneSize): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: PaneSize): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onSizeChange(value: () => Unit): this.type = set("onSizeChange", js.Any.fromFunction0(value))
    @scala.inline
    def resizable(value: IsPaneResizable): this.type = set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: Height): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Pane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

