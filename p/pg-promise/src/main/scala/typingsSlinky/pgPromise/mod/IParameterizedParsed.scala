package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParameterizedParsed extends js.Object {
  var binary: Boolean = js.native
  var rowMode: Unit | array = js.native
  var text: String = js.native
  var values: js.Array[_] = js.native
}

object IParameterizedParsed {
  @scala.inline
  def apply(binary: Boolean, rowMode: Unit | array, text: String, values: js.Array[_]): IParameterizedParsed = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], rowMode = rowMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedParsed]
  }
  @scala.inline
  implicit class IParameterizedParsedOps[Self <: IParameterizedParsed] (val x: Self) extends AnyVal {
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
    def withRowMode(value: Unit | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowMode")(value.asInstanceOf[js.Any])
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

