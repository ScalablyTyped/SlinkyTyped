package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.mod.ArtboardProps
import typingsSlinky.reactSketchapp.mod.Style
import typingsSlinky.reactSketchapp.mod.StyleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Artboard {
  @JSImport("react-sketchapp", "Artboard")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSketchapp.mod.Artboard] {
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Style | StyleReference): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ArtboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Artboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

