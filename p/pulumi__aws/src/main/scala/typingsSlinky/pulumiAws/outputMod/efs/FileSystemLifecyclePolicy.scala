package typingsSlinky.pulumiAws.outputMod.efs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemLifecyclePolicy extends js.Object {
  /**
    * Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
    */
  var transitionToIa: js.UndefOr[String] = js.native
}

object FileSystemLifecyclePolicy {
  @scala.inline
  def apply(): FileSystemLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemLifecyclePolicy]
  }
  @scala.inline
  implicit class FileSystemLifecyclePolicyOps[Self <: FileSystemLifecyclePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitionToIa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionToIa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionToIa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionToIa")(js.undefined)
        ret
    }
  }
  
}

