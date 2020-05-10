package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED.
  */
@js.native
trait RollbackConfig extends js.Object {
  /**
    * The revision to rollback to. If set to 0, rollback to the last revision.
    */
  var revision: js.UndefOr[Input[Double]] = js.native
}

object RollbackConfig {
  @scala.inline
  def apply(): RollbackConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfig]
  }
  @scala.inline
  implicit class RollbackConfigOps[Self <: RollbackConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRevision(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
  }
  
}

