package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLS3DataSource extends js.Object {
  /**
    * The data type.
    */
  var S3DataType: AutoMLS3DataType = js.native
  /**
    * The URL to the Amazon S3 data source.
    */
  var S3Uri: typingsSlinky.awsSdk.sagemakerMod.S3Uri = js.native
}

object AutoMLS3DataSource {
  @scala.inline
  def apply(S3DataType: AutoMLS3DataType, S3Uri: S3Uri): AutoMLS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLS3DataSource]
  }
  @scala.inline
  implicit class AutoMLS3DataSourceOps[Self <: AutoMLS3DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3DataType(value: AutoMLS3DataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

