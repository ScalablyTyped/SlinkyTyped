package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.antDesignProStrings.down
import typingsSlinky.antDesignPro.antDesignProStrings.up
import typingsSlinky.antDesignPro.trendMod.ITrendProps
import typingsSlinky.antDesignPro.trendMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trend
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Trend", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    flag: up | down,
    colorful: js.UndefOr[Boolean] = js.undefined,
    reverseColor: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
    if (!js.isUndefined(colorful)) __obj.updateDynamic("colorful")(colorful.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseColor)) __obj.updateDynamic("reverseColor")(reverseColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITrendProps
}

