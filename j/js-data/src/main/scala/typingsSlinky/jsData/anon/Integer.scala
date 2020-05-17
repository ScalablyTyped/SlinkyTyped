package typingsSlinky.jsData.anon

import typingsSlinky.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integer extends js.Object {
  def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
}

object Integer {
  @scala.inline
  def apply(
    array: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    integer: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    number: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    numeric: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    `object`: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    string: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]
  ): Integer = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction3(array), integer = js.Any.fromFunction3(integer), number = js.Any.fromFunction3(number), numeric = js.Any.fromFunction3(numeric), string = js.Any.fromFunction3(string))
    __obj.updateDynamic("object")(js.Any.fromFunction3(`object`))
    __obj.asInstanceOf[Integer]
  }
  @scala.inline
  implicit class IntegerOps[Self <: Integer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withInteger(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNumber(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNumeric(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withObject(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withString(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

