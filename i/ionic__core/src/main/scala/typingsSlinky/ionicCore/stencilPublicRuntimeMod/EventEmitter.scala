package typingsSlinky.ionicCore.stencilPublicRuntimeMod

import org.scalajs.dom.raw.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter[T] extends js.Object {
  
  def emit(): CustomEvent = js.native
  def emit(data: T): CustomEvent = js.native
}
