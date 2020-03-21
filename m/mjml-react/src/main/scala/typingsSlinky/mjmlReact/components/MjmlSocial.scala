package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.horizontal
import typingsSlinky.mjmlReact.mjmlReactStrings.vertical
import typingsSlinky.mjmlReact.mod.MjmlSocialProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSocial
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocial] {
  @JSImport("mjml-react", "MjmlSocial")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: String = null,
    borderRadius: String | Double = null,
    color: ColorProperty = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    iconHeight: String = null,
    iconSize: String = null,
    innerPadding: String = null,
    lineHeight: String | Double = null,
    mode: vertical | horizontal = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    textDecoration: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocial] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocial] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlSocial](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MjmlSocialProps with PaddingProps
}

