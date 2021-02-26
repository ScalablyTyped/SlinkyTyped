package typingsSlinky.linguiCore

import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatsMod {
  
  @JSImport("@lingui/core/formats", "date")
  @js.native
  def date(language: String): js.Function1[/* value */ js.Date, String] = js.native
  @JSImport("@lingui/core/formats", "date")
  @js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ js.Date, String] = js.native
  
  @JSImport("@lingui/core/formats", "number")
  @js.native
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  @JSImport("@lingui/core/formats", "number")
  @js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
}
