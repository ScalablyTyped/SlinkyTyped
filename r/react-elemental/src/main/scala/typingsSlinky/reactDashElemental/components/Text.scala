package typingsSlinky.reactDashElemental.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashElemental.reactDashElementalMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Text] {
  @JSImport("react-elemental", "Text")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    right: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    style: CSSProperties = null,
    uppercase: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Text] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercase)) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashElemental.reactDashElementalMod.Text] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashElemental.reactDashElementalMod.Text](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TextProps
}

