package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Source extends js.Object {
  /**
    * The amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn = js.native
  /**
    * A physical table type for as S3 data source.
    */
  var InputColumns: InputColumnList = js.native
  /**
    * Information about the format for the S3 source file or files.
    */
  var UploadSettings: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.UploadSettings] = js.native
}

object S3Source {
  @scala.inline
  def apply(DataSourceArn: Arn, InputColumns: InputColumnList): S3Source = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
  @scala.inline
  implicit class S3SourceOps[Self <: S3Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputColumns(value: InputColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadSettings(value: UploadSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadSettings")(js.undefined)
        ret
    }
  }
  
}

