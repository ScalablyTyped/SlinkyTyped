package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ALL
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.DELETE
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.INSERT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.SELECT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyOptionsEn extends js.Object {
  var command: ALL | SELECT | INSERT | UPDATE | DELETE = js.native
}

object CreatePolicyOptionsEn {
  @scala.inline
  def apply(command: ALL | SELECT | INSERT | UPDATE | DELETE): CreatePolicyOptionsEn = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyOptionsEn]
  }
  @scala.inline
  implicit class CreatePolicyOptionsEnOps[Self <: CreatePolicyOptionsEn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: ALL | SELECT | INSERT | UPDATE | DELETE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

