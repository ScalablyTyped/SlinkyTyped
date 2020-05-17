package typingsSlinky.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LOWER extends js.Object {
  def LOWER(c: typingsSlinky.anydbSql.mod.Column[String]): typingsSlinky.anydbSql.mod.Column[String] = js.native
}

object LOWER {
  @scala.inline
  def apply(LOWER: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]): LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[LOWER]
  }
  @scala.inline
  implicit class LOWEROps[Self <: LOWER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOWER(value: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOWER")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

