package typingsSlinky.googleapis.osloginV1alphaMod.osloginV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from importing an SSH public key.
  */
@js.native
trait SchemaImportSshPublicKeyResponse extends js.Object {
  /**
    * The login profile information for the user.
    */
  var loginProfile: js.UndefOr[SchemaLoginProfile] = js.native
}

object SchemaImportSshPublicKeyResponse {
  @scala.inline
  def apply(): SchemaImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportSshPublicKeyResponse]
  }
  @scala.inline
  implicit class SchemaImportSshPublicKeyResponseOps[Self <: SchemaImportSshPublicKeyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoginProfile(value: SchemaLoginProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginProfile")(js.undefined)
        ret
    }
  }
  
}

