package typingsSlinky.formatjsIntlDisplaynames.polyfillMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNamesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Intl extends js.Object {
    @js.native
    class DisplayNames ()
      extends typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames {
      def this(locales: String) = this()
      def this(locales: js.Array[String]) = this()
      def this(locales: js.UndefOr[scala.Nothing], options: DisplayNamesOptions) = this()
      def this(locales: String, options: DisplayNamesOptions) = this()
      def this(locales: js.Array[String], options: DisplayNamesOptions) = this()
    }
    
    @js.native
    object DisplayNames
      extends Instantiable0[typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames]
         with Instantiable1[
              (/* locales */ js.Array[String]) | (/* locales */ String), 
              typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames
            ]
         with Instantiable2[
              js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
              /* options */ DisplayNamesOptions, 
              typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames
            ]
    
  }
  
}

