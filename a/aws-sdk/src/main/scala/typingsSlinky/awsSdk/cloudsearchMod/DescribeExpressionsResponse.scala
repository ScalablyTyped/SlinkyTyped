package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExpressionsResponse extends js.Object {
  /**
    * The expressions configured for the domain.
    */
  var Expressions: ExpressionStatusList = js.native
}

object DescribeExpressionsResponse {
  @scala.inline
  def apply(Expressions: ExpressionStatusList): DescribeExpressionsResponse = {
    val __obj = js.Dynamic.literal(Expressions = Expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExpressionsResponse]
  }
  @scala.inline
  implicit class DescribeExpressionsResponseOps[Self <: DescribeExpressionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressions(value: ExpressionStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expressions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

