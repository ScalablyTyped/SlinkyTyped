package typingsSlinky.awsSdkClientS3Browser.typesLifecycleRuleFilterMod

import typingsSlinky.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.LifecycleRuleAndOperator
import typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRuleFilter extends js.Object {
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.native
  /**
    * <p>Prefix identifying one or more objects to which the rule applies.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  var Tag: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag] = js.native
}

object LifecycleRuleFilter {
  @scala.inline
  def apply(): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
  @scala.inline
  implicit class LifecycleRuleFilterOps[Self <: LifecycleRuleFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: LifecycleRuleAndOperator): Self = {
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

