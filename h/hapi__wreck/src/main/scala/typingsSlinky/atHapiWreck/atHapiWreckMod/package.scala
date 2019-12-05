package typingsSlinky.atHapiWreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiWreckMod {
  import typingsSlinky.atHapiWreck.Anon_Payload
  import typingsSlinky.atHapiWreck.Anon_Req

  type RequestCallback = js.Function2[/* uri */ String, /* options */ RequestOptions with Anon_Payload, Unit]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typingsSlinky.atHapiBoom.atHapiBoomMod.^[js.Any]], 
    /* details */ Anon_Req, 
    Unit
  ]
}
