package typingsSlinky.intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.CollatorOptions
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Intl.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl", JSImport.Namespace)
@js.native
object intlMod extends js.Object {
  @js.native
  class CollatorCls ()
    extends typingsSlinky.std.Intl.CollatorCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: CollatorOptions) = this()
    def this(locales: js.Array[String], options: CollatorOptions) = this()
  }
  
  @js.native
  class DateTimeFormatCls ()
    extends typingsSlinky.std.Intl.DateTimeFormatCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
  }
  
  @js.native
  class NumberFormatCls ()
    extends typingsSlinky.std.Intl.NumberFormatCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[String], options: NumberFormatOptions) = this()
  }
  
  @js.native
  class PluralRulesCls ()
    extends typingsSlinky.std.Intl.PluralRulesCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: PluralRulesOptions) = this()
    def this(locales: js.Array[String], options: PluralRulesOptions) = this()
  }
  
  @js.native
  object Collator
    extends Instantiable0[typingsSlinky.std.Intl.Collator]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ CollatorOptions, 
          typingsSlinky.std.Intl.Collator
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typingsSlinky.std.Intl.Collator
        ] {
    def apply(): typingsSlinky.std.Intl.Collator = js.native
    def apply(locales: String): typingsSlinky.std.Intl.Collator = js.native
    def apply(locales: String, options: CollatorOptions): typingsSlinky.std.Intl.Collator = js.native
    def apply(locales: js.Array[String]): typingsSlinky.std.Intl.Collator = js.native
    def apply(locales: js.Array[String], options: CollatorOptions): typingsSlinky.std.Intl.Collator = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: CollatorOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: CollatorOptions): js.Array[String] = js.native
  }
  
  @js.native
  object DateTimeFormat
    extends Instantiable0[typingsSlinky.std.Intl.DateTimeFormat]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ DateTimeFormatOptions, 
          typingsSlinky.std.Intl.DateTimeFormat
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typingsSlinky.std.Intl.DateTimeFormat
        ] {
    def apply(): typingsSlinky.std.Intl.DateTimeFormat = js.native
    def apply(locales: String): typingsSlinky.std.Intl.DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): typingsSlinky.std.Intl.DateTimeFormat = js.native
    def apply(locales: js.Array[String]): typingsSlinky.std.Intl.DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): typingsSlinky.std.Intl.DateTimeFormat = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  object NumberFormat
    extends Instantiable0[typingsSlinky.std.Intl.NumberFormat]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ NumberFormatOptions, 
          typingsSlinky.std.Intl.NumberFormat
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typingsSlinky.std.Intl.NumberFormat
        ] {
    def apply(): typingsSlinky.std.Intl.NumberFormat = js.native
    def apply(locales: String): typingsSlinky.std.Intl.NumberFormat = js.native
    def apply(locales: String, options: NumberFormatOptions): typingsSlinky.std.Intl.NumberFormat = js.native
    def apply(locales: js.Array[String]): typingsSlinky.std.Intl.NumberFormat = js.native
    def apply(locales: js.Array[String], options: NumberFormatOptions): typingsSlinky.std.Intl.NumberFormat = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  object PluralRules
    extends Instantiable0[typingsSlinky.std.Intl.PluralRules]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ PluralRulesOptions, 
          typingsSlinky.std.Intl.PluralRules
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typingsSlinky.std.Intl.PluralRules
        ] {
    def apply(): typingsSlinky.std.Intl.PluralRules = js.native
    def apply(locales: String): typingsSlinky.std.Intl.PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): typingsSlinky.std.Intl.PluralRules = js.native
    def apply(locales: js.Array[String]): typingsSlinky.std.Intl.PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): typingsSlinky.std.Intl.PluralRules = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
  }
  
}

