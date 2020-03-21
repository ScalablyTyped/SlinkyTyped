package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.BackgroundPositionProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mjmlReactStrings.`fixed-height`
import typingsSlinky.mjmlReact.mjmlReactStrings.`fluid-height`
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlHeroProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlHero
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlHero] {
  @JSImport("mjml-react", "MjmlHero")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backgroundColor: BackgroundColorProperty = null,
    backgroundHeight: String = null,
    backgroundPosition: BackgroundPositionProperty[String | Double] = null,
    backgroundUrl: String = null,
    backgroundWidth: String = null,
    cssClass: String = null,
    height: String | Double = null,
    mode: `fluid-height` | `fixed-height` = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlHero] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundHeight != null) __obj.updateDynamic("backgroundHeight")(backgroundHeight.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundUrl != null) __obj.updateDynamic("backgroundUrl")(backgroundUrl.asInstanceOf[js.Any])
    if (backgroundWidth != null) __obj.updateDynamic("backgroundWidth")(backgroundWidth.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlHero] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlHero](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MjmlHeroProps with ClassNameProps with PaddingProps
}

