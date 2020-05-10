package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxListObjectExpression...
  */
@js.native
trait INxListObjectExpression extends js.Object {
  /**
    * Gives information on the error.
    * >> This parameter is optional.
    */
  var qError: js.UndefOr[INxLayoutErrors] = js.native
  /**
    * Value of the expression.
    */
  var qExpr: String = js.native
}

object INxListObjectExpression {
  @scala.inline
  def apply(qExpr: String): INxListObjectExpression = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpression]
  }
  @scala.inline
  implicit class INxListObjectExpressionOps[Self <: INxListObjectExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQError(value: INxLayoutErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qError")(js.undefined)
        ret
    }
  }
  
}

