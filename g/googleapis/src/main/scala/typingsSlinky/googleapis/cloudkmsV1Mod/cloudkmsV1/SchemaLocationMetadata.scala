package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud KMS metadata for the given google.cloud.location.Location.
  */
@js.native
trait SchemaLocationMetadata extends js.Object {
  /**
    * Indicates whether CryptoKeys with protection_level HSM can be created in
    * this location.
    */
  var hsmAvailable: js.UndefOr[Boolean] = js.native
}

object SchemaLocationMetadata {
  @scala.inline
  def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  @scala.inline
  implicit class SchemaLocationMetadataOps[Self <: SchemaLocationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmAvailable")(js.undefined)
        ret
    }
  }
  
}

