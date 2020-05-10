package typingsSlinky.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSignBlobResponse extends js.Object {
  /**
    * The ID of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed blob.
    */
  var signedBlob: js.UndefOr[String] = js.native
}

object SchemaSignBlobResponse {
  @scala.inline
  def apply(): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
  @scala.inline
  implicit class SchemaSignBlobResponseOps[Self <: SchemaSignBlobResponse] (val x: Self) extends AnyVal {
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
    def withSignedBlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedBlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedBlob")(js.undefined)
        ret
    }
  }
  
}

