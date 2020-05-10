package typingsSlinky.dbMigrateBase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveForeignKeyOptions extends js.Object {
  var dropIndex: js.UndefOr[Boolean] = js.native
}

object RemoveForeignKeyOptions {
  @scala.inline
  def apply(): RemoveForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveForeignKeyOptions]
  }
  @scala.inline
  implicit class RemoveForeignKeyOptionsOps[Self <: RemoveForeignKeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropIndex")(js.undefined)
        ret
    }
  }
  
}

