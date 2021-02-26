package typingsSlinky.inflected

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.inflected.mod.Options.Humanize
import typingsSlinky.inflected.mod.Options.Parameterize
import typingsSlinky.inflected.mod.Options.Transliterate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("inflected", JSImport.Namespace)
  @js.native
  val ^ : Inflected = js.native
  
  @js.native
  trait Inflected extends StObject {
    
    def camelize(term: String): String = js.native
    def camelize(term: String, uppercaseFirstLetter: Boolean): String = js.native
    
    def classify(tableName: String): String = js.native
    
    def dasherize(underscoredWord: String): String = js.native
    
    def foreignKey(className: String): String = js.native
    def foreignKey(className: String, separateClassNameAndIdWithUnderscore: Boolean): String = js.native
    
    def humanize(lowerCaseAndUnderscoredWord: String): String = js.native
    def humanize(lowerCaseAndUnderscoredWord: String, options: Humanize): String = js.native
    
    def ordinal(number: Double): String = js.native
    
    def ordinalize(number: Double): String = js.native
    
    def parameterize(sentence: String): String = js.native
    def parameterize(sentence: String, options: Parameterize): String = js.native
    
    def pluralize(word: String): String = js.native
    def pluralize(word: String, locale: String): String = js.native
    
    def singularize(word: String): String = js.native
    def singularize(word: String, locale: String): String = js.native
    
    def tableize(className: String): String = js.native
    
    def titleize(sentence: String): String = js.native
    
    def transliterate(sentence: String): String = js.native
    def transliterate(sentence: String, options: Transliterate): String = js.native
    
    def underscore(camelCaseWord: String): String = js.native
  }
  
  object Options {
    
    @js.native
    trait Humanize extends StObject {
      
      var capitalize: Boolean = js.native
    }
    object Humanize {
      
      @scala.inline
      def apply(capitalize: Boolean): Humanize = {
        val __obj = js.Dynamic.literal(capitalize = capitalize.asInstanceOf[js.Any])
        __obj.asInstanceOf[Humanize]
      }
      
      @scala.inline
      implicit class HumanizeMutableBuilder[Self <: Humanize] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Parameterize extends StObject {
      
      var separator: String = js.native
    }
    object Parameterize {
      
      @scala.inline
      def apply(separator: String): Parameterize = {
        val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any])
        __obj.asInstanceOf[Parameterize]
      }
      
      @scala.inline
      implicit class ParameterizeMutableBuilder[Self <: Parameterize] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Transliterate extends StObject {
      
      var locale: String = js.native
      
      var replacement: String = js.native
    }
    object Transliterate {
      
      @scala.inline
      def apply(locale: String, replacement: String): Transliterate = {
        val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any])
        __obj.asInstanceOf[Transliterate]
      }
      
      @scala.inline
      implicit class TransliterateMutableBuilder[Self <: Transliterate] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = Inflected
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Inflected = ^
}
