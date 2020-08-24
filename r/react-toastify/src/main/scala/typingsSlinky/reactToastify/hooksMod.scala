package typingsSlinky.reactToastify

import typingsSlinky.reactToastify.anon.Collection
import typingsSlinky.reactToastify.anon.EventHandlers
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import typingsSlinky.reactToastify.typesMod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastify/dist/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  def useKeeper[T](arg: T): T = js.native
  def useKeeper[T](arg: T, refresh: Boolean): T = js.native
  def useToast(props: ToastProps): EventHandlers = js.native
  def useToastContainer(props: ToastContainerProps): Collection = js.native
}

