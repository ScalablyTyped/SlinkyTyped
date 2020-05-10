package typingsSlinky.reactSplitterLayout.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSplitterLayout.mod.SplitterLayoutProps
import typingsSlinky.reactSplitterLayout.mod.TPrimaryIndex
import typingsSlinky.reactSplitterLayout.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSplitterLayout {
  @JSImport("react-splitter-layout", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def customClassName(value: String): this.type = set("customClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnd(value: () => Unit): this.type = set("onDragEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def onSecondaryPaneSizeChange(value: /* value */ Double => Unit): this.type = set("onSecondaryPaneSizeChange", js.Any.fromFunction1(value))
    @scala.inline
    def percentage(value: Boolean): this.type = set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def primaryIndex(value: TPrimaryIndex): this.type = set("primaryIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def primaryMinSize(value: Double): this.type = set("primaryMinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def secondaryInitialSize(value: Double): this.type = set("secondaryInitialSize", value.asInstanceOf[js.Any])
    @scala.inline
    def secondaryMinSize(value: Double): this.type = set("secondaryMinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SplitterLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactSplitterLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

