package typingsSlinky.cathoQuantum.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.cathoQuantum.AnonBaseFontSize
import typingsSlinky.cathoQuantum.AnonContent
import typingsSlinky.cathoQuantum.accordionMod.AccordionProps
import typingsSlinky.cathoQuantum.accordionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@catho/quantum/Accordion", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    items: js.Array[AnonContent],
    keepOnlyOneOpen: js.UndefOr[Boolean] = js.undefined,
    theme: AnonBaseFontSize = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(keepOnlyOneOpen)) __obj.updateDynamic("keepOnlyOneOpen")(keepOnlyOneOpen.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AccordionProps
}

