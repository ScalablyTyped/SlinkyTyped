package typingsSlinky.awsSdkClientS3Browser.typesAnalyticsAndOperatorMod

import typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsAndOperator extends js.Object {
  /**
    * <p>The prefix to use when evaluating an AND predicate.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The list of tags to use when evaluating an AND predicate.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.native
}

object AnalyticsAndOperator {
  @scala.inline
  def apply(): AnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsAndOperator]
  }
  @scala.inline
  implicit class AnalyticsAndOperatorOps[Self <: AnalyticsAndOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTagsIterable(value: js.Iterable[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag] | js.Iterable[Tag]): Self = {
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

