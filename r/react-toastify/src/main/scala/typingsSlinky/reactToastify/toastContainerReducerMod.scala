package typingsSlinky.reactToastify

import typingsSlinky.reactToastify.reactToastifyStrings.ADD
import typingsSlinky.reactToastify.reactToastifyStrings.REMOVE
import typingsSlinky.reactToastify.typesMod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastContainerReducerMod {
  
  @JSImport("react-toastify/dist/hooks/toastContainerReducer", "reducer")
  @js.native
  def reducer(state: State, action: Action): js.Array[Id] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastify.anon.StaleId
    - typingsSlinky.reactToastify.anon.ToastId
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def StaleId(toastId: Id, `type`: ADD): typingsSlinky.reactToastify.anon.StaleId = {
      val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactToastify.anon.StaleId]
    }
    
    @scala.inline
    def ToastId(`type`: REMOVE): typingsSlinky.reactToastify.anon.ToastId = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactToastify.anon.ToastId]
    }
  }
  
  type State = js.Array[Id]
}
