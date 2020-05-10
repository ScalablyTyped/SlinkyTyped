package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformDataSource extends js.Object {
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: TransformS3DataSource = js.native
}

object TransformDataSource {
  @scala.inline
  def apply(S3DataSource: TransformS3DataSource): TransformDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformDataSource]
  }
  @scala.inline
  implicit class TransformDataSourceOps[Self <: TransformDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3DataSource(value: TransformS3DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

