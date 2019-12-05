package typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.ALL
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.DELETE
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.INSERT
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.SELECT
import typingsSlinky.nodeDashPgDashMigrate.nodeDashPgDashMigrateStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyOptionsEn extends js.Object {
  var command: ALL | SELECT | INSERT | UPDATE | DELETE
}

object CreatePolicyOptionsEn {
  @scala.inline
  def apply(command: ALL | SELECT | INSERT | UPDATE | DELETE): CreatePolicyOptionsEn = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePolicyOptionsEn]
  }
}

