package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.AppBarProps
import typingsSlinky.materialUi.appBarMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/AppBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    iconClassNameLeft: String = null,
    iconClassNameRight: String = null,
    iconElementLeft: ReactElement = null,
    iconElementRight: ReactElement = null,
    iconStyleLeft: CSSProperties = null,
    iconStyleRight: CSSProperties = null,
    onLeftIconButtonClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onRightIconButtonClick: SyntheticMouseEvent[js.Object] => Unit = null,
    onTitleClick: SyntheticMouseEvent[js.Object] => Unit = null,
    showMenuIconButton: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    titleStyle: CSSProperties = null,
    zDepth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (iconClassNameLeft != null) __obj.updateDynamic("iconClassNameLeft")(iconClassNameLeft.asInstanceOf[js.Any])
    if (iconClassNameRight != null) __obj.updateDynamic("iconClassNameRight")(iconClassNameRight.asInstanceOf[js.Any])
    if (iconElementLeft != null) __obj.updateDynamic("iconElementLeft")(iconElementLeft.asInstanceOf[js.Any])
    if (iconElementRight != null) __obj.updateDynamic("iconElementRight")(iconElementRight.asInstanceOf[js.Any])
    if (iconStyleLeft != null) __obj.updateDynamic("iconStyleLeft")(iconStyleLeft.asInstanceOf[js.Any])
    if (iconStyleRight != null) __obj.updateDynamic("iconStyleRight")(iconStyleRight.asInstanceOf[js.Any])
    if (onLeftIconButtonClick != null) __obj.updateDynamic("onLeftIconButtonClick")(js.Any.fromFunction1(onLeftIconButtonClick))
    if (onRightIconButtonClick != null) __obj.updateDynamic("onRightIconButtonClick")(js.Any.fromFunction1(onRightIconButtonClick))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (!js.isUndefined(showMenuIconButton)) __obj.updateDynamic("showMenuIconButton")(showMenuIconButton.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialUi.appBarMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AppBarProps
}

