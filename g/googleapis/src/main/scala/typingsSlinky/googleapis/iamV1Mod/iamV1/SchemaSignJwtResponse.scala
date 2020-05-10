package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign JWT response.
  */
@js.native
trait SchemaSignJwtResponse extends js.Object {
  /**
    * The id of the key used to sign the JWT.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed JWT.
    */
  var signedJwt: js.UndefOr[String] = js.native
}

object SchemaSignJwtResponse {
  @scala.inline
  def apply(): SchemaSignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignJwtResponse]
  }
  @scala.inline
  implicit class SchemaSignJwtResponseOps[Self <: SchemaSignJwtResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedJwt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedJwt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedJwt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedJwt")(js.undefined)
        ret
    }
  }
  
}

