package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to a request to list autoscaling policies in a project.
  */
@js.native
trait SchemaListAutoscalingPoliciesResponse extends js.Object {
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. Autoscaling policies list.
    */
  var policies: js.UndefOr[js.Array[SchemaAutoscalingPolicy]] = js.native
}

object SchemaListAutoscalingPoliciesResponse {
  @scala.inline
  def apply(): SchemaListAutoscalingPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAutoscalingPoliciesResponse]
  }
  @scala.inline
  implicit class SchemaListAutoscalingPoliciesResponseOps[Self <: SchemaListAutoscalingPoliciesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: js.Array[SchemaAutoscalingPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
  }
  
}

