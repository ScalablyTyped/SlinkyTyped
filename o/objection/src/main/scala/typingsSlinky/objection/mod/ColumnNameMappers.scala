package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnNameMappers extends js.Object {
  def format(json: Pojo): Pojo = js.native
  def parse(json: Pojo): Pojo = js.native
}

object ColumnNameMappers {
  @scala.inline
  def apply(format: Pojo => Pojo, parse: Pojo => Pojo): ColumnNameMappers = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[ColumnNameMappers]
  }
  @scala.inline
  implicit class ColumnNameMappersOps[Self <: ColumnNameMappers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: Pojo => Pojo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: Pojo => Pojo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

