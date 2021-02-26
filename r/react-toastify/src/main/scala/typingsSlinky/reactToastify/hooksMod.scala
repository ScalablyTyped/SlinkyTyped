package typingsSlinky.reactToastify

import typingsSlinky.reactToastify.anon.Collection
import typingsSlinky.reactToastify.anon.EventHandlers
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import typingsSlinky.reactToastify.typesMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-toastify/dist/hooks", "useKeeper")
  @js.native
  def useKeeper[T](arg: T): T = js.native
  @JSImport("react-toastify/dist/hooks", "useKeeper")
  @js.native
  def useKeeper[T](arg: T, refresh: Boolean): T = js.native
  
  @JSImport("react-toastify/dist/hooks", "useToast")
  @js.native
  def useToast(props: ToastProps): EventHandlers = js.native
  
  @JSImport("react-toastify/dist/hooks", "useToastContainer")
  @js.native
  def useToastContainer(props: ToastContainerProps): Collection = js.native
}
