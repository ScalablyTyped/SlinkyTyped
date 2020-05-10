package typingsSlinky.pulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult extends js.Object {
  /**
    * Any properties that were computed during updating.
    */
  val outs: js.UndefOr[js.Any] = js.native
}

object UpdateResult {
  @scala.inline
  def apply(): UpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResult]
  }
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOuts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outs")(js.undefined)
        ret
    }
  }
  
}

