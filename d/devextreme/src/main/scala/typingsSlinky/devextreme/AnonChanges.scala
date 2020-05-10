package typingsSlinky.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChanges extends js.Object {
  var changes: js.UndefOr[js.Array[_]] = js.native
}

object AnonChanges {
  @scala.inline
  def apply(): AnonChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonChanges]
  }
  @scala.inline
  implicit class AnonChangesOps[Self <: AnonChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(js.undefined)
        ret
    }
  }
  
}

