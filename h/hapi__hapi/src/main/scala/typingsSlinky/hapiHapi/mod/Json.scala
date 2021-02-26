package typingsSlinky.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Json {
  
  /**
    * For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
    */
  @js.native
  trait StringifyArguments extends StObject {
    
    /* calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false. */
    var escape: js.UndefOr[Boolean] = js.native
    
    /** the replacer function or array. Defaults to no action. */
    var replacer: js.UndefOr[StringifyReplacer] = js.native
    
    /** number of spaces to indent nested object keys. Defaults to no indentation. */
    var space: js.UndefOr[StringifySpace] = js.native
    
    /* string suffix added after conversion to JSON string. Defaults to no suffix. */
    var suffix: js.UndefOr[String] = js.native
  }
  object StringifyArguments {
    
    @scala.inline
    def apply(): StringifyArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyArguments]
    }
    
    @scala.inline
    implicit class StringifyArgumentsMutableBuilder[Self <: StringifyArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setReplacer(value: StringifyReplacer): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setReplacerVarargs(value: (String | Double)*): Self = StObject.set(x, "replacer", js.Array(value :_*))
      
      @scala.inline
      def setSpace(value: StringifySpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  /**
    * @see {@link https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter}
    */
  type StringifyReplacer = js.UndefOr[
    (js.Function2[/* key */ String, /* value */ js.Any, js.Any]) | (js.Array[String | Double])
  ]
  
  /**
    * Any value greater than 10 is truncated.
    */
  type StringifySpace = Double | String
}
