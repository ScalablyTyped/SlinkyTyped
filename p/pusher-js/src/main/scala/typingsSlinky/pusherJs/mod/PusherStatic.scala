package typingsSlinky.pusherJs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PusherStatic
  extends Instantiable1[/* apiKey */ String, Pusher]
     with Instantiable2[/* apiKey */ String, /* config */ Config, Pusher] {
  
  var instances: js.Array[Pusher] = js.native
  
  var isReady: Boolean = js.native
  
  def log(msg: String): Unit = js.native
  
  var logToConsole: Boolean = js.native
}
