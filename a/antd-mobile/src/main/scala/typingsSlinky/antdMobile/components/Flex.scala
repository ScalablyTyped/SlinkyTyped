package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.antdMobile.antdMobileStrings.`column-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`row-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.`wrap-reverse`
import typingsSlinky.antdMobile.antdMobileStrings.around
import typingsSlinky.antdMobile.antdMobileStrings.baseline
import typingsSlinky.antdMobile.antdMobileStrings.between
import typingsSlinky.antdMobile.antdMobileStrings.center
import typingsSlinky.antdMobile.antdMobileStrings.column
import typingsSlinky.antdMobile.antdMobileStrings.end
import typingsSlinky.antdMobile.antdMobileStrings.nowrap
import typingsSlinky.antdMobile.antdMobileStrings.row
import typingsSlinky.antdMobile.antdMobileStrings.start
import typingsSlinky.antdMobile.antdMobileStrings.stretch
import typingsSlinky.antdMobile.antdMobileStrings.wrap
import typingsSlinky.antdMobile.flexFlexMod.FlexProps
import typingsSlinky.antdMobile.flexMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flex
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/flex", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onClick, style */
  def apply(
    align: start | center | end | baseline | stretch = null,
    alignContent: start | end | center | between | around | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    prefixCls: String = null,
    role: String = null,
    wrap: nowrap | wrap | `wrap-reverse` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, typingsSlinky.antdMobile.flexMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = FlexProps
}

