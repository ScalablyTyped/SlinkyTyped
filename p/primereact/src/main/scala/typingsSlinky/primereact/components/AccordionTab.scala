package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsAccordionAccordionMod.AccordionTabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AccordionTab
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.accordionMod.AccordionTab] {
  @JSImport("primereact/accordion", "AccordionTab")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    contentClassName: String = null,
    contentStyle: js.Object = null,
    header: js.Any = null,
    headerClassName: String = null,
    headerStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.accordionMod.AccordionTab] = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.accordionMod.AccordionTab] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.accordionMod.AccordionTab](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AccordionTabProps
}

