package typingsSlinky.awsSdkClientS3Node.typesPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part extends js.Object {
  /**
    * <p>Entity tag returned when the part was uploaded.</p>
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * <p>Date and time at which the part was uploaded.</p>
    */
  var LastModified: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Part number identifying the part. This is a positive integer between 1 and 10,000.</p>
    */
  var PartNumber: js.UndefOr[Double] = js.native
  /**
    * <p>Size of the uploaded part data.</p>
    */
  var Size: js.UndefOr[Double] = js.native
}

object Part {
  @scala.inline
  def apply(): Part = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Part]
  }
  @scala.inline
  implicit class PartOps[Self <: Part] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withPartNumber(value: Double): Self = {
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
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
  }
  
}

