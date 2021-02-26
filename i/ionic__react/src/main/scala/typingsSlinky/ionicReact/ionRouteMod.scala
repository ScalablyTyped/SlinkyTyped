package typingsSlinky.ionicReact

import slinky.core.facade.ReactElement
import typingsSlinky.ionicReact.navContextMod.NavContextState
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ContextType
import typingsSlinky.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionRouteMod {
  
  @JSImport("@ionic/react/dist/types/components/IonRoute", "IonRoute")
  @js.native
  class IonRoute protected ()
    extends PureComponent[IonRouteProps, IonRouteState, js.Any] {
    def this(props: IonRouteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IonRouteProps, context: js.Any) = this()
    
    @JSName("context")
    var context_IonRoute: ContextType[Context[NavContextState]] = js.native
  }
  
  @js.native
  trait IonRouteProps extends StObject {
    
    var disableIonPageManagement: js.UndefOr[Boolean] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    def render(): ReactElement = js.native
    def render(props: js.Any): ReactElement = js.native
    
    var show: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait IonRouteState extends StObject
}
