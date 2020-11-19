package typingsSlinky.reactNavigation.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class NavigationContainerPropsOps[Self <: NavigationContainerProps[_, _, _], State, Options, ScreenProps] (val x: Self with (NavigationContainerProps[State, Options, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnableURLHandling(value: Boolean): Self = this.set("enableURLHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableURLHandling: Self = this.set("enableURLHandling", js.undefined)
    
    @scala.inline
    def setLoadNavigationState(value: () => js.Promise[_]): Self = this.set("loadNavigationState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLoadNavigationState: Self = this.set("loadNavigationState", js.undefined)
    
    @scala.inline
    def setNavigation(value: NavigationScreenProp[State, NavigationParams]): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setNavigationOptions(value: Options): Self = this.set("navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationOptions: Self = this.set("navigationOptions", js.undefined)
    
    @scala.inline
    def setOnNavigationStateChange(
      value: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null]
    ): Self = this.set("onNavigationStateChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnNavigationStateChange: Self = this.set("onNavigationStateChange", js.undefined)
    
    @scala.inline
    def setPersistNavigationState(value: /* state */ NavigationState => js.Promise[_]): Self = this.set("persistNavigationState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePersistNavigationState: Self = this.set("persistNavigationState", js.undefined)
    
    @scala.inline
    def setPersistenceKey(value: String): Self = this.set("persistenceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistenceKey: Self = this.set("persistenceKey", js.undefined)
    
    @scala.inline
    def setPersistenceKeyNull: Self = this.set("persistenceKey", null)
    
    @scala.inline
    def setRenderLoadingExperimentalFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("renderLoadingExperimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLoadingExperimentalComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("renderLoadingExperimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLoadingExperimental(value: ReactComponentClass[js.Object]): Self = this.set("renderLoadingExperimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderLoadingExperimental: Self = this.set("renderLoadingExperimental", js.undefined)
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setUriPrefixRegExp(value: js.RegExp): Self = this.set("uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPrefix(value: String | js.RegExp): Self = this.set("uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriPrefix: Self = this.set("uriPrefix", js.undefined)
  }
}
