package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Defs {
  @JSImport("react-native-svg", "Defs")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.reactNativeSvg.mod.Defs] = new Default[tag.type, typingsSlinky.reactNativeSvg.mod.Defs](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Defs.type): Default[tag.type, typingsSlinky.reactNativeSvg.mod.Defs] = new Default[tag.type, typingsSlinky.reactNativeSvg.mod.Defs](js.Array(this.component, js.Dictionary.empty))()
}

