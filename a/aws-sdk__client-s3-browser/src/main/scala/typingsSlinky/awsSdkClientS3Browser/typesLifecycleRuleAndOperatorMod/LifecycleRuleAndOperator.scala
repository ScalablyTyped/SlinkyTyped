package typingsSlinky.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod

import typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.native
}

object LifecycleRuleAndOperator {
  @scala.inline
  def apply(): LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleAndOperator]
  }
  @scala.inline
  implicit class LifecycleRuleAndOperatorOps[Self <: LifecycleRuleAndOperator] (val x: Self) extends AnyVal {
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

