package typingsSlinky.awsSdkClientS3Node.typesMetricsFilterMod

import typingsSlinky.awsSdkClientS3Node.typesMetricsAndOperatorMod.UnmarshalledMetricsAndOperator
import typingsSlinky.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledMetricsFilter extends MetricsFilter {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  @JSName("And")
  var And_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledMetricsAndOperator] = js.native
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledMetricsFilter: js.UndefOr[UnmarshalledTag] = js.native
}

object UnmarshalledMetricsFilter {
  @scala.inline
  def apply(): UnmarshalledMetricsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledMetricsFilter]
  }
  @scala.inline
  implicit class UnmarshalledMetricsFilterOps[Self <: UnmarshalledMetricsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: UnmarshalledMetricsAndOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("And")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("And")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: UnmarshalledTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

