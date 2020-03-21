package typingsSlinky.reactRouterNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouterNavigation.mod.CardProps
import typingsSlinky.reactRouterNavigation.mod.CardSubViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-router-navigation", "Card")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    component: ReactComponentClass[RouterProps] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    path: String = null,
    render: /* props */ RouterProps => TagMod[Any] = null,
    renderLeftButton: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderNavBar: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderRightButton: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderTitle: /* props */ CardSubViewProps => TagMod[Any] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    titleStyle: StyleProp[TextStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor.asInstanceOf[js.Any])
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar.asInstanceOf[js.Any])
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1(renderLeftButton))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1(renderNavBar))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1(renderRightButton))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1(renderTitle))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CardProps
}

