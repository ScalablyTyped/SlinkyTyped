package typingsSlinky.reactRouterNavigation.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactRouterNavigation.mod.CardSubViewProps
import typingsSlinky.reactRouterNavigation.mod.NavigationComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouterNavigation.mod.Navigation] {
  @JSImport("react-router-navigation", "Navigation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    backButtonTintColor: String = null,
    backButtonTitle: String = null,
    cardStyle: StyleProp[ViewStyle] = null,
    configureTransition: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
    ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ _ = null,
    hideBackButton: js.UndefOr[Boolean] = js.undefined,
    hideNavBar: js.UndefOr[Boolean] = js.undefined,
    navBarStyle: StyleProp[ViewStyle] = null,
    onTransitionEnd: /* repeated */ js.Any => Unit = null,
    onTransitionStart: /* repeated */ js.Any => Unit = null,
    renderLeftButton: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderNavBar: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderRightButton: /* props */ CardSubViewProps => TagMod[Any] = null,
    renderTitle: /* props */ CardSubViewProps => TagMod[Any] = null,
    titleStyle: StyleProp[TextStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRouterNavigation.mod.Navigation] = {
    val __obj = js.Dynamic.literal()
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor.asInstanceOf[js.Any])
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (configureTransition != null) __obj.updateDynamic("configureTransition")(js.Any.fromFunction2(configureTransition))
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar.asInstanceOf[js.Any])
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction1(onTransitionStart))
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(js.Any.fromFunction1(renderLeftButton))
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(js.Any.fromFunction1(renderNavBar))
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(js.Any.fromFunction1(renderRightButton))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction1(renderTitle))
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactRouterNavigation.mod.Navigation] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactRouterNavigation.mod.Navigation](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NavigationComponentProps
}

