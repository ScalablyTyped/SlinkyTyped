package typingsSlinky.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAfterAtRule extends js.Object {
  /**
    * Controls if a line break comes after an at-rule; e.g. `@charset`; defaults to `false`
    */
  var afterAtRule: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes after a block begins; e.g. `@media`; defaults to `false`
    */
  var afterBlockBegins: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes after a block ends, defaults to `false`
    */
  var afterBlockEnds: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes after a comment; defaults to `false`
    */
  var afterComment: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes after a property; defaults to `false`
    */
  var afterProperty: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes after a rule begins; defaults to `false`
    */
  var afterRuleBegins: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes after a rule ends; defaults to `false`
    */
  var afterRuleEnds: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes before a block ends; defaults to `false`
    */
  var beforeBlockEnds: js.UndefOr[Boolean] = js.native
  /**
    * Controls if a line break comes between selectors; defaults to `false`
    */
  var betweenSelectors: js.UndefOr[Boolean] = js.native
}

object AnonAfterAtRule {
  @scala.inline
  def apply(): AnonAfterAtRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAfterAtRule]
  }
  @scala.inline
  implicit class AnonAfterAtRuleOps[Self <: AnonAfterAtRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAtRule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAtRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterAtRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAtRule")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBlockBegins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlockBegins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBlockBegins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlockBegins")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterBlockEnds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlockEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterBlockEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterBlockEnds")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComment")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRuleBegins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRuleBegins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterRuleBegins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRuleBegins")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRuleEnds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRuleEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterRuleEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRuleEnds")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBlockEnds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlockEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBlockEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBlockEnds")(js.undefined)
        ret
    }
    @scala.inline
    def withBetweenSelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetweenSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweenSelectors")(js.undefined)
        ret
    }
  }
  
}

