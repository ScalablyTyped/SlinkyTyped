package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationContainerProps[State, Options, ScreenProps] extends js.Object {
  /**
    * Controls whether the navigation container handles URLs opened via 'Linking'
    * @see https://facebook.github.io/react-native/docs/linking
    * @see https://reactnavigation.org/docs/en/deep-linking.html
    */
  var enableURLHandling: js.UndefOr[Boolean] = js.native
  var loadNavigationState: js.UndefOr[js.Function0[js.Promise[_]]] = js.native
  var navigation: js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  var navigationOptions: js.UndefOr[Options] = js.native
   // defaults to true
  var onNavigationStateChange: js.UndefOr[
    js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[Unit | Null]
    ]
  ] = js.native
  var persistNavigationState: js.UndefOr[js.Function1[/* state */ NavigationState, js.Promise[_]]] = js.native
  /*
    * This prop is no longer supported. Use `loadNavigationState` and
    * `persistNavigationState` instead.
    */
  var persistenceKey: js.UndefOr[String | Null] = js.native
  var renderLoadingExperimental: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var screenProps: js.UndefOr[ScreenProps] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var uriPrefix: js.UndefOr[String | js.RegExp] = js.native
}

object NavigationContainerProps {
  @scala.inline
  def apply[State, Options, ScreenProps](): NavigationContainerProps[State, Options, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerProps[State, Options, ScreenProps]]
  }
  @scala.inline
  implicit class NavigationContainerPropsOps[Self[state, options, screenprops] <: NavigationContainerProps[state, options, screenprops], State, Options, ScreenProps] (val x: Self[State, Options, ScreenProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[State, Options, ScreenProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[State, Options, ScreenProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[State, Options, ScreenProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[State, Options, ScreenProps]) with Other]
    @scala.inline
    def withEnableURLHandling(value: Boolean): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableURLHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableURLHandling: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableURLHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadNavigationState(value: () => js.Promise[_]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNavigationState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadNavigationState: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadNavigationState")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: NavigationScreenProp[State, NavigationParams]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationOptions(value: Options): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationOptions: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigationStateChange(
      value: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null]
    ): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationStateChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNavigationStateChange: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigationStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistNavigationState(value: /* state */ NavigationState => js.Promise[_]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistNavigationState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPersistNavigationState: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistNavigationState")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceKey(value: String): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistenceKey: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistenceKeyNull: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceKey")(null)
        ret
    }
    @scala.inline
    def withRenderLoadingExperimentalFunctionComponent(value: ReactComponentClass[js.Object]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLoadingExperimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderLoadingExperimentalComponentClass(value: ReactComponentClass[js.Object]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLoadingExperimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderLoadingExperimental(value: ReactComponentClass[js.Object]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLoadingExperimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderLoadingExperimental: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLoadingExperimental")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenProps(value: ScreenProps): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenProps: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenProps")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[ViewStyle]): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withUriPrefixRegExp(value: js.RegExp): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUriPrefix(value: String | js.RegExp): Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriPrefix: Self[State, Options, ScreenProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriPrefix")(js.undefined)
        ret
    }
  }
  
}

