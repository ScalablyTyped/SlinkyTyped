package typingsSlinky.materialUiCore.components

import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.select.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUiCore.anon.Node
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.materialUiCore.nativeSelectInputMod.NativeSelectInputProps
import typingsSlinky.materialUiCore.nativeSelectInputMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeSelectInput {
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def IconComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def IconComponentComponentClass(value: ReactComponentClass[_]): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def IconComponent(value: ReactComponentClass[_]): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRef(value: /* ref */ HTMLSelectElement | Node => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def value(value: (js.Array[String | Double | Boolean]) | String | Double | Boolean): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def variant(value: standard | outlined | filled): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NativeSelectInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NativeSelectInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

