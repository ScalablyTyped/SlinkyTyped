package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing List Targeting Expression.
  */
@js.native
trait SchemaListTargetingExpression extends js.Object {
  /**
    * Expression describing which lists are being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.native
}

object SchemaListTargetingExpression {
  @scala.inline
  def apply(): SchemaListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTargetingExpression]
  }
  @scala.inline
  implicit class SchemaListTargetingExpressionOps[Self <: SchemaListTargetingExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(js.undefined)
        ret
    }
  }
  
}

