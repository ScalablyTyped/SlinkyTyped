package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExpressionRequest extends js.Object {
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * The name of the Expression to delete.
    */
  var ExpressionName: StandardName = js.native
}

object DeleteExpressionRequest {
  @scala.inline
  def apply(DomainName: DomainName, ExpressionName: StandardName): DeleteExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ExpressionName = ExpressionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionRequest]
  }
  @scala.inline
  implicit class DeleteExpressionRequestOps[Self <: DeleteExpressionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpressionName(value: StandardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpressionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

