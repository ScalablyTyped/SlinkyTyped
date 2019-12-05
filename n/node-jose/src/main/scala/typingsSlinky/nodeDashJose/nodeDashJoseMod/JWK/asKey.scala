package typingsSlinky.nodeDashJose.nodeDashJoseMod.JWK

import typingsSlinky.node.Buffer
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.`private`
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.json
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.pem
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.pkcs8
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.pkix
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.public
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.spki
import typingsSlinky.nodeDashJose.nodeDashJoseStrings.x509
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK.asKey")
@js.native
object asKey extends js.Object {
  def apply(key: String | Buffer | js.Object | RawKey): js.Promise[Key] = js.native
  def apply(
    key: String | Buffer | js.Object | RawKey,
    form: json | `private` | pkcs8 | public | spki | pkix | x509 | pem
  ): js.Promise[Key] = js.native
}

