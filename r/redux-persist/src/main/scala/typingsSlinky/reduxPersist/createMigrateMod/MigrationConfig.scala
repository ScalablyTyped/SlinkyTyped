package typingsSlinky.reduxPersist.createMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationConfig extends js.Object {
  var debug: Boolean = js.native
}

object MigrationConfig {
  @scala.inline
  def apply(debug: Boolean): MigrationConfig = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationConfig]
  }
  @scala.inline
  implicit class MigrationConfigOps[Self <: MigrationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

