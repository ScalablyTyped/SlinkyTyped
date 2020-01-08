package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`column-reverse`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`row-reverse`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.`wrap-reverse`
import typingsSlinky.antdDashMobile.antdDashMobileStrings.around
import typingsSlinky.antdDashMobile.antdDashMobileStrings.baseline
import typingsSlinky.antdDashMobile.antdDashMobileStrings.between
import typingsSlinky.antdDashMobile.antdDashMobileStrings.center
import typingsSlinky.antdDashMobile.antdDashMobileStrings.column
import typingsSlinky.antdDashMobile.antdDashMobileStrings.end
import typingsSlinky.antdDashMobile.antdDashMobileStrings.nowrap
import typingsSlinky.antdDashMobile.antdDashMobileStrings.row
import typingsSlinky.antdDashMobile.antdDashMobileStrings.start
import typingsSlinky.antdDashMobile.antdDashMobileStrings.stretch
import typingsSlinky.antdDashMobile.antdDashMobileStrings.wrap
import typingsSlinky.antdDashMobile.libFlexFlexMod.FlexProps
import typingsSlinky.antdDashMobile.libFlexMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flex
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/flex", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, onClick */
  def apply(
    align: start | center | end | baseline | stretch = null,
    alignContent: start | end | center | between | around | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    justify: start | end | center | between | around = null,
    prefixCls: String = null,
    role: String = null,
    style: CSSProperties = null,
    wrap: nowrap | wrap | `wrap-reverse` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.antdDashMobile.libFlexMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlexProps
}

