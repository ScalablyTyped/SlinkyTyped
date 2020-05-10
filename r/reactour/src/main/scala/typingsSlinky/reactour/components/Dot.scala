package typingsSlinky.reactour.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactour.mod.DotProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dot {
  @JSImport("reactour", "Dot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def accentColor(value: String): this.type = set("accentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def showNumber(value: Boolean): this.type = set("showNumber", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DotProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

