package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerOutput extends js.Object {
  /**
    * The name of the queried container.
    */
  var Container: js.UndefOr[typingsSlinky.awsSdk.mediastoreMod.Container] = js.native
}

object DescribeContainerOutput {
  @scala.inline
  def apply(): DescribeContainerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerOutput]
  }
  @scala.inline
  implicit class DescribeContainerOutputOps[Self <: DescribeContainerOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: Container): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(js.undefined)
        ret
    }
  }
  
}

