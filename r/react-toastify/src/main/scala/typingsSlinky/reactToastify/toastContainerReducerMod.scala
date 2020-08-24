package typingsSlinky.reactToastify

import typingsSlinky.reactToastify.typesMod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastify/dist/hooks/toastContainerReducer", JSImport.Namespace)
@js.native
object toastContainerReducerMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactToastify.anon.StaleId
    - typingsSlinky.reactToastify.anon.ToastId
  */
  trait Action extends js.Object
  
  def reducer(state: State, action: Action): js.Array[Id] = js.native
  type State = js.Array[Id]
}

