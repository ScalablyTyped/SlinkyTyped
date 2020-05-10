package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceOptionsAlterEn extends js.Object {
  var restart: js.UndefOr[Double | `true`] = js.native
}

object SequenceOptionsAlterEn {
  @scala.inline
  def apply(): SequenceOptionsAlterEn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceOptionsAlterEn]
  }
  @scala.inline
  implicit class SequenceOptionsAlterEnOps[Self <: SequenceOptionsAlterEn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestart(value: Double | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart")(js.undefined)
        ret
    }
  }
  
}

