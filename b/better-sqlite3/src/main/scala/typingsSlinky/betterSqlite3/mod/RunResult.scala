package typingsSlinky.betterSqlite3.mod

import typingsSlinky.integer.mod.IntLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunResult extends js.Object {
  var changes: Double = js.native
  var lastInsertRowid: IntLike = js.native
}

object RunResult {
  @scala.inline
  def apply(changes: Double, lastInsertRowid: IntLike): RunResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  @scala.inline
  implicit class RunResultOps[Self <: RunResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastInsertRowid(value: IntLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastInsertRowid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

