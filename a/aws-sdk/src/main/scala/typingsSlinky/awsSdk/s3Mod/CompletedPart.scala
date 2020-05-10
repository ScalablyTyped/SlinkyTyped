package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedPart extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ETag] = js.native
  /**
    * Part number that identifies the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typingsSlinky.awsSdk.s3Mod.PartNumber] = js.native
}

object CompletedPart {
  @scala.inline
  def apply(): CompletedPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedPart]
  }
  @scala.inline
  implicit class CompletedPartOps[Self <: CompletedPart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: ETag): Self = {
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
    def withPartNumber(value: PartNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartNumber")(js.undefined)
        ret
    }
  }
  
}

