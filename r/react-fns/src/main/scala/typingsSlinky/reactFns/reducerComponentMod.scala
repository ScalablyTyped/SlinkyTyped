package typingsSlinky.reactFns

import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducerComponentMod {
  
  @JSImport("react-fns/dist/ReducerComponent", "ReducerComponent")
  @js.native
  class ReducerComponent[P, S, A] protected ()
    extends Component[P, S, js.Any] {
    def this(props: P) = this()
    
    def dispatch(action: A): Unit = js.native
    
    def reducer(state: S, action: A): S = js.native
  }
}
