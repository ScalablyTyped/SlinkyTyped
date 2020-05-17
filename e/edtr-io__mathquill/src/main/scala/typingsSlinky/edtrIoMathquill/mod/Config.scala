package typingsSlinky.edtrIoMathquill.mod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.edtrIoMathquill.anon.Edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var autoCommands: js.UndefOr[String] = js.native
  var autoOperatorNames: js.UndefOr[String] = js.native
  var autoSubscriptNumerals: js.UndefOr[Boolean] = js.native
  var charsThatBreakOutOfSupSub: js.UndefOr[String] = js.native
  var handlers: js.UndefOr[Edit] = js.native
  var leftRightIntoCmdGoes: js.UndefOr[String] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var restrictMismatchedBrackets: js.UndefOr[Boolean] = js.native
  var spaceBehavesLikeTab: js.UndefOr[Boolean] = js.native
  var substituteTextarea: js.UndefOr[js.Function0[HTMLTextAreaElement]] = js.native
  var sumStartsWithNEquals: js.UndefOr[Boolean] = js.native
  var supSubsRequireOperand: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCommands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoOperatorNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOperatorNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOperatorNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOperatorNames")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSubscriptNumerals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSubscriptNumerals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSubscriptNumerals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSubscriptNumerals")(js.undefined)
        ret
    }
    @scala.inline
    def withCharsThatBreakOutOfSupSub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsThatBreakOutOfSupSub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharsThatBreakOutOfSupSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charsThatBreakOutOfSupSub")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlers(value: Edit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftRightIntoCmdGoes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftRightIntoCmdGoes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftRightIntoCmdGoes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftRightIntoCmdGoes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictMismatchedBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMismatchedBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictMismatchedBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMismatchedBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceBehavesLikeTab(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBehavesLikeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBehavesLikeTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBehavesLikeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstituteTextarea(value: () => HTMLTextAreaElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substituteTextarea")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSubstituteTextarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substituteTextarea")(js.undefined)
        ret
    }
    @scala.inline
    def withSumStartsWithNEquals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumStartsWithNEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSumStartsWithNEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumStartsWithNEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withSupSubsRequireOperand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supSubsRequireOperand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupSubsRequireOperand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supSubsRequireOperand")(js.undefined)
        ret
    }
  }
  
}

