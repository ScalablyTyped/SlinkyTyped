package typingsSlinky.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTRIM extends js.Object {
  def LOWER(name: typingsSlinky.anydbSql.mod.Column[String]): typingsSlinky.anydbSql.mod.Column[String]
  def RTRIM(name: typingsSlinky.anydbSql.mod.Column[String]): typingsSlinky.anydbSql.mod.Column[String]
}

object RTRIM {
  @scala.inline
  def apply(
    LOWER: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String],
    RTRIM: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]
  ): RTRIM = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
    __obj.asInstanceOf[RTRIM]
  }
}

