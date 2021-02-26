package typingsSlinky.nextServer

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideEffectMod {
  
  @JSImport("next-server/dist/lib/side-effect", JSImport.Default)
  @js.native
  def default(): Instantiable = js.native
  
  @js.native
  trait SideEffectProps extends StObject {
    
    var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
    
    var inAmpMode: js.UndefOr[Boolean] = js.native
    
    def reduceComponentsToState[T](components: js.Array[ReactElement], props: T): State = js.native
  }
  object SideEffectProps {
    
    @scala.inline
    def apply(reduceComponentsToState: (js.Array[ReactElement], js.Any) => State): SideEffectProps = {
      val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
      __obj.asInstanceOf[SideEffectProps]
    }
    
    @scala.inline
    implicit class SideEffectPropsMutableBuilder[Self <: SideEffectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleStateChange(value: /* state */ State => Unit): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
      
      @scala.inline
      def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
      
      @scala.inline
      def setReduceComponentsToState(value: (js.Array[ReactElement], js.Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
    }
  }
  
  type State = js.UndefOr[js.Array[ReactElement]]
}
