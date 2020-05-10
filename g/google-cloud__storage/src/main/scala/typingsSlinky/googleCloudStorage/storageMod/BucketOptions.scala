package typingsSlinky.googleCloudStorage.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketOptions extends js.Object {
  var kmsKeyName: js.UndefOr[String] = js.native
  var userProject: js.UndefOr[String] = js.native
}

object BucketOptions {
  @scala.inline
  def apply(): BucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOptions]
  }
  @scala.inline
  implicit class BucketOptionsOps[Self <: BucketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

