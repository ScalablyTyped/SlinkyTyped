package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.antdDashMobile.antdDashMobileStrings.lg
import typingsSlinky.antdDashMobile.antdDashMobileStrings.md
import typingsSlinky.antdDashMobile.antdDashMobileStrings.sm
import typingsSlinky.antdDashMobile.antdDashMobileStrings.xl
import typingsSlinky.antdDashMobile.antdDashMobileStrings.xs
import typingsSlinky.antdDashMobile.libWhiteDashSpaceMod.WhiteSpaceProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_WhiteSpaceProps1080454236[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, onClick */
  def apply(
    prefixCls: String = null,
    size: xs | sm | md | lg | xl = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.div.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WhiteSpaceProps
}

