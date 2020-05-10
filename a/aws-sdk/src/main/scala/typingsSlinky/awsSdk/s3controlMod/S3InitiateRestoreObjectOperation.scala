package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3InitiateRestoreObjectOperation extends js.Object {
  /**
    * 
    */
  var ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.native
  /**
    * 
    */
  var GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.native
}

object S3InitiateRestoreObjectOperation {
  @scala.inline
  def apply(): S3InitiateRestoreObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
  }
  @scala.inline
  implicit class S3InitiateRestoreObjectOperationOps[Self <: S3InitiateRestoreObjectOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationInDays(value: S3ExpirationInDays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withGlacierJobTier(value: S3GlacierJobTier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlacierJobTier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlacierJobTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlacierJobTier")(js.undefined)
        ret
    }
  }
  
}

