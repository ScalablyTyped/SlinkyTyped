package typingsSlinky.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2BrowserHashResult extends js.Object {
  var encoded: String
  var hash: scala.scalajs.js.typedarray.Uint8Array
  var hashHex: String
}

object Argon2BrowserHashResult {
  @scala.inline
  def apply(encoded: String, hash: scala.scalajs.js.typedarray.Uint8Array, hashHex: String): Argon2BrowserHashResult = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashHex = hashHex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Argon2BrowserHashResult]
  }
}

