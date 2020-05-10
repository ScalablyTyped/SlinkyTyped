package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqliteOpenOptions extends js.Object {
  var flags: js.UndefOr[js.Array[SqliteOpenFlag]] = js.native
}

object SqliteOpenOptions {
  @scala.inline
  def apply(): SqliteOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqliteOpenOptions]
  }
  @scala.inline
  implicit class SqliteOpenOptionsOps[Self <: SqliteOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: js.Array[SqliteOpenFlag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
  }
  
}

