package typingsSlinky.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineExpressionRequest extends js.Object {
  var DomainName: typingsSlinky.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
  var Expression: typingsSlinky.awsDashSdk.clientsCloudsearchMod.Expression = js.native
}

object DefineExpressionRequest {
  @scala.inline
  def apply(DomainName: DomainName, Expression: Expression): DefineExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineExpressionRequest]
  }
}

