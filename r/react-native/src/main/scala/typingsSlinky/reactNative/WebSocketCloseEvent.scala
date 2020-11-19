package typingsSlinky.reactNative

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketCloseEvent extends Event {
  
  var code: js.UndefOr[Double] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
}
