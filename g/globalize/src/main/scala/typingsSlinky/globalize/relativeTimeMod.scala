package typingsSlinky.globalize

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cldrjs.mod.CldrStatic
import typingsSlinky.globalize.globalizeMod.Shared
import typingsSlinky.globalize.globalizeMod.Static
import typingsSlinky.globalize.globalizeStrings.narrow
import typingsSlinky.globalize.globalizeStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeTimeMod extends Shortcut {
  
  @JSImport("globalize/dist/globalize/relative-time", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("globalize/dist/globalize/relative-time", JSImport.Namespace)
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
  
  /* This means you don't have to write `^`, but can instead just say `relativeTimeMod.foo` */
  override def _to: Static = ^
  
  /* augmented module */
  object globalizeDistGlobalizeAugmentingMod {
    
    @js.native
    trait RelativeTimeFormatterOptions extends StObject {
      
      /**
        * eg. "short" or "narrow". Or falsy for default long form
        */
      var form: js.UndefOr[short | narrow] = js.native
    }
    object RelativeTimeFormatterOptions {
      
      @scala.inline
      def apply(): RelativeTimeFormatterOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RelativeTimeFormatterOptions]
      }
      
      @scala.inline
      implicit class RelativeTimeFormatterOptionsMutableBuilder[Self <: RelativeTimeFormatterOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForm(value: short | narrow): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      }
    }
    
    @js.native
    trait Shared extends StObject {
      
      /**
        * Return a relative time according to the given unit
        * @param {number} value The number to be formatted.
        * @param {string} unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
        * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
        * @returns {string} Return a relative time according to the given unit.
        */
      def formatRelativeTime(value: Double, unit: String): String = js.native
      def formatRelativeTime(value: Double, unit: String, options: RelativeTimeFormatterOptions): String = js.native
      
      /**
        * Returns a function that formats a relative time according to the given unit, options, and the default/instance locale.
        * The returned function is invoked with one argument: the number value to be formatted.
        * @param unit String value indicating the unit to be formatted. eg. "day", "week", "month", etc.
        * @param options form: [String] eg. "short" or "narrow". Or falsy for default long form.
        * @returns {Function} Returns a function that formats a relative time according to the given unit.
        */
      def relativeTimeFormatter(unit: String): js.Function1[/* value */ Double, String] = js.native
      def relativeTimeFormatter(unit: String, options: RelativeTimeFormatterOptions): js.Function1[/* value */ Double, String] = js.native
    }
  }
}
