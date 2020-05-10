package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocalizedRuleName extends js.Object {
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var urlBlocks: js.UndefOr[js.Array[AnonHeader]] = js.native
}

object AnonLocalizedRuleName {
  @scala.inline
  def apply(): AnonLocalizedRuleName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLocalizedRuleName]
  }
  @scala.inline
  implicit class AnonLocalizedRuleNameOps[Self <: AnonLocalizedRuleName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalizedRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedRuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleImpact(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleImpact")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlBlocks(value: js.Array[AnonHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlBlocks")(js.undefined)
        ret
    }
  }
  
}

