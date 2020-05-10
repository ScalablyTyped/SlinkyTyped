package typingsSlinky.googleapis

import typingsSlinky.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeta extends js.Object {
  var beta: js.UndefOr[Boolean] = js.native
  var groups: js.UndefOr[js.Array[String]] = js.native
  var localizedRuleName: js.UndefOr[String] = js.native
  var ruleImpact: js.UndefOr[Double] = js.native
  var summary: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
  var urlBlocks: js.UndefOr[js.Array[AnonHeaderUrls]] = js.native
}

object AnonBeta {
  @scala.inline
  def apply(): AnonBeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBeta]
  }
  @scala.inline
  implicit class AnonBetaOps[Self <: AnonBeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
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
    def withSummary(value: SchemaPagespeedApiFormatStringV4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlBlocks(value: js.Array[AnonHeaderUrls]): Self = {
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

