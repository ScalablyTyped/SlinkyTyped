package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResult extends js.Object {
  /**
    * Information about a specific job, including shipping information, job status, and other important metadata.
    */
  var JobMetadata: js.UndefOr[typingsSlinky.awsSdk.snowballMod.JobMetadata] = js.native
  /**
    * Information about a specific job part (in the case of an export job), including shipping information, job status, and other important metadata.
    */
  var SubJobMetadata: js.UndefOr[JobMetadataList] = js.native
}

object DescribeJobResult {
  @scala.inline
  def apply(): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResult]
  }
  @scala.inline
  implicit class DescribeJobResultOps[Self <: DescribeJobResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobMetadata(value: JobMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSubJobMetadata(value: JobMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubJobMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubJobMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubJobMetadata")(js.undefined)
        ret
    }
  }
  
}

