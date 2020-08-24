package typingsSlinky.nodeJose.mod.JWK

import typingsSlinky.node.Buffer
import typingsSlinky.nodeJose.nodeJoseStrings.`private`
import typingsSlinky.nodeJose.nodeJoseStrings.json
import typingsSlinky.nodeJose.nodeJoseStrings.pem
import typingsSlinky.nodeJose.nodeJoseStrings.pkcs8
import typingsSlinky.nodeJose.nodeJoseStrings.pkix
import typingsSlinky.nodeJose.nodeJoseStrings.public
import typingsSlinky.nodeJose.nodeJoseStrings.spki
import typingsSlinky.nodeJose.nodeJoseStrings.x509
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK.asKey")
@js.native
object asKey extends js.Object {
  def apply(
    key: String | Buffer | js.Object | RawKey,
    form: js.UndefOr[json | `private` | pkcs8 | public | spki | pkix | x509 | pem],
    extras: js.UndefOr[Record[String, _]]
  ): js.Promise[Key] = js.native
}

