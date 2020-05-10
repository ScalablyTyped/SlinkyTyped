package typingsSlinky.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnConstraintOptions extends js.Object {
  var emitPrimaryKey: js.UndefOr[Boolean] = js.native
}

object ColumnConstraintOptions {
  @scala.inline
  def apply(): ColumnConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnConstraintOptions]
  }
  @scala.inline
  implicit class ColumnConstraintOptionsOps[Self <: ColumnConstraintOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitPrimaryKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitPrimaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitPrimaryKey")(js.undefined)
        ret
    }
  }
  
}

