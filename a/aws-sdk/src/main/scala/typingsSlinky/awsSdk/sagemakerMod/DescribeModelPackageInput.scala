package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelPackageInput extends js.Object {
  /**
    * The name of the model package to describe.
    */
  var ModelPackageName: ArnOrName = js.native
}

object DescribeModelPackageInput {
  @scala.inline
  def apply(ModelPackageName: ArnOrName): DescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageInput]
  }
  @scala.inline
  implicit class DescribeModelPackageInputOps[Self <: DescribeModelPackageInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelPackageName(value: ArnOrName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

