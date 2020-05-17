package typingsSlinky.astTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  var Date: Type[js.Date] = js.native
  var RegExp: Type[js.RegExp] = js.native
  var array: Type[js.Array[_]] = js.native
  var boolean: Type[Boolean] = js.native
  var function: Type[js.Function] = js.native
  var `null`: Type[Null] = js.native
  var number: Type[Double] = js.native
  var `object`: Type[StringDictionary[_]] = js.native
  var string: Type[String] = js.native
  var undefined: Type[js.UndefOr[scala.Nothing]] = js.native
}

object Array {
  @scala.inline
  def apply(
    Date: Type[js.Date],
    RegExp: Type[js.RegExp],
    array: Type[js.Array[_]],
    boolean: Type[Boolean],
    function: Type[js.Function],
    `null`: Type[Null],
    number: Type[Double],
    `object`: Type[StringDictionary[_]],
    string: Type[String],
    undefined: Type[js.UndefOr[scala.Nothing]]
  ): Array = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: Type[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegExp(value: Type[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArray(value: Type[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoolean(value: Type[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: Type[js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNull(value: Type[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Type[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: Type[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: Type[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndefined(value: Type[js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

