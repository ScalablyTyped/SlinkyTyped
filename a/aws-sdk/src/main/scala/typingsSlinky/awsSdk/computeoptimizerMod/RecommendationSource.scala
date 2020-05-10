package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendationSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the recommendation source.
    */
  var recommendationSourceArn: js.UndefOr[RecommendationSourceArn] = js.native
  /**
    * The resource type of the recommendation source.
    */
  var recommendationSourceType: js.UndefOr[RecommendationSourceType] = js.native
}

object RecommendationSource {
  @scala.inline
  def apply(): RecommendationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSource]
  }
  @scala.inline
  implicit class RecommendationSourceOps[Self <: RecommendationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecommendationSourceArn(value: RecommendationSourceArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSourceArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendationSourceType(value: RecommendationSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendationSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendationSourceType")(js.undefined)
        ret
    }
  }
  
}

