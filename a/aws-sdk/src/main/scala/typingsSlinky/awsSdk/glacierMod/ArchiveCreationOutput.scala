package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveCreationOutput extends js.Object {
  /**
    * The ID of the archive. This value is also included as part of the location.
    */
  var archiveId: js.UndefOr[String] = js.native
  /**
    * The checksum of the archive computed by Amazon S3 Glacier.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The relative URI path of the newly added archive resource.
    */
  var location: js.UndefOr[String] = js.native
}

object ArchiveCreationOutput {
  @scala.inline
  def apply(): ArchiveCreationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveCreationOutput]
  }
  @scala.inline
  implicit class ArchiveCreationOutputOps[Self <: ArchiveCreationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveId")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

