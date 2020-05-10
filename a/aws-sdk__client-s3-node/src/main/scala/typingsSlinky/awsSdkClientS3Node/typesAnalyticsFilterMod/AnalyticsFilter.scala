package typingsSlinky.awsSdkClientS3Node.typesAnalyticsFilterMod

import typingsSlinky.awsSdkClientS3Node.typesAnalyticsAndOperatorMod.AnalyticsAndOperator
import typingsSlinky.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsFilter extends js.Object {
  /**
    * <p>A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.</p>
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.native
  /**
    * <p>The prefix to use when evaluating an analytics filter.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The tag to use when evaluating an analytics filter.</p>
    */
  var Tag: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesTagMod.Tag] = js.native
}

object AnalyticsFilter {
  @scala.inline
  def apply(): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsFilter]
  }
  @scala.inline
  implicit class AnalyticsFilterOps[Self <: AnalyticsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: AnalyticsAndOperator): Self = {
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

