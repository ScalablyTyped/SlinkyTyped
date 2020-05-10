package typingsSlinky.nodeSql2

import typingsSlinky.nodeSql2.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLOWER extends js.Object {
  def LOWER[Name](c: Column[Name, String]): Column[Name, String] = js.native
}

object AnonLOWER {
  @scala.inline
  def apply(LOWER: Column[js.Any, String] => Column[js.Any, String]): AnonLOWER = {
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
    def withLOWER(value: Column[js.Any, String] => Column[js.Any, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOWER")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

