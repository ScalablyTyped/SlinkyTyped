package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait SchemaAsymmetricSignResponse extends js.Object {
  /**
    * The created signature.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaAsymmetricSignResponse {
  @scala.inline
  def apply(): SchemaAsymmetricSignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignResponse]
  }
  @scala.inline
  implicit class SchemaAsymmetricSignResponseOps[Self <: SchemaAsymmetricSignResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

