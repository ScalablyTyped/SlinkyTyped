package typingsSlinky.atlaskitButton.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.atlaskitButton.mod.ButtonAppearances
import typingsSlinky.atlaskitButton.mod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonGroup {
  @JSImport("@atlaskit/button", "ButtonGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.atlaskitButton.mod.ButtonGroup] {
    @scala.inline
    def appearance(value: ButtonAppearances): this.type = set("appearance", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

