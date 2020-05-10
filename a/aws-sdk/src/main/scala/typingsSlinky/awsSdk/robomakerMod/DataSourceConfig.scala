package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceConfig extends js.Object {
  /**
    * The name of the data source.
    */
  var name: Name = js.native
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: S3Bucket = js.native
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: S3Keys = js.native
}

object DataSourceConfig {
  @scala.inline
  def apply(name: Name, s3Bucket: S3Bucket, s3Keys: S3Keys): DataSourceConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Keys = s3Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceConfig]
  }
  @scala.inline
  implicit class DataSourceConfigOps[Self <: DataSourceConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Keys(value: S3Keys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Keys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

