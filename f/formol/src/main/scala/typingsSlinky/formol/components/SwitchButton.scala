package typingsSlinky.formol.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formol.AnonDictk
import typingsSlinky.formol.mod.SwitchButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SwitchButton {
  @JSImport("formol", "SwitchButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.formol.mod.SwitchButton] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def i18n(value: AnonDictk): this.type = set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def leftLabelReactElement(value: ReactElement): this.type = set("leftLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def leftLabel(value: TagMod[Any]): this.type = set("leftLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def rightLabelReactElement(value: ReactElement): this.type = set("rightLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def rightLabel(value: TagMod[Any]): this.type = set("rightLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SwitchButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

