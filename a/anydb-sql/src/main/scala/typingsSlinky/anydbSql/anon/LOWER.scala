package typingsSlinky.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LOWER extends js.Object {
  def LOWER(c: typingsSlinky.anydbSql.mod.Column[String]): typingsSlinky.anydbSql.mod.Column[String]
}

object LOWER {
  @scala.inline
  def apply(LOWER: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]): LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[LOWER]
  }
}

