package typingsSlinky.markdownIt

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.markdownIt.anon.Mdurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod extends Shortcut {
  
  @JSImport("markdown-it/lib/common/utils", JSImport.Namespace)
  @js.native
  val ^ : Utils = js.native
  
  // import ucmicro from 'uc.micro';
  @js.native
  trait Utils extends StObject {
    
    /**
      * Remove element from array and put another array at those position.
      * Useful for some operations with tokens.
      * Return a new array.
      */
    def arrayReplaceAt[T](src: js.Array[T], pos: Double, newElements: js.Array[T]): js.Array[T] = js.native
    
    /**
      * Merge objects
      */
    def assign(target: js.Any, sources: js.Any*): js.Any = js.native
    
    def escapeHtml(str: String): String = js.native
    
    def escapeRE(str: String): String = js.native
    
    def fromCodePoint(code: Double): String = js.native
    
    /**
      * has own property
      */
    def has(obj: js.Any, key: /* keyof any */ String): Boolean = js.native
    
    /**
      * Markdown ASCII punctuation characters.
      *
      * !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, :, ;, <, =, >, ?, @, [, \, ], ^, _, `, {, |, }, or ~
      * http://spec.commonmark.org/0.15/#ascii-punctuation-character
      *
      * Don't confuse with unicode punctuation !!! It lacks some chars in ascii range.
      */
    def isMdAsciiPunct(code: Double): Boolean = js.native
    
    /**
      * Currently without astral characters support.
      */
    def isPunctChar(ch: String): Boolean = js.native
    
    def isSpace(code: Double): Boolean = js.native
    
    /**
      * Check if the type is string or not
      */
    def isString(obj: js.Any): /* is string */ Boolean = js.native
    
    def isValidEntityCode(code: Double): Boolean = js.native
    
    /**
      * Zs (unicode class) || [\t\f\v\r\n]
      */
    def isWhiteSpace(code: Double): Boolean = js.native
    
    var lib: Mdurl = js.native
    
    /**
      * Hepler to unify [reference labels].
      */
    def normalizeReference(str: String): String = js.native
    
    def unescapeAll(str: String): String = js.native
    
    def unescapeMd(str: String): String = js.native
  }
  object Utils {
    
    @scala.inline
    def apply(
      arrayReplaceAt: (js.Array[js.Any], Double, js.Array[js.Any]) => js.Array[js.Any],
      assign: (js.Any, /* repeated */ js.Any) => js.Any,
      escapeHtml: String => String,
      escapeRE: String => String,
      fromCodePoint: Double => String,
      has: (js.Any, /* keyof any */ String) => Boolean,
      isMdAsciiPunct: Double => Boolean,
      isPunctChar: String => Boolean,
      isSpace: Double => Boolean,
      isString: js.Any => /* is string */ Boolean,
      isValidEntityCode: Double => Boolean,
      isWhiteSpace: Double => Boolean,
      lib: Mdurl,
      normalizeReference: String => String,
      unescapeAll: String => String,
      unescapeMd: String => String
    ): Utils = {
      val __obj = js.Dynamic.literal(arrayReplaceAt = js.Any.fromFunction3(arrayReplaceAt), assign = js.Any.fromFunction2(assign), escapeHtml = js.Any.fromFunction1(escapeHtml), escapeRE = js.Any.fromFunction1(escapeRE), fromCodePoint = js.Any.fromFunction1(fromCodePoint), has = js.Any.fromFunction2(has), isMdAsciiPunct = js.Any.fromFunction1(isMdAsciiPunct), isPunctChar = js.Any.fromFunction1(isPunctChar), isSpace = js.Any.fromFunction1(isSpace), isString = js.Any.fromFunction1(isString), isValidEntityCode = js.Any.fromFunction1(isValidEntityCode), isWhiteSpace = js.Any.fromFunction1(isWhiteSpace), lib = lib.asInstanceOf[js.Any], normalizeReference = js.Any.fromFunction1(normalizeReference), unescapeAll = js.Any.fromFunction1(unescapeAll), unescapeMd = js.Any.fromFunction1(unescapeMd))
      __obj.asInstanceOf[Utils]
    }
    
    @scala.inline
    implicit class UtilsMutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayReplaceAt(value: (js.Array[js.Any], Double, js.Array[js.Any]) => js.Array[js.Any]): Self = StObject.set(x, "arrayReplaceAt", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAssign(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "assign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEscapeHtml(value: String => String): Self = StObject.set(x, "escapeHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeRE(value: String => String): Self = StObject.set(x, "escapeRE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromCodePoint(value: Double => String): Self = StObject.set(x, "fromCodePoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: (js.Any, /* keyof any */ String) => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsMdAsciiPunct(value: Double => Boolean): Self = StObject.set(x, "isMdAsciiPunct", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPunctChar(value: String => Boolean): Self = StObject.set(x, "isPunctChar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSpace(value: Double => Boolean): Self = StObject.set(x, "isSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsString(value: js.Any => /* is string */ Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsValidEntityCode(value: Double => Boolean): Self = StObject.set(x, "isValidEntityCode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsWhiteSpace(value: Double => Boolean): Self = StObject.set(x, "isWhiteSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLib(value: Mdurl): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeReference(value: String => String): Self = StObject.set(x, "normalizeReference", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnescapeAll(value: String => String): Self = StObject.set(x, "unescapeAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnescapeMd(value: String => String): Self = StObject.set(x, "unescapeMd", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Utils
  
  /* This means you don't have to write `^`, but can instead just say `utilsMod.foo` */
  override def _to: Utils = ^
}
