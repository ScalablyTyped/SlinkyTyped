package typingsSlinky.jose.mod.JWK

import typingsSlinky.jose.joseStrings.none
import typingsSlinky.jose.joseStrings.unsecured
import typingsSlinky.jose.mod.keyOperation
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoneKey extends js.Object {
  var alg: none = js.native
  var `type`: unsecured = js.native
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
}

