package typingsSlinky.globalize

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cldrjs.mod.CldrStatic
import typingsSlinky.globalize.globalizeMod.Shared
import typingsSlinky.globalize.globalizeMod.Static
import typingsSlinky.globalize.globalizeStrings.cardinal
import typingsSlinky.globalize.globalizeStrings.ordinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/plural", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/plural", JSImport.Namespace)
  @js.native
  class Class protected () extends Shared {
    /**
      * Create a Globalize instance.
      * @param cldr Cldr instance of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(cldr: CldrStatic) = this()
    /**
      * Create a Globalize instance.
      * @param {string} Locale string of the instance.
      * @returns {Globalize} A Globalize instance
      */
    def this(locale: String) = this()
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `pluralMod.foo` */
  override def _to: Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    @js.native
    trait PluralGeneratorOptions extends StObject {
      
      /**
        * cardinal (default), or ordinal.
        */
      var `type`: js.UndefOr[cardinal | ordinal] = js.native
    }
    object PluralGeneratorOptions {
      
      @scala.inline
      def apply(): PluralGeneratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PluralGeneratorOptions]
      }
      
      @scala.inline
      implicit class PluralGeneratorOptionsMutableBuilder[Self <: PluralGeneratorOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: cardinal | ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * Returns the value's corresponding plural group: zero, one, two, few, many, or other.
        * @param {number} value A Number for which to return the plural group.
        * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
        * type Optional String cardinal (default), or ordinal.
        * @returns {string} Returns the value's corresponding plural group: zero, one, two, few, many, or other.
        */
      def plural(value: Double): String = js.native
      def plural(value: Double, options: PluralGeneratorOptions): String = js.native
      
      /**
        * Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
        * The returned function is invoked with one argument: the Number value for which to return the plural group.
        * @param {PluralGeneratorOptions} options A JSON object including none or any of the following options.
        * type Optional String cardinal (default), or ordinal.
        * @returns {Function} Return a function that returns the value's corresponding plural group: zero, one, two, few, many, or other.
        */
      def pluralGenerator(): js.Function1[/* value */ Double, String] = js.native
      def pluralGenerator(options: PluralGeneratorOptions): js.Function1[/* value */ Double, String] = js.native
    }
  }
}
