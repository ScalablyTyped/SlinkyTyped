package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactElemental.AnonPrimary
import typingsSlinky.reactElemental.AnonPrimaryDark
import typingsSlinky.reactElemental.mod.ElementalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elemental {
  @JSImport("react-elemental", "Elemental")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Elemental] {
    @scala.inline
    def colorOpts(value: AnonPrimaryDark): this.type = set("colorOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def fontOpts(value: AnonPrimary): this.type = set("fontOpts", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ElementalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Elemental.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

