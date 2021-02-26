package typingsSlinky.reactNativeNavigation

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typingsSlinky.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typingsSlinky.reactNativeNavigation.constantsMod.NavigationConstants
import typingsSlinky.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typingsSlinky.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typingsSlinky.reactNativeNavigation.navigationMod.NavigationRoot
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeNavigationMod {
  
  @JSImport("react-native-navigation", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactNativeNavigation.commandNameMod.CommandName with String] = js.native
    
    /* "dismissAllModals" */ val DismissAllModals: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.DismissAllModals with String = js.native
    
    /* "dismissModal" */ val DismissModal: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.DismissModal with String = js.native
    
    /* "dismissOverlay" */ val DismissOverlay: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.DismissOverlay with String = js.native
    
    /* "getLaunchArgs" */ val GetLaunchArgs: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.GetLaunchArgs with String = js.native
    
    /* "mergeOptions" */ val MergeOptions: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.MergeOptions with String = js.native
    
    /* "pop" */ val Pop: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.Pop with String = js.native
    
    /* "popTo" */ val PopTo: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.PopTo with String = js.native
    
    /* "popToRoot" */ val PopToRoot: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.PopToRoot with String = js.native
    
    /* "push" */ val Push: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.Push with String = js.native
    
    /* "setDefaultOptions" */ val SetDefaultOptions: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.SetDefaultOptions with String = js.native
    
    /* "setRoot" */ val SetRoot: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.SetRoot with String = js.native
    
    /* "setStackRoot" */ val SetStackRoot: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.SetStackRoot with String = js.native
    
    /* "showModal" */ val ShowModal: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.ShowModal with String = js.native
    
    /* "showOverlay" */ val ShowOverlay: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.ShowOverlay with String = js.native
    
    /* "updateProps" */ val UpdateProps: typingsSlinky.reactNativeNavigation.commandNameMod.CommandName.UpdateProps with String = js.native
  }
  
  @JSImport("react-native-navigation", "Constants")
  @js.native
  class Constants protected ()
    extends typingsSlinky.reactNativeNavigation.constantsMod.Constants
  /* static members */
  object Constants {
    
    @JSImport("react-native-navigation", "Constants.get")
    @js.native
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @JSImport("react-native-navigation", "EventsRegistry")
  @js.native
  class EventsRegistry protected ()
    extends typingsSlinky.reactNativeNavigation.eventsRegistryMod.EventsRegistry {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
  }
  
  object Navigation extends Shortcut {
    
    @JSImport("react-native-navigation", "Navigation")
    @js.native
    val ^ : NavigationRoot = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-navigation", "Navigation.TouchablePreview")
    @js.native
    class TouchablePreview ()
      extends typingsSlinky.reactNativeNavigation.touchablePreviewMod.TouchablePreview
    
    type _To = NavigationRoot
    
    /* This means you don't have to write `^`, but can instead just say `Navigation.foo` */
    override def _to: NavigationRoot = ^
  }
  
  @JSImport("react-native-navigation", "NavigationComponent")
  @js.native
  class NavigationComponent[Props, State, Snapshot] protected ()
    extends typingsSlinky.reactNativeNavigation.navigationComponentMod.NavigationComponent[Props, State, Snapshot] {
    def this(props: Props with NavigationComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props with NavigationComponentProps, context: js.Any) = this()
  }
  /* static members */
  object NavigationComponent {
    
    @JSImport("react-native-navigation", "NavigationComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Options used to apply a style configuration when the screen appears.
      *
      * This field can either contain the concrete options to be applied, or a generator function
      * which accepts props and returns an Options object.
      */
    @JSImport("react-native-navigation", "NavigationComponent.options")
    @js.native
    def options: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options = js.native
    @scala.inline
    def options_=(x: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-navigation", "OptionsModalPresentationStyle")
  @js.native
  object OptionsModalPresentationStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle with String
      ] = js.native
    
    /* "currentContext" */ val currentContext: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    
    /* "formSheet" */ val formSheet: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    
    /* "fullScreen" */ val fullScreen: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    
    /* "none" */ val none: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none with String = js.native
    
    /* "overCurrentContext" */ val overCurrentContext: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    
    /* "overFullScreen" */ val overFullScreen: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    
    /* "pageSheet" */ val pageSheet: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    
    /* "popover" */ val popover: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popover with String = js.native
  }
  
  @JSImport("react-native-navigation", "OptionsModalTransitionStyle")
  @js.native
  object OptionsModalTransitionStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle with String
      ] = js.native
    
    /* "coverVertical" */ val coverVertical: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    
    /* "crossDissolve" */ val crossDissolve: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    
    /* "flipHorizontal" */ val flipHorizontal: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    
    /* "partialCurl" */ val partialCurl: typingsSlinky.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
  }
}
