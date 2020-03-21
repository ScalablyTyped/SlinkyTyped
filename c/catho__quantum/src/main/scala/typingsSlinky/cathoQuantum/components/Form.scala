package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.AnonValid
import typingsSlinky.cathoQuantum.formMod.FormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.cathoQuantum.formMod.Form] {
  @JSImport("@catho/quantum/Form", "Form")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onSubmit: /* hasValid */ js.UndefOr[AnonValid] => Unit = null,
    onValidSubmit: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.formMod.Form] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onValidSubmit != null) __obj.updateDynamic("onValidSubmit")(js.Any.fromFunction1(onValidSubmit))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.cathoQuantum.formMod.Form] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.cathoQuantum.formMod.Form](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FormProps
}

