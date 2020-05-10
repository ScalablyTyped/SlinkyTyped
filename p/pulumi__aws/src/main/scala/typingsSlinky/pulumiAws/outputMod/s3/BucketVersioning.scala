package typingsSlinky.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketVersioning extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`.
    */
  var mfaDelete: js.UndefOr[Boolean] = js.native
}

object BucketVersioning {
  @scala.inline
  def apply(): BucketVersioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketVersioning]
  }
  @scala.inline
  implicit class BucketVersioningOps[Self <: BucketVersioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMfaDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfaDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMfaDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfaDelete")(js.undefined)
        ret
    }
  }
  
}

