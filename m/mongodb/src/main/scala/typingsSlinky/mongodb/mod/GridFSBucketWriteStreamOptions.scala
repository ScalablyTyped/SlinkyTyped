package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFSBucketWriteStreamOptions extends WriteConcern {
  /**
    * The chunk size to use, in bytes
    */
  var chunkSizeBytes: js.UndefOr[scala.Double] = js.native
  /**
    * Default false; If true, disables adding an md5 field to file data
    */
  var disableMD5: js.UndefOr[Boolean] = js.native
  /**
    * Custom file id for the GridFS file.
    */
  var id: js.UndefOr[GridFSBucketWriteStreamId] = js.native
}

object GridFSBucketWriteStreamOptions {
  @scala.inline
  def apply(): GridFSBucketWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketWriteStreamOptions]
  }
  @scala.inline
  implicit class GridFSBucketWriteStreamOptionsOps[Self <: GridFSBucketWriteStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSizeBytes(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: GridFSBucketWriteStreamId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

