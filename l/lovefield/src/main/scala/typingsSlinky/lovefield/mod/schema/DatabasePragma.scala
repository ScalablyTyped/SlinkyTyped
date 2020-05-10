package typingsSlinky.lovefield.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabasePragma extends js.Object {
  var enableBundledMode: Boolean = js.native
}

object DatabasePragma {
  @scala.inline
  def apply(enableBundledMode: Boolean): DatabasePragma = {
    val __obj = js.Dynamic.literal(enableBundledMode = enableBundledMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabasePragma]
  }
  @scala.inline
  implicit class DatabasePragmaOps[Self <: DatabasePragma] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableBundledMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBundledMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

