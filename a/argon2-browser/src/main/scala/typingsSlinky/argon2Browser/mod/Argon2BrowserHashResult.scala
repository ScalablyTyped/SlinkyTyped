package typingsSlinky.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argon2BrowserHashResult extends js.Object {
  var encoded: String = js.native
  var hash: js.typedarray.Uint8Array = js.native
  var hashHex: String = js.native
}

object Argon2BrowserHashResult {
  @scala.inline
  def apply(encoded: String, hash: js.typedarray.Uint8Array, hashHex: String): Argon2BrowserHashResult = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashHex = hashHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2BrowserHashResult]
  }
  @scala.inline
  implicit class Argon2BrowserHashResultOps[Self <: Argon2BrowserHashResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashHex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

