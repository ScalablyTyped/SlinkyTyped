package typingsSlinky.atAntDashDesignIconsDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.svg.`*`.tag
import typingsSlinky.atAntDashDesignIcons.libTypesMod.IconDefinition
import typingsSlinky.atAntDashDesignIconsDashReact.libComponentsIconMod.IconProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IconProps587395058[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, onClick */
  def apply(
    `type`: String | IconDefinition,
    focusable: String = null,
    primaryColor: String = null,
    secondaryColor: String = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.svg.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IconProps
}

