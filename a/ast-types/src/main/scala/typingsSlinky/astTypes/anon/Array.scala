package typingsSlinky.astTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends StObject {
  
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
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: Type[js.Array[_]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: Type[Boolean]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Type[js.Date]): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: Type[js.Function]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNull(value: Type[Null]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Type[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Type[StringDictionary[_]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExp(value: Type[js.RegExp]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: Type[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: Type[js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
