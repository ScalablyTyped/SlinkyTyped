package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to describe.
    */
  var CodeRepositoryName: EntityName = js.native
}

object DescribeCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DescribeCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryInput]
  }
  @scala.inline
  implicit class DescribeCodeRepositoryInputOps[Self <: DescribeCodeRepositoryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeRepositoryName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeRepositoryName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

