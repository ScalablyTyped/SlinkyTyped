package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBParameterGroupResult extends js.Object {
  var DBParameterGroup: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.DBParameterGroup] = js.native
}

object CopyDBParameterGroupResult {
  @scala.inline
  def apply(): CopyDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBParameterGroupResult]
  }
  @scala.inline
  implicit class CopyDBParameterGroupResultOps[Self <: CopyDBParameterGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBParameterGroup(value: DBParameterGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBParameterGroup")(js.undefined)
        ret
    }
  }
  
}

