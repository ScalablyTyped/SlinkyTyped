package typingsSlinky.reactSwipe.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSwipe.mod.Props
import typingsSlinky.reactSwipe.mod.Style
import typingsSlinky.reactSwipe.mod.^
import typingsSlinky.swipe.SwipeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSwipe {
  @JSImport("react-swipe", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def childCount(value: Double): this.type = set("childCount", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def swipeOptions(value: SwipeOptions): this.type = set("swipeOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactSwipe.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

