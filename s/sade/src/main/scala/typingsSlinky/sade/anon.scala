package typingsSlinky.sade

import typingsSlinky.mri.mod.ArrayOrString
import typingsSlinky.mri.mod.DictionaryObject
import typingsSlinky.sade.sadeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<sade.sade.CommandOptions> */
  @js.native
  trait ReadonlyCommandOptions extends StObject {
    
    val default: js.UndefOr[Boolean] = js.native
    
    val alias: js.UndefOr[String | js.Array[String]] = js.native
  }
  object ReadonlyCommandOptions {
    
    @scala.inline
    def apply(): ReadonlyCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCommandOptions]
    }
    
    @scala.inline
    implicit class ReadonlyCommandOptionsMutableBuilder[Self <: ReadonlyCommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String | js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  /* Inlined {  lazy :true} & sade.sade.ParseOptions */
  @js.native
  trait lazytrueParseOptions extends StObject {
    
    /** Default values for flags */
    var default: js.UndefOr[DictionaryObject[_]] = js.native
    
    /** Additional aliases for specific flags */
    var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.native
    
    /** A flag or array of flags whose values are boolean */
    var boolean: js.UndefOr[ArrayOrString] = js.native
    
    var `lazy`: `true` with js.UndefOr[Boolean] = js.native
    
    var string: js.UndefOr[ArrayOrString] = js.native
    
    var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.native
  }
  object lazytrueParseOptions {
    
    @scala.inline
    def apply(`lazy`: `true` with js.UndefOr[Boolean]): lazytrueParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[lazytrueParseOptions]
    }
    
    @scala.inline
    implicit class lazytrueParseOptionsMutableBuilder[Self <: lazytrueParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: DictionaryObject[ArrayOrString]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setBoolean(value: ArrayOrString): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: DictionaryObject[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setLazy(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: ArrayOrString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: /* flag */ String => Unit): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
