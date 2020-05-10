package typingsSlinky.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeResult extends js.Object {
  var all: js.Array[CheckResult] = js.native
  var any: js.Array[CheckResult] = js.native
  var failureSummary: js.UndefOr[String] = js.native
  var html: String = js.native
  var impact: js.UndefOr[ImpactValue] = js.native
  var none: js.Array[CheckResult] = js.native
  var target: js.Array[String] = js.native
  var xpath: js.UndefOr[js.Array[String]] = js.native
}

object NodeResult {
  @scala.inline
  def apply(
    all: js.Array[CheckResult],
    any: js.Array[CheckResult],
    html: String,
    none: js.Array[CheckResult],
    target: js.Array[String]
  ): NodeResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeResult]
  }
  @scala.inline
  implicit class NodeResultOps[Self <: NodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: js.Array[CheckResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAny(value: js.Array[CheckResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: js.Array[CheckResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailureSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withImpact(value: ImpactValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(js.undefined)
        ret
    }
    @scala.inline
    def withXpath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(js.undefined)
        ret
    }
  }
  
}

