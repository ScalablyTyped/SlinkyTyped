package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobResource extends js.Object {
  /**
    * The Amazon Machine Images (AMIs) associated with this job.
    */
  var Ec2AmiResources: js.UndefOr[Ec2AmiResourceList] = js.native
  /**
    * The Python-language Lambda functions for this job.
    */
  var LambdaResources: js.UndefOr[LambdaResourceList] = js.native
  /**
    * An array of S3Resource objects.
    */
  var S3Resources: js.UndefOr[S3ResourceList] = js.native
}

object JobResource {
  @scala.inline
  def apply(): JobResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobResource]
  }
  @scala.inline
  implicit class JobResourceOps[Self <: JobResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2AmiResources(value: Ec2AmiResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2AmiResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2AmiResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2AmiResources")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaResources(value: LambdaResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaResources")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Resources(value: S3ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Resources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Resources")(js.undefined)
        ret
    }
  }
  
}

