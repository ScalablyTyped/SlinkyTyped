package typingsSlinky.jose.mod.JWKS

import typingsSlinky.jose.mod.BasicParameters
import typingsSlinky.jose.mod.keyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyQuery extends BasicParameters {
  var crv: js.UndefOr[String] = js.native
  var kty: js.UndefOr[keyType] = js.native
  var thumbprint: js.UndefOr[String] = js.native
  var x5t: js.UndefOr[String] = js.native
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}

object KeyQuery {
  @scala.inline
  def apply(): KeyQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyQuery]
  }
  @scala.inline
  implicit class KeyQueryOps[Self <: KeyQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(js.undefined)
        ret
    }
    @scala.inline
    def withKty(value: keyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(js.undefined)
        ret
    }
    @scala.inline
    def withX5t(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5t: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t")(js.undefined)
        ret
    }
    @scala.inline
    def withX5tNumbersignS256(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t#S256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX5tNumbersignS256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x5t#S256")(js.undefined)
        ret
    }
  }
  
}

