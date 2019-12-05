package typingsSlinky.recharts.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.recharts.rechartsMod.SymbolsProps
import typingsSlinky.recharts.rechartsStrings.area
import typingsSlinky.recharts.rechartsStrings.circle
import typingsSlinky.recharts.rechartsStrings.cross
import typingsSlinky.recharts.rechartsStrings.diameter
import typingsSlinky.recharts.rechartsStrings.diamond
import typingsSlinky.recharts.rechartsStrings.square
import typingsSlinky.recharts.rechartsStrings.star
import typingsSlinky.recharts.rechartsStrings.triangle
import typingsSlinky.recharts.rechartsStrings.wye
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Symbols
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.recharts.rechartsMod.Symbols] {
  @JSImport("recharts", "Symbols")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, size */
  def apply(
    cx: Int | Double = null,
    cy: Int | Double = null,
    sizeType: area | diameter = null,
    `type`: circle | cross | diamond | square | star | triangle | wye = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.recharts.rechartsMod.Symbols] = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SymbolsProps
}

