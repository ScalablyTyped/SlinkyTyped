package typingsSlinky.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type DisconnectionListener = js.Function1[
    /* providerIdentity */ typingsSlinky.openfin.shapesIdentityMod.ProviderIdentity, 
    js.Any
  ]
}
