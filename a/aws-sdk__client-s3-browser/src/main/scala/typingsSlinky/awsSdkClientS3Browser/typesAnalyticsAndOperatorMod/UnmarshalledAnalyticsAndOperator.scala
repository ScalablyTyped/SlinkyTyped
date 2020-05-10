package typingsSlinky.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod

import typingsSlinky.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAnalyticsAndOperator extends AnalyticsAndOperator {
  /**
    * <p>The list of tags to use when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledAnalyticsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
}

object UnmarshalledAnalyticsAndOperator {
  @scala.inline
  def apply(): UnmarshalledAnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAnalyticsAndOperator]
  }
  @scala.inline
  implicit class UnmarshalledAnalyticsAndOperatorOps[Self <: UnmarshalledAnalyticsAndOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: js.Array[UnmarshalledTag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

