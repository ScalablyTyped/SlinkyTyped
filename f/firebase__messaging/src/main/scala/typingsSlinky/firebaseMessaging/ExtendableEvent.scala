package typingsSlinky.firebaseMessaging

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendableEvent extends Event {
  
  def waitUntil(f: js.Promise[_]): Unit = js.native
}
