package typingsSlinky.calidation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.form.tag
import typingsSlinky.calidation.calidationMod.FormContext
import typingsSlinky.calidation.calidationMod.FormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.calidation.calidationMod.Form] {
  @JSImport("calidation", "Form")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange, onSubmit */
  def apply(
    onReset: () => Unit = null,
    onUpdate: /* context */ FormContext => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.calidation.calidationMod.Form] = {
    val __obj = js.Dynamic.literal()
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.calidation.calidationMod.Form] = new slinky.core.BuildingComponent[slinky.web.html.form.tag.type, typingsSlinky.calidation.calidationMod.Form](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FormProps
}

