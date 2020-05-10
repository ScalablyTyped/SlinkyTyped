package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotDiscoverRequestDataOptions extends js.Object {
  var command: String = js.native
  var restrictions: PivotDiscoverRequestRestrictionOptions = js.native
}

object PivotDiscoverRequestDataOptions {
  @scala.inline
  def apply(command: String, restrictions: PivotDiscoverRequestRestrictionOptions): PivotDiscoverRequestDataOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestDataOptions]
  }
  @scala.inline
  implicit class PivotDiscoverRequestDataOptionsOps[Self <: PivotDiscoverRequestDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: PivotDiscoverRequestRestrictionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

