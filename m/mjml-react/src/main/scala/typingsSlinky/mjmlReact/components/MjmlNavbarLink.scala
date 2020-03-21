package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mod.HrefProps
import typingsSlinky.mjmlReact.mod.MjmlNavbarLinkProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlNavbarLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlNavbarLink] {
  @JSImport("mjml-react", "MjmlNavbarLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    color: ColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    fontStyle: String = null,
    fontWeight: Int | Double = null,
    lineHeight: String | Double = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    textDecoration: String = null,
    textTransform: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlNavbarLink] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlNavbarLink] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlNavbarLink](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MjmlNavbarLinkProps with HrefProps with PaddingProps
}

