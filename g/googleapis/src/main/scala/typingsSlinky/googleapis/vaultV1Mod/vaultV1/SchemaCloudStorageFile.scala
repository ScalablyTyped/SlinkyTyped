package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An export file on cloud storage
  */
@js.native
trait SchemaCloudStorageFile extends js.Object {
  /**
    * The cloud storage bucket name of this export file. Can be used in cloud
    * storage JSON/XML API.
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * The md5 hash of the file.
    */
  var md5Hash: js.UndefOr[String] = js.native
  /**
    * The cloud storage object name of this export file. Can be used in cloud
    * storage JSON/XML API.
    */
  var objectName: js.UndefOr[String] = js.native
  /**
    * The size of the export file.
    */
  var size: js.UndefOr[String] = js.native
}

object SchemaCloudStorageFile {
  @scala.inline
  def apply(): SchemaCloudStorageFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageFile]
  }
  @scala.inline
  implicit class SchemaCloudStorageFileOps[Self <: SchemaCloudStorageFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5Hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5Hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5Hash")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectName")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

