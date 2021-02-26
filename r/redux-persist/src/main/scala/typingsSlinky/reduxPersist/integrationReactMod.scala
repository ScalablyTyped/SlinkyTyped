package typingsSlinky.reduxPersist

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reduxPersist.typesMod.Persistor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationReactMod {
  
  /**
    * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
    * @see Persistor
    * @see PersistGateProps
    * @see PersistGateState
    */
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  class PersistGate protected ()
    extends PureComponent[PersistGateProps, PersistorGateState, js.Any] {
    def this(props: PersistGateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PersistGateProps, context: js.Any) = this()
  }
  
  /** @see PersistGate */
  @js.native
  trait PersistGateProps extends StObject {
    
    var children: js.UndefOr[ReactElement | (js.Function1[/* bootstrapped */ Boolean, ReactElement])] = js.native
    
    var loading: js.UndefOr[ReactElement] = js.native
    
    var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.native
    
    var persistor: Persistor = js.native
  }
  object PersistGateProps {
    
    @scala.inline
    def apply(persistor: Persistor): PersistGateProps = {
      val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistGateProps]
    }
    
    @scala.inline
    implicit class PersistGatePropsMutableBuilder[Self <: PersistGateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | (js.Function1[/* bootstrapped */ Boolean, ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* bootstrapped */ Boolean => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLoading(value: ReactElement): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingReactElement(value: ReactElement): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnBeforeLift(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBeforeLift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeLiftUndefined: Self = StObject.set(x, "onBeforeLift", js.undefined)
      
      @scala.inline
      def setPersistor(value: Persistor): Self = StObject.set(x, "persistor", value.asInstanceOf[js.Any])
    }
  }
  
  /** @see PersistGate */
  @js.native
  trait PersistorGateState extends StObject {
    
    var bootstrapped: Boolean = js.native
  }
  object PersistorGateState {
    
    @scala.inline
    def apply(bootstrapped: Boolean): PersistorGateState = {
      val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistorGateState]
    }
    
    @scala.inline
    implicit class PersistorGateStateMutableBuilder[Self <: PersistorGateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapped(value: Boolean): Self = StObject.set(x, "bootstrapped", value.asInstanceOf[js.Any])
    }
  }
}
