package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typingsSlinky.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typingsSlinky.reactNativeNavigation.constantsMod.NavigationConstants
import typingsSlinky.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typingsSlinky.reactNativeNavigation.navigationMod.NavigationRoot
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactNativeNavigationMod extends js.Object {
  
  val Navigation: NavigationRoot = js.native
  
  @js.native
  object CommandName extends js.Object {
    
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
  
  @js.native
  class Constants protected ()
    extends typingsSlinky.reactNativeNavigation.constantsMod.Constants
  /* static members */
  @js.native
  object Constants extends js.Object {
    
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  class EventsRegistry protected ()
    extends typingsSlinky.reactNativeNavigation.eventsRegistryMod.EventsRegistry {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
  }
  
  @js.native
  class NavigationComponent[Props, State, Snapshot] ()
    extends typingsSlinky.reactNativeNavigation.navigationComponentMod.NavigationComponent[Props, State, Snapshot]
  /* static members */
  @js.native
  object NavigationComponent extends js.Object {
    
    /**
      * Options used to apply a style configuration when the screen appears.
      *
      * This field can either contain the concrete options to be applied, or a generator function
      * which accepts props and returns an Options object.
      */
    var options: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    
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
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    
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
