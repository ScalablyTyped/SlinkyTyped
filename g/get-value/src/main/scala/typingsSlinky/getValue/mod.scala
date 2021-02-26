package typingsSlinky.getValue

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-value", JSImport.Namespace)
  @js.native
  def apply(obj: js.Object, key: String): js.Any = js.native
  @JSImport("get-value", JSImport.Namespace)
  @js.native
  def apply(obj: js.Object, key: String, options: Options): js.Any = js.native
  @JSImport("get-value", JSImport.Namespace)
  @js.native
  def apply(obj: js.Object, key: js.Array[String]): js.Any = js.native
  @JSImport("get-value", JSImport.Namespace)
  @js.native
  def apply(obj: js.Object, key: js.Array[String], options: Options): js.Any = js.native
  @JSImport("get-value", JSImport.Namespace)
  @js.native
  def apply[T](obj: T): T = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The default value to return when get-value cannot result a value from the given object.
      *
      * default: `undefined`
      */
    var default: js.UndefOr[js.Any] = js.native
    
    /**
      * If defined, this function is called on each resolved value.
      * Useful if you want to do `.hasOwnProperty` or `Object.prototype.propertyIsEnumerable`.
      */
    var isValid: js.UndefOr[js.Function2[/* key */ String, /* object */ Record[String, _], Boolean]] = js.native
    
    /**
      * Customize how the object path is created when iterating over path segments.
      *
      * default: `Array.join`
      */
    var join: js.UndefOr[js.Function1[/* segs */ js.Array[String], String]] = js.native
    
    /**
      * The character to use when re-joining the string to check for keys
      * with dots in them (this is probably not needed when `options.join` is used).
      * This can be a different value than the separator, since the separator can be a string or regex.
      *
      * default: `"."`
      */
    var joinChar: js.UndefOr[String] = js.native
    
    /**
      * The separator to use for spliting the string.
      * (this is probably not needed when `options.split` is used).
      *
      *  default: `"."`
      */
    var separator: js.UndefOr[String | js.RegExp] = js.native
    
    /**
      * Custom function to use for splitting the string into object path segments.
      *
      * default: `String.split`
      */
    var split: js.UndefOr[js.Function1[/* s */ String, js.Array[String]]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setIsValid(value: (/* key */ String, /* object */ Record[String, _]) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
      
      @scala.inline
      def setJoin(value: /* segs */ js.Array[String] => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJoinChar(value: String): Self = StObject.set(x, "joinChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinCharUndefined: Self = StObject.set(x, "joinChar", js.undefined)
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      @scala.inline
      def setSeparator(value: String | js.RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorRegExp(value: js.RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSplit(value: /* s */ String => js.Array[String]): Self = StObject.set(x, "split", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
}
