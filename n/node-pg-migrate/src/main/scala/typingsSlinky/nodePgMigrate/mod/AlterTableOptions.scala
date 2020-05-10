package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.DISABLE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ENABLE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.FORCE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.`NO FORCE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterTableOptions extends js.Object {
  var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`) = js.native
}

object AlterTableOptions {
  @scala.inline
  def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
    val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterTableOptions]
  }
  @scala.inline
  implicit class AlterTableOptionsOps[Self <: AlterTableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevelSecurity(value: DISABLE | ENABLE | FORCE | (`NO FORCE`)): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSecurity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

