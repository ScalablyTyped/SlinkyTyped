package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonIndex
import typingsSlinky.primereact.accordionMod.AccordionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.mod.Accordion] {
  @JSImport("primereact/accordion", "Accordion")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, multiple */
  def apply(
    activeIndex: js.Any = null,
    onTabChange: /* e */ AnonIndex => Unit = null,
    onTabClose: /* e */ AnonIndex => Unit = null,
    onTabOpen: /* e */ AnonIndex => Unit = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.mod.Accordion] = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (onTabClose != null) __obj.updateDynamic("onTabClose")(js.Any.fromFunction1(onTabClose))
    if (onTabOpen != null) __obj.updateDynamic("onTabOpen")(js.Any.fromFunction1(onTabOpen))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.mod.Accordion] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.mod.Accordion](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AccordionProps
}

