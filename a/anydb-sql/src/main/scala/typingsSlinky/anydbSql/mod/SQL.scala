package typingsSlinky.anydbSql.mod

import typingsSlinky.anydbSql.AnonLOWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQL extends js.Object {
  var functions: AnonLOWER = js.native
}

object SQL {
  @scala.inline
  def apply(functions: AnonLOWER): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
  @scala.inline
  implicit class SQLOps[Self <: SQL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctions(value: AnonLOWER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

