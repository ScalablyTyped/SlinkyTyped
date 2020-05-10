package typingsSlinky.awsSdkClientS3Browser.typesMetricsFilterMod

import typingsSlinky.awsSdkClientS3Browser.typesMetricsAndOperatorMod.MetricsAndOperator
import typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.</p>
    */
  var And: js.UndefOr[MetricsAndOperator] = js.native
  /**
    * <p>The prefix used when evaluating a metrics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The tag used when evaluating a metrics filter.</p>
    */
  var Tag: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag] = js.native
}

object MetricsFilter {
  @scala.inline
  def apply(): MetricsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsFilter]
  }
  @scala.inline
  implicit class MetricsFilterOps[Self <: MetricsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: MetricsAndOperator): Self = {
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: Tag): Self = {
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

