package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`false`
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.LOCAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterViewOptions extends js.Object {
  var checkOption: js.UndefOr[Null | `false` | CASCADED | LOCAL] = js.native
}

object AlterViewOptions {
  @scala.inline
  def apply(): AlterViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterViewOptions]
  }
  @scala.inline
  implicit class AlterViewOptionsOps[Self <: AlterViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckOption(value: `false` | CASCADED | LOCAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOption")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckOptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOption")(null)
        ret
    }
  }
  
}

