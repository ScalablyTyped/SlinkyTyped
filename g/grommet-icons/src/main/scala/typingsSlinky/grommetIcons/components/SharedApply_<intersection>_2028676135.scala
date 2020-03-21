package typingsSlinky.grommetIcons.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.grommetIcons.grommetIconsStrings.large
import typingsSlinky.grommetIcons.grommetIconsStrings.medium
import typingsSlinky.grommetIcons.grommetIconsStrings.small
import typingsSlinky.grommetIcons.grommetIconsStrings.xlarge
import typingsSlinky.grommetIcons.iconsMod.IconProps
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.SVGAttributes
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class `SharedApply_<intersection>_2028676135`[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    ClassAttributes: ClassAttributes[SVGSVGElement] = null,
    SVGAttributes: SVGAttributes[SVGSVGElement] = null,
    a11yTitle: String = null,
    color: String = null,
    size: small | medium | large | xlarge | String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IconProps with SVGProps[SVGSVGElement]
}

