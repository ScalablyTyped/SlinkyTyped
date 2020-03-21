package typingsSlinky.rcFieldForm.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcFieldForm.formContextMod.FormChangeInfo
import typingsSlinky.rcFieldForm.formContextMod.FormFinishInfo
import typingsSlinky.rcFieldForm.formContextMod.FormProviderProps
import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("rc-field-form/lib", "FormProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Unit = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Unit = null,
    validateMessages: ValidateMessages = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2(onFormChange))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2(onFormFinish))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FormProviderProps
}

