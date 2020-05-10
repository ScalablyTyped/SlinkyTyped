package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerInput extends js.Object {
  /**
    * The name of the container to query.
    */
  var ContainerName: js.UndefOr[typingsSlinky.awsSdk.mediastoreMod.ContainerName] = js.native
}

object DescribeContainerInput {
  @scala.inline
  def apply(): DescribeContainerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerInput]
  }
  @scala.inline
  implicit class DescribeContainerInputOps[Self <: DescribeContainerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: ContainerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerName")(js.undefined)
        ret
    }
  }
  
}

