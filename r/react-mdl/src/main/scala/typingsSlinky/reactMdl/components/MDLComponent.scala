package typingsSlinky.reactMdl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdl.AnonRecursive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MDLComponent {
  @JSImport("react-mdl", "MDLComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMdl.mod.MDLComponent] {
    @scala.inline
    def recursive(value: Boolean): this.type = set("recursive", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnonRecursive): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MDLComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

