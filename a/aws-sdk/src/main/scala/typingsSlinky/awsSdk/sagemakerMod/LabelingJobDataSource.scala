package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobDataSource extends js.Object {
  /**
    * The Amazon S3 location of the input data objects.
    */
  var S3DataSource: LabelingJobS3DataSource = js.native
}

object LabelingJobDataSource {
  @scala.inline
  def apply(S3DataSource: LabelingJobS3DataSource): LabelingJobDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobDataSource]
  }
  @scala.inline
  implicit class LabelingJobDataSourceOps[Self <: LabelingJobDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3DataSource(value: LabelingJobS3DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3DataSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

