package typingsSlinky.atLinguiMacro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.atLinguiMacro.transMod.TransPropsWithoutI18n
import typingsSlinky.atLinguiMacro.transMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trans
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@lingui/macro/Trans", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    components: js.Array[ReactElement] = null,
    defaults: String = null,
    description: String = null,
    formats: js.Object = null,
    render: TagMod[Any] = null,
    values: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.atLinguiMacro.transMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TransPropsWithoutI18n
}

