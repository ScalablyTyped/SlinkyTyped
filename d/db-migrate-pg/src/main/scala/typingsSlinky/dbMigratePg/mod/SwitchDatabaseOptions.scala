package typingsSlinky.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchDatabaseOptions extends js.Object {
  var database: js.UndefOr[String] = js.native
}

object SwitchDatabaseOptions {
  @scala.inline
  def apply(): SwitchDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchDatabaseOptions]
  }
  @scala.inline
  implicit class SwitchDatabaseOptionsOps[Self <: SwitchDatabaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
  }
  
}

