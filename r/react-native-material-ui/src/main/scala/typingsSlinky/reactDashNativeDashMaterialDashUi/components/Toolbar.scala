package typingsSlinky.reactDashNativeDashMaterialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.RightElementPressEvent
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Searchable
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ToolBarRightElement
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ToolbarProps
import typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ToolbarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toolbar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Toolbar
    ] {
  @JSImport("react-native-material-ui", "Toolbar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: hidden, size */
  def apply(
    centerElement: typingsSlinky.react.reactMod._Global_.JSX.Element | String = null,
    isSearchActive: js.UndefOr[Boolean] = js.undefined,
    leftElement: typingsSlinky.react.reactMod._Global_.JSX.Element | String = null,
    onLeftElementPress: () => Unit = null,
    onPress: () => Unit = null,
    onRightElementPress: /* e */ RightElementPressEvent => Unit = null,
    rightElement: typingsSlinky.react.reactMod._Global_.JSX.Element | String | js.Array[String] | ToolBarRightElement = null,
    searchable: Searchable = null,
    style: ToolbarStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Toolbar
  ] = {
    val __obj = js.Dynamic.literal()
    if (centerElement != null) __obj.updateDynamic("centerElement")(centerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(isSearchActive)) __obj.updateDynamic("isSearchActive")(isSearchActive.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (onLeftElementPress != null) __obj.updateDynamic("onLeftElementPress")(js.Any.fromFunction0(onLeftElementPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onRightElementPress != null) __obj.updateDynamic("onRightElementPress")(js.Any.fromFunction1(onRightElementPress))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (searchable != null) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Toolbar
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.Toolbar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ToolbarProps
}

