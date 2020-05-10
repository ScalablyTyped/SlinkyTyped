package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AthenaParameters extends js.Object {
  /**
    * The workgroup that Amazon Athena uses.
    */
  var WorkGroup: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.WorkGroup] = js.native
}

object AthenaParameters {
  @scala.inline
  def apply(): AthenaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AthenaParameters]
  }
  @scala.inline
  implicit class AthenaParametersOps[Self <: AthenaParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkGroup(value: WorkGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(js.undefined)
        ret
    }
  }
  
}

