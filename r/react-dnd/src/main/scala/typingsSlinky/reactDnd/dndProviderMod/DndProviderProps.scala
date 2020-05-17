package typingsSlinky.reactDnd.dndProviderMod

import typingsSlinky.reactDnd.anon.Backend
import typingsSlinky.reactDnd.anon.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactDnd.anon.Manager
  - typingsSlinky.reactDnd.anon.Backend[BackendContext, BackendOptions]
*/
trait DndProviderProps[BackendContext, BackendOptions] extends js.Object

object DndProviderProps {
  @scala.inline
  implicit def apply[BackendContext, BackendOptions](value: Backend[BackendContext, BackendOptions]): DndProviderProps[BackendContext, BackendOptions] = value.asInstanceOf[DndProviderProps[BackendContext, BackendOptions]]
  @scala.inline
  implicit def apply[BackendContext, BackendOptions](value: Manager): DndProviderProps[BackendContext, BackendOptions] = value.asInstanceOf[DndProviderProps[BackendContext, BackendOptions]]
}

