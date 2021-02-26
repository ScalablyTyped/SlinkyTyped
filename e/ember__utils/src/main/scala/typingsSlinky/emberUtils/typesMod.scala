package typingsSlinky.emberUtils

import org.scalajs.dom.raw.FileList
import typingsSlinky.emberUtils.emberUtilsStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type FunctionArgs[F] = (js.Tuple5[js.Any, js.Any, js.Any, js.Any, js.Any]) | (js.Tuple4[js.Any, js.Any, js.Any, js.Any]) | (js.Tuple3[js.Any, js.Any, js.Any]) | (js.Tuple2[js.Any, js.Any]) | js.Array[js.Any]
  
  type KeysOfType[Base, Condition] = /* keyof std.Pick<Base, {[ Key in keyof Base ]: Base[Key] extends Condition? Key : never}[keyof Base]> */ String
  
  @js.native
  trait TypeLookup extends StObject {
    
    var array: js.Array[_] = js.native
    
    var boolean: Boolean = js.native
    
    var date: js.Date = js.native
    
    var error: js.Error = js.native
    
    var filelist: FileList = js.native
    
    def function(args: js.Any*): js.Any = js.native
    
    var `null`: Null = js.native
    
    var number: Double = js.native
    
    var regexp: js.RegExp = js.native
    
    var string: String = js.native
    
    var undefined: js.UndefOr[scala.Nothing] = js.native
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
    implicit class TypeLookupMutableBuilder[Self <: TypeLookup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: js.Array[_]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayVarargs(value: js.Any*): Self = StObject.set(x, "array", js.Array(value :_*))
      
      @scala.inline
      def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilelist(value: FileList): Self = StObject.set(x, "filelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunction(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "function", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNull(value: Null): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexp(value: js.RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeOf[Base, Condition] = (KeysOfType[Base, Condition]) | `object`
}
