package typingsSlinky.gun.anon

import typingsSlinky.gun.gunStrings.PBKDF2
import typingsSlinky.gun.gunStrings.`SHA-256`
import typingsSlinky.gun.gunStrings.base16
import typingsSlinky.gun.gunStrings.base32
import typingsSlinky.gun.gunStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  name  :'SHA-256' | 'PBKDF2',   encode  :'base64' | 'base32' | 'base16',   iterations  :number,   salt  :any,   hash  :string,   length  :any}> */
@js.native
trait PartialnameSHA256PBKDF2en extends js.Object {
  var encode: js.UndefOr[base64 | base32 | base16] = js.native
  var hash: js.UndefOr[String] = js.native
  var iterations: js.UndefOr[Double] = js.native
  var length: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[`SHA-256` | PBKDF2] = js.native
  var salt: js.UndefOr[js.Any] = js.native
}

object PartialnameSHA256PBKDF2en {
  @scala.inline
  def apply(): PartialnameSHA256PBKDF2en = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialnameSHA256PBKDF2en]
  }
  @scala.inline
  implicit class PartialnameSHA256PBKDF2enOps[Self <: PartialnameSHA256PBKDF2en] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: base64 | base32 | base16): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: `SHA-256` | PBKDF2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
  }
  
}

