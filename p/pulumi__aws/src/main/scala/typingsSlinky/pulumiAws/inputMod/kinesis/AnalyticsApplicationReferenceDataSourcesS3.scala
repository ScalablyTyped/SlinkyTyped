package typingsSlinky.pulumiAws.inputMod.kinesis

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesS3 extends js.Object {
  var bucketArn: Input[String] = js.native
  var fileKey: Input[String] = js.native
  var roleArn: Input[String] = js.native
}

object AnalyticsApplicationReferenceDataSourcesS3 {
  @scala.inline
  def apply(bucketArn: Input[String], fileKey: Input[String], roleArn: Input[String]): AnalyticsApplicationReferenceDataSourcesS3 = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesS3]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesS3Ops[Self <: AnalyticsApplicationReferenceDataSourcesS3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

