package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.ClipPathProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClipPath {
  @JSImport("react-native-svg", "ClipPath")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvg.mod.ClipPath] {
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClipPathProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ClipPath.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

