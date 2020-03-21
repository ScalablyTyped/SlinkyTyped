package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.ColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.`facebook-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`google-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`linkedin-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`pinterest-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`tumblr-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`twitter-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.`xing-noshare`
import typingsSlinky.mjmlReact.mjmlReactStrings.dribbble
import typingsSlinky.mjmlReact.mjmlReactStrings.facebook
import typingsSlinky.mjmlReact.mjmlReactStrings.github
import typingsSlinky.mjmlReact.mjmlReactStrings.google
import typingsSlinky.mjmlReact.mjmlReactStrings.horizontal
import typingsSlinky.mjmlReact.mjmlReactStrings.instagram
import typingsSlinky.mjmlReact.mjmlReactStrings.linkedin
import typingsSlinky.mjmlReact.mjmlReactStrings.medium
import typingsSlinky.mjmlReact.mjmlReactStrings.pinterest
import typingsSlinky.mjmlReact.mjmlReactStrings.snapchat
import typingsSlinky.mjmlReact.mjmlReactStrings.soundcloud
import typingsSlinky.mjmlReact.mjmlReactStrings.tumblr
import typingsSlinky.mjmlReact.mjmlReactStrings.twitter
import typingsSlinky.mjmlReact.mjmlReactStrings.vertical
import typingsSlinky.mjmlReact.mjmlReactStrings.vimeo
import typingsSlinky.mjmlReact.mjmlReactStrings.web
import typingsSlinky.mjmlReact.mjmlReactStrings.xing
import typingsSlinky.mjmlReact.mjmlReactStrings.youtube
import typingsSlinky.mjmlReact.mod.HrefProps
import typingsSlinky.mjmlReact.mod.MjmlSocialElementProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSocialElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocialElement] {
  @JSImport("mjml-react", "MjmlSocialElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: alt, src */
  def apply(
    align: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    color: ColorProperty = null,
    fontFamily: String = null,
    fontSize: String | Double = null,
    iconHeight: String = null,
    iconSize: String = null,
    lineHeight: String | Double = null,
    mode: vertical | horizontal = null,
    name: facebook | `facebook-noshare` | twitter | `twitter-noshare` | google | `google-noshare` | pinterest | `pinterest-noshare` | linkedin | `linkedin-noshare` | tumblr | `tumblr-noshare` | xing | `xing-noshare` | github | instagram | web | snapchat | youtube | vimeo | medium | soundcloud | dribbble = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    textDecoration: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocialElement] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSocialElement] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlSocialElement](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MjmlSocialElementProps with RequiredChildrenProps with HrefProps with PaddingProps
}

