package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BorderProperty
import typingsSlinky.csstype.mod.BorderRadiusProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.hidden
import typingsSlinky.mjmlReact.mjmlReactStrings.visible
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlCarouselProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlCarousel] {
  @JSImport("mjml-react", "MjmlCarousel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    align: String = null,
    backgroundColor: BackgroundColorProperty = null,
    borderRadius: String | Double = null,
    cssClass: String = null,
    iconWidth: String = null,
    leftIcon: String = null,
    rightIcon: String = null,
    tbBorder: BorderProperty[String | Double] = null,
    tbBorderRadius: BorderRadiusProperty[String | Double] = null,
    tbHoverBorderColor: String = null,
    tbSelectedBorderColor: String = null,
    tbWidth: String = null,
    thumbnails: hidden | visible = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlCarousel] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (tbBorder != null) __obj.updateDynamic("tbBorder")(tbBorder.asInstanceOf[js.Any])
    if (tbBorderRadius != null) __obj.updateDynamic("tbBorderRadius")(tbBorderRadius.asInstanceOf[js.Any])
    if (tbHoverBorderColor != null) __obj.updateDynamic("tbHoverBorderColor")(tbHoverBorderColor.asInstanceOf[js.Any])
    if (tbSelectedBorderColor != null) __obj.updateDynamic("tbSelectedBorderColor")(tbSelectedBorderColor.asInstanceOf[js.Any])
    if (tbWidth != null) __obj.updateDynamic("tbWidth")(tbWidth.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlCarousel] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlCarousel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RequiredChildrenProps with MjmlCarouselProps with ClassNameProps
}

