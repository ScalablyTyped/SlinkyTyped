package typingsSlinky.linguiCore

import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lingui/core/formats", JSImport.Namespace)
@js.native
object formatsMod extends js.Object {
  
  def date(language: String): js.Function1[/* value */ js.Date, String] = js.native
  def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ js.Date, String] = js.native
  
  def number(language: String): js.Function1[/* value */ Double, String] = js.native
  def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = js.native
}
