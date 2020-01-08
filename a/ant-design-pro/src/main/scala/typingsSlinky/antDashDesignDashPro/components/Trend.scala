package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.down
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.up
import typingsSlinky.antDashDesignDashPro.libTrendMod.ITrendProps
import typingsSlinky.antDashDesignDashPro.libTrendMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trend
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Trend", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    flag: up | down,
    colorful: js.UndefOr[Boolean] = js.undefined,
    reverseColor: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
    if (!js.isUndefined(colorful)) __obj.updateDynamic("colorful")(colorful.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseColor)) __obj.updateDynamic("reverseColor")(reverseColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ITrendProps
}

