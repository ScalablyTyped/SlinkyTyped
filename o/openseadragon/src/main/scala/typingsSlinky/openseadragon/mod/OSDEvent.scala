package typingsSlinky.openseadragon.mod

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSDEvent[T] extends Event {
  
  var eventSource: js.UndefOr[T] = js.native
  
  var userData: js.Any = js.native
}
