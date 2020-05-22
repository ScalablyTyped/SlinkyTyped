package typingsSlinky.astTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  var Date: Type[js.Date]
  var RegExp: Type[js.RegExp]
  var array: Type[js.Array[_]]
  var boolean: Type[Boolean]
  var function: Type[js.Function]
  var `null`: Type[Null]
  var number: Type[Double]
  var `object`: Type[StringDictionary[_]]
  var string: Type[String]
  var undefined: Type[js.UndefOr[scala.Nothing]]
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
}

