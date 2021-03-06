package typingsSlinky.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowStateCellProps[D /* <: js.Object */] extends StObject {
  
  def setState(updater: UseRowUpdater[_]): Unit = js.native
  
  var state: UseRowStateLocalState[D, _] = js.native
}
object UseRowStateCellProps {
  
  @scala.inline
  def apply[D /* <: js.Object */](setState: UseRowUpdater[_] => Unit, state: UseRowStateLocalState[D, _]): UseRowStateCellProps[D] = {
    val __obj = js.Dynamic.literal(setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRowStateCellProps[D]]
  }
  
  @scala.inline
  implicit class UseRowStateCellPropsMutableBuilder[Self <: UseRowStateCellProps[_], D /* <: js.Object */] (val x: Self with UseRowStateCellProps[D]) extends AnyVal {
    
    @scala.inline
    def setSetState(value: UseRowUpdater[_] => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setState(value: UseRowStateLocalState[D, _]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
