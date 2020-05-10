package typingsSlinky.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBulkOptions extends js.Object {
  /** Honors constraints during bulk load, using T-SQL CHECK_CONSTRAINTS. (default: false) */
  var checkConstraints: js.UndefOr[Boolean] = js.native
  /** Honors insert triggers during bulk load, using the T-SQL FIRE_TRIGGERS. (default: false) */
  var fireTriggers: js.UndefOr[Boolean] = js.native
  /** Honors null value passed, ignores the default values set on table, using T-SQL KEEP_NULLS. (default: false) */
  var keepNulls: js.UndefOr[Boolean] = js.native
  /** Places a bulk update(BU) lock on table while performing bulk load, using T-SQL TABLOCK. (default: false) */
  var tableLock: js.UndefOr[Boolean] = js.native
}

object IBulkOptions {
  @scala.inline
  def apply(): IBulkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBulkOptions]
  }
  @scala.inline
  implicit class IBulkOptionsOps[Self <: IBulkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckConstraints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withFireTriggers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFireTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepNulls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNulls")(js.undefined)
        ret
    }
    @scala.inline
    def withTableLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableLock")(js.undefined)
        ret
    }
  }
  
}

