package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.left
import typingsSlinky.mjmlReact.mjmlReactStrings.right
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlAccordionElementProps
import typingsSlinky.mjmlReact.mod.RequiredChildrenProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlAccordionElement
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlAccordionElement] {
  @JSImport("mjml-react", "MjmlAccordionElement")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    cssClass: String = null,
    fontFamily: String = null,
    iconAlign: String = null,
    iconHeight: String = null,
    iconPosition: left | right = null,
    iconUnwrappedAlt: String = null,
    iconUnwrappedUrl: String = null,
    iconWidth: String = null,
    iconWrappedAlt: String = null,
    iconWrappedUrl: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlAccordionElement] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (iconAlign != null) __obj.updateDynamic("iconAlign")(iconAlign.asInstanceOf[js.Any])
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (iconUnwrappedAlt != null) __obj.updateDynamic("iconUnwrappedAlt")(iconUnwrappedAlt.asInstanceOf[js.Any])
    if (iconUnwrappedUrl != null) __obj.updateDynamic("iconUnwrappedUrl")(iconUnwrappedUrl.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (iconWrappedAlt != null) __obj.updateDynamic("iconWrappedAlt")(iconWrappedAlt.asInstanceOf[js.Any])
    if (iconWrappedUrl != null) __obj.updateDynamic("iconWrappedUrl")(iconWrappedUrl.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlAccordionElement] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlAccordionElement](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RequiredChildrenProps with MjmlAccordionElementProps with ClassNameProps
}

