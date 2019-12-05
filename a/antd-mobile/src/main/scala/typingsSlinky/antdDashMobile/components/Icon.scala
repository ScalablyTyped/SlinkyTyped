package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.svg.`*`.tag
import typingsSlinky.antdDashMobile.antdDashMobileStrings.lg
import typingsSlinky.antdDashMobile.antdDashMobileStrings.md
import typingsSlinky.antdDashMobile.antdDashMobileStrings.sm
import typingsSlinky.antdDashMobile.antdDashMobileStrings.xs
import typingsSlinky.antdDashMobile.antdDashMobileStrings.xxs
import typingsSlinky.antdDashMobile.libIconMod.IconProps
import typingsSlinky.antdDashMobile.libIconMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/icon", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick, type */
  def apply(
    color: String = null,
    size: xxs | xs | sm | md | lg = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconProps
}

