package typingsSlinky.intlMessageformat.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.Intl.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedLocalesOf
  extends Instantiable0[PluralRules]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), PluralRules]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ PluralRulesOptions, 
      PluralRules
    ] {
  
  def apply(): PluralRules = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: String): PluralRules = js.native
  def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
  def apply(locales: js.Array[String]): PluralRules = js.native
  def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
}
