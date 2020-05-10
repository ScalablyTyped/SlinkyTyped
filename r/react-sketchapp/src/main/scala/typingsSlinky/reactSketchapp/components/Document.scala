package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSketchapp.mod.DocumentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Document {
  @JSImport("react-sketchapp", "Document")
  @js.native
  object component extends js.Object
  
  def withProps(p: DocumentProps): Default[tag.type, typingsSlinky.reactSketchapp.mod.Document] = new Default[tag.type, typingsSlinky.reactSketchapp.mod.Document](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Document.type): Default[tag.type, typingsSlinky.reactSketchapp.mod.Document] = new Default[tag.type, typingsSlinky.reactSketchapp.mod.Document](js.Array(this.component, js.Dictionary.empty))()
}

