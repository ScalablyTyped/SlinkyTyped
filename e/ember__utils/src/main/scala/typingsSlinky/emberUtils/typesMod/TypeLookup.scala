package typingsSlinky.emberUtils.typesMod

import org.scalajs.dom.raw.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeLookup extends js.Object {
  var array: js.Array[_] = js.native
  var boolean: Boolean = js.native
  var date: js.Date = js.native
  var error: js.Error = js.native
  var filelist: FileList = js.native
  var `null`: Null = js.native
  var number: Double = js.native
  var regexp: js.RegExp = js.native
  var string: String = js.native
  var undefined: js.UndefOr[scala.Nothing] = js.native
  def function(args: js.Any*): js.Any = js.native
}

object TypeLookup {
  @scala.inline
  def apply(
    array: js.Array[_],
    boolean: Boolean,
    date: js.Date,
    error: js.Error,
    filelist: FileList,
    function: /* repeated */ js.Any => js.Any,
    `null`: Null,
    number: Double,
    regexp: js.RegExp,
    string: String
  ): TypeLookup = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filelist = filelist.asInstanceOf[js.Any], function = js.Any.fromFunction1(function), number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeLookup]
  }
  @scala.inline
  implicit class TypeLookupOps[Self <: TypeLookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilelist(value: FileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNull(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

