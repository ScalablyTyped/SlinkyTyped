package typingsSlinky.jsforce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "StreamingExtension")
@js.native
object StreamingExtension extends js.Object {
  
  @js.native
  class AuthFailure protected ()
    extends typingsSlinky.jsforce.streamingMod.StreamingExtension.AuthFailure {
    def this(failureCallback: js.Function0[_]) = this()
  }
  
  @js.native
  class Replay protected ()
    extends typingsSlinky.jsforce.streamingMod.StreamingExtension.Replay {
    def this(channel: String, replayId: Double) = this()
  }
}
