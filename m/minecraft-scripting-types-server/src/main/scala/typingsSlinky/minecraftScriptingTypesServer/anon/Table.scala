package typingsSlinky.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /**
    * File path, relative to the behavior pack's path, to the loot table file
    */
  var table: String = js.native
}

object Table {
  @scala.inline
  def apply(table: String): Table = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

