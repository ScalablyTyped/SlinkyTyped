package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.DISABLE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ENABLE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.FORCE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.`NO FORCE`
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

