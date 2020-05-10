package typingsSlinky.pulumiAws.analyticsConfigurationMod

import typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter
import typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsConfigurationArgs extends js.Object {
  val bucket: Input[String] = js.native
  val filter: js.UndefOr[Input[AnalyticsConfigurationFilter]] = js.native
  val name: js.UndefOr[Input[String]] = js.native
  val storageClassAnalysis: js.UndefOr[Input[AnalyticsConfigurationStorageClassAnalysis]] = js.native
}

object AnalyticsConfigurationArgs {
  @scala.inline
  def apply(bucket: Input[String]): AnalyticsConfigurationArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsConfigurationArgs]
  }
  @scala.inline
  implicit class AnalyticsConfigurationArgsOps[Self <: AnalyticsConfigurationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Input[AnalyticsConfigurationFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClassAnalysis(value: Input[AnalyticsConfigurationStorageClassAnalysis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClassAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClassAnalysis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClassAnalysis")(js.undefined)
        ret
    }
  }
  
}

