package typingsSlinky.awsSdkClientS3Node.typesMetricsAndOperatorMod

import typingsSlinky.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMetricsAndOperator extends MetricsAndOperator {
  /**
    * <p>The list of tags used when evaluating an AND predicate.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledMetricsAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
}

object UnmarshalledMetricsAndOperator {
  @scala.inline
  def apply(): UnmarshalledMetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMetricsAndOperator]
  }
  @scala.inline
  implicit class UnmarshalledMetricsAndOperatorOps[Self <: UnmarshalledMetricsAndOperator] (val x: Self) extends AnyVal {
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

