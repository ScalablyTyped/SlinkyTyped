package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeResourceUpdate extends js.Object {
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: js.UndefOr[Integer] = js.native
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
    */
  var minvCpus: js.UndefOr[Integer] = js.native
}

object ComputeResourceUpdate {
  @scala.inline
  def apply(): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
  @scala.inline
  implicit class ComputeResourceUpdateOps[Self <: ComputeResourceUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredvCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredvCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredvCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredvCpus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxvCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxvCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxvCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxvCpus")(js.undefined)
        ret
    }
    @scala.inline
    def withMinvCpus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minvCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinvCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minvCpus")(js.undefined)
        ret
    }
  }
  
}

