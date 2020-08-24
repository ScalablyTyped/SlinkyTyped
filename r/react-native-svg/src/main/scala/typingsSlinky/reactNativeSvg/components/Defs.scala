package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeSvg.mod.DefsCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Defs {
  @JSImport("react-native-svg", "Defs")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): typingsSlinky.StBuildingComponent.Default[tag.type, DefsCls] = new typingsSlinky.StBuildingComponent.Default[tag.type, DefsCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Defs.type): typingsSlinky.StBuildingComponent.Default[tag.type, DefsCls] = new typingsSlinky.StBuildingComponent.Default[tag.type, DefsCls](js.Array(this.component, js.Dictionary.empty))()
}

