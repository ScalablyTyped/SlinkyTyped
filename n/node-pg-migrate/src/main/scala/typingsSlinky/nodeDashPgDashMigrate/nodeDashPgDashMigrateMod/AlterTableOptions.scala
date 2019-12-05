package typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.DISABLE
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.ENABLE
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.FORCE
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.`NO FORCE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterTableOptions extends js.Object {
  var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)
}

object AlterTableOptions {
  @scala.inline
  def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
    val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlterTableOptions]
  }
}

