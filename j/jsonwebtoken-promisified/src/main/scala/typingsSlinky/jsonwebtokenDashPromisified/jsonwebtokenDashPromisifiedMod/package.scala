package typingsSlinky.jsonwebtokenDashPromisified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonwebtokenDashPromisifiedMod {
  import typingsSlinky.jsonwebtokenDashPromisified.Anon_Key
  import typingsSlinky.node.Buffer

  type Secret = String | Buffer | Anon_Key
  type SignCallback = js.Function2[/* err */ js.Error, /* encoded */ String, Unit]
  type VerifyCallback = js.Function2[
    /* err */ JsonWebTokenError | NotBeforeError | TokenExpiredError, 
    /* decoded */ js.Object | String, 
    Unit
  ]
}
