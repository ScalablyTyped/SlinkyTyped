package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPreparedParsed extends js.Object {
  var binary: Boolean = js.native
  var name: String = js.native
  var rowMode: Unit | array = js.native
  var rows: Double = js.native
  var text: String = js.native
  var values: js.Array[_] = js.native
}

object IPreparedParsed {
  @scala.inline
  def apply(
    binary: Boolean,
    name: String,
    rowMode: Unit | array,
    rows: Double,
    text: String,
    values: js.Array[_]
  ): IPreparedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreparedParsed]
  }
  @scala.inline
  implicit class IPreparedParsedOps[Self <: IPreparedParsed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowMode(value: Unit | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

