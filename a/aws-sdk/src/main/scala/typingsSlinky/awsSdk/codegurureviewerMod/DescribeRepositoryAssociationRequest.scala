package typingsSlinky.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryAssociationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the association.
    */
  var AssociationArn: Arn = js.native
}

object DescribeRepositoryAssociationRequest {
  @scala.inline
  def apply(AssociationArn: Arn): DescribeRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
  }
  @scala.inline
  implicit class DescribeRepositoryAssociationRequestOps[Self <: DescribeRepositoryAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

