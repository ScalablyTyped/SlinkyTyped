package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownstreamOnly extends js.Object {
  var downstreamOnly: Boolean = js.native
  var expr: Null | String = js.native
}

object DownstreamOnly {
  @scala.inline
  def apply(downstreamOnly: Boolean): DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownstreamOnly]
  }
  @scala.inline
  implicit class DownstreamOnlyOps[Self <: DownstreamOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownstreamOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downstreamOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExprNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(null)
        ret
    }
  }
  
}

