package typingsSlinky.formatjsEcma402Abstract

import typingsSlinky.formatjsEcma402Abstract.anon.Language
import typingsSlinky.formatjsEcma402Abstract.anon.Locale
import typingsSlinky.formatjsEcma402Abstract.coreMod.LocaleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displaynamesMod {
  
  type CurrencyCode = String
  
  @js.native
  trait DisplayNamesData extends StObject {
    
    /**
      * Not in spec, but we need this to display both language and region in display name.
      * e.g. zh-Hans-SG + "{0}（{1}）" -> 简体中文（新加坡）
      * Here {0} is replaced by language display name and {1} is replaced by region display name.
      */
    var patterns: Locale = js.native
    
    /**
      * Note that for style fields, `short` and `narrow` might not exist.
      * At runtime, the fallback order will be narrow -> short -> long.
      */
    var types: Language = js.native
  }
  object DisplayNamesData {
    
    @scala.inline
    def apply(patterns: Locale, types: Language): DisplayNamesData = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesData]
    }
    
    @scala.inline
    implicit class DisplayNamesDataMutableBuilder[Self <: DisplayNamesData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatterns(value: Locale): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: Language): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  type DisplayNamesLocaleData = LocaleData[DisplayNamesData]
  
  type LanguageTag = String
  
  type RegionCode = String
  
  type ScriptCode = String
}
