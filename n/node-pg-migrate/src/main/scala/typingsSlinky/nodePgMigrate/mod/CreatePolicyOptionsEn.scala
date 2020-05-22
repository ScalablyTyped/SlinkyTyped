package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ALL
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.DELETE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.INSERT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.SELECT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.UPDATE
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

