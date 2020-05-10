package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSketchapp.defsMod.DefsProps
import typingsSlinky.reactSketchapp.defsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Defs {
  @JSImport("react-sketchapp/lib/components/Svg/Defs", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DefsProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Defs.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

