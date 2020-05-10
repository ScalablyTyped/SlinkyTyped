package typingsSlinky.anydbSql

import typingsSlinky.anydbSql.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLOWER extends js.Object {
  def LOWER(c: Column[String]): Column[String] = js.native
}

object AnonLOWER {
  @scala.inline
  def apply(LOWER: Column[String] => Column[String]): AnonLOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[AnonLOWER]
  }
  @scala.inline
  implicit class AnonLOWEROps[Self <: AnonLOWER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOWER(value: Column[String] => Column[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOWER")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

