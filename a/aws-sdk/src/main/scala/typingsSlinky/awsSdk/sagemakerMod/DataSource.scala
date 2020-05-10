package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The file system that is associated with a channel.
    */
  var FileSystemDataSource: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FileSystemDataSource] = js.native
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.S3DataSource] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemDataSource(value: FileSystemDataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemDataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSystemDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemDataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withS3DataSource(value: S3DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3DataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataSource")(js.undefined)
        ret
    }
  }
  
}

