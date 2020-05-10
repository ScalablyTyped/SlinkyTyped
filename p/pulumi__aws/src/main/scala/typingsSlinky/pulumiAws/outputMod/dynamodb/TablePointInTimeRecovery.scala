package typingsSlinky.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablePointInTimeRecovery extends js.Object {
  /**
    * Whether to enable point-in-time recovery - note that it can take up to 10 minutes to enable for new tables. If the `pointInTimeRecovery` block is not provided then this defaults to `false`.
    */
  var enabled: Boolean = js.native
}

object TablePointInTimeRecovery {
  @scala.inline
  def apply(enabled: Boolean): TablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablePointInTimeRecovery]
  }
  @scala.inline
  implicit class TablePointInTimeRecoveryOps[Self <: TablePointInTimeRecovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

