package typingsSlinky.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryConfiguration extends js.Object {
  /**
    * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file system files in S3.
    */
  var ExportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your FSx for Lustre file system, for example s3://import-bucket/optional-prefix. If a prefix is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
    */
  var ImportPath: js.UndefOr[ArchivePath] = js.native
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.native
}

object DataRepositoryConfiguration {
  @scala.inline
  def apply(): DataRepositoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryConfiguration]
  }
  @scala.inline
  implicit class DataRepositoryConfigurationOps[Self <: DataRepositoryConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportPath(value: ArchivePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportPath")(js.undefined)
        ret
    }
    @scala.inline
    def withImportPath(value: ArchivePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportPath")(js.undefined)
        ret
    }
    @scala.inline
    def withImportedFileChunkSize(value: Megabytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedFileChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportedFileChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportedFileChunkSize")(js.undefined)
        ret
    }
  }
  
}

