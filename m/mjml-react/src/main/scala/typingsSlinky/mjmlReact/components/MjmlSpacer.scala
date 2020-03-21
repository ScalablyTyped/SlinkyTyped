package typingsSlinky.mjmlReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.csstype.mod.BackgroundColorProperty
import typingsSlinky.csstype.mod.VerticalAlignProperty
import typingsSlinky.mjmlReact.mod.BorderProps
import typingsSlinky.mjmlReact.mod.ClassNameProps
import typingsSlinky.mjmlReact.mod.MjmlSpacerProps
import typingsSlinky.mjmlReact.mod.PaddingProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlSpacer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.mjmlReact.mod.MjmlSpacer] {
  @JSImport("mjml-react", "MjmlSpacer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    border: String = null,
    borderBottom: String = null,
    borderLeft: String = null,
    borderRadius: String | Double = null,
    borderRight: String = null,
    borderTop: String = null,
    containerBackgroundColor: BackgroundColorProperty = null,
    cssClass: String = null,
    height: String | Double = null,
    padding: String | Double = null,
    paddingBottom: String | Double = null,
    paddingLeft: String | Double = null,
    paddingRight: String | Double = null,
    paddingTop: String | Double = null,
    verticalAlign: VerticalAlignProperty[String | Double] = null,
    width: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSpacer] = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
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
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.mjmlReact.mod.MjmlSpacer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.mjmlReact.mod.MjmlSpacer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MjmlSpacerProps with BorderProps with PaddingProps with ClassNameProps
}

