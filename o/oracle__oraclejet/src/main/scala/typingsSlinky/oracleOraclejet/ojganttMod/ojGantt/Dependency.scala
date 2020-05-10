package typingsSlinky.oracleOraclejet.ojganttMod.ojGantt

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.finishStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startFinish
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.startStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Dependency[K1, K2] extends js.Object {
  var id: K1 = js.native
  var predecessorTaskId: K2 = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var successorTaskId: K2 = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var `type`: js.UndefOr[startStart | startFinish | finishFinish | finishStart] = js.native
}

object Dependency {
  @scala.inline
  def apply[K1, K2](id: K1, predecessorTaskId: K2, successorTaskId: K2): Dependency[K1, K2] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency[K1, K2]]
  }
  @scala.inline
  implicit class DependencyOps[Self[k1, k2] <: Dependency[k1, k2], K1, K2] (val x: Self[K1, K2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K1, K2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K1, K2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K1, K2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K1, K2]) with Other]
    @scala.inline
    def withId(value: K1): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPredecessorTaskId(value: K2): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predecessorTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessorTaskId(value: K2): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successorTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDesc(value: String): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDesc: Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgClassName: Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgStyle: Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: startStart | startFinish | finishFinish | finishStart): Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[K1, K2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

