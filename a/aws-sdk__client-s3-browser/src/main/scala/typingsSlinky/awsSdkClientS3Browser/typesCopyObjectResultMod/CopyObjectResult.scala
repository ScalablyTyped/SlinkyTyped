package typingsSlinky.awsSdkClientS3Browser.typesCopyObjectResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyObjectResult extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * _LastModified shape
    */
  var LastModified: js.UndefOr[js.Date | String | Double] = js.native
}

object CopyObjectResult {
  @scala.inline
  def apply(): CopyObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyObjectResult]
  }
  @scala.inline
  implicit class CopyObjectResultOps[Self <: CopyObjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModified")(js.undefined)
        ret
    }
  }
  
}

