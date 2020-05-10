package typingsSlinky.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPlansRequest extends js.Object {
  /**
    * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
    */
  var ApplicationSources: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ApplicationSources] = js.native
  /**
    * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.NextToken] = js.native
  /**
    * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
    */
  var ScalingPlanNames: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanNames] = js.native
  /**
    * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
    */
  var ScalingPlanVersion: js.UndefOr[typingsSlinky.awsSdk.autoscalingplansMod.ScalingPlanVersion] = js.native
}

object DescribeScalingPlansRequest {
  @scala.inline
  def apply(): DescribeScalingPlansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlansRequest]
  }
  @scala.inline
  implicit class DescribeScalingPlansRequestOps[Self <: DescribeScalingPlansRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationSources(value: ApplicationSources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSources")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingPlanNames(value: ScalingPlanNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPlanNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanNames")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingPlanVersion(value: ScalingPlanVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingPlanVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScalingPlanVersion")(js.undefined)
        ret
    }
  }
  
}

