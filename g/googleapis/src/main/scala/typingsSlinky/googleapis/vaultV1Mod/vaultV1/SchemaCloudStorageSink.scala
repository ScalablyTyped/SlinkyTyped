package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Export sink for cloud storage files.
  */
@js.native
trait SchemaCloudStorageSink extends js.Object {
  /**
    * Output only. The exported files on cloud storage.
    */
  var files: js.UndefOr[js.Array[SchemaCloudStorageFile]] = js.native
}

object SchemaCloudStorageSink {
  @scala.inline
  def apply(): SchemaCloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageSink]
  }
  @scala.inline
  implicit class SchemaCloudStorageSinkOps[Self <: SchemaCloudStorageSink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[SchemaCloudStorageFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
  }
  
}

