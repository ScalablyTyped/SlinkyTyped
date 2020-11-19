package typingsSlinky.reactNativeNavigation

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typingsSlinky.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typingsSlinky.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typingsSlinky.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/interfaces/NavigationComponent", JSImport.Namespace)
@js.native
object navigationComponentMod extends js.Object {
  
  @js.native
  class NavigationComponent[Props, State, Snapshot] () extends Component[Props with NavigationComponentProps, State, Snapshot] {
    
    def componentDidAppear(_event: ComponentDidAppearEvent): Unit = js.native
    
    def componentDidDisappear(_event: ComponentDidDisappearEvent): Unit = js.native
    
    def modalAttemptedToDismiss(_event: ModalAttemptedToDismissEvent): Unit = js.native
    
    def modalDismissed(_event: ModalDismissedEvent): Unit = js.native
    
    def navigationButtonPressed(_event: NavigationButtonPressedEvent): Unit = js.native
    
    def previewCompleted(_event: PreviewCompletedEvent): Unit = js.native
    
    def screenPopped(_event: ScreenPoppedEvent): Unit = js.native
    
    def searchBarCancelPressed(_event: SearchBarCancelPressedEvent): Unit = js.native
    
    def searchBarUpdated(_event: SearchBarUpdatedEvent): Unit = js.native
  }
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
}
