package typingsSlinky.reactNativeWindows

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeWindows.flyoutPropsMod.IFlyoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flyoutMod {
  
  @JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout")
  @js.native
  class Flyout protected ()
    extends Component[IFlyoutProps, IFlyoutTargetState, js.Any] {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  object Flyout {
    
    @JSImport("react-native-windows/Libraries/Components/Flyout/Flyout", "Flyout.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = js.native
  }
  
  @js.native
  trait IFlyoutTargetState extends StObject {
    
    var target: js.UndefOr[Double | Null] = js.native
    
    var targetRef: js.UndefOr[ReactElement] = js.native
  }
  object IFlyoutTargetState {
    
    @scala.inline
    def apply(): IFlyoutTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlyoutTargetState]
    }
    
    @scala.inline
    implicit class IFlyoutTargetStateMutableBuilder[Self <: IFlyoutTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetRef(value: ReactElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefReactElement(value: ReactElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
