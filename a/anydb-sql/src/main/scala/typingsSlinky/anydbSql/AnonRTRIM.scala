package typingsSlinky.anydbSql

import typingsSlinky.anydbSql.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRTRIM extends js.Object {
  def LOWER(name: Column[String]): Column[String] = js.native
  def RTRIM(name: Column[String]): Column[String] = js.native
}

object AnonRTRIM {
  @scala.inline
  def apply(LOWER: Column[String] => Column[String], RTRIM: Column[String] => Column[String]): AnonRTRIM = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
    __obj.asInstanceOf[AnonRTRIM]
  }
  @scala.inline
  implicit class AnonRTRIMOps[Self <: AnonRTRIM] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRTRIM(value: Column[String] => Column[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTRIM")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

