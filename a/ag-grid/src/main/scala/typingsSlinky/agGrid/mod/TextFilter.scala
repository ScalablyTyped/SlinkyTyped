package typingsSlinky.agGrid.mod

import typingsSlinky.agGrid.textFilterMod.TextComparator
import typingsSlinky.agGrid.textFilterMod.TextFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "TextFilter")
@js.native
class TextFilter ()
  extends typingsSlinky.agGrid.textFilterMod.TextFilter
/* static members */
@JSImport("ag-grid", "TextFilter")
@js.native
object TextFilter extends js.Object {
  
  def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = js.native
  @JSName("DEFAULT_COMPARATOR")
  var DEFAULT_COMPARATOR_Original: TextComparator = js.native
  
  def DEFAULT_FORMATTER(from: String): String = js.native
  @JSName("DEFAULT_FORMATTER")
  var DEFAULT_FORMATTER_Original: TextFormatter = js.native
  
  def DEFAULT_LOWERCASE_FORMATTER(from: String): String = js.native
  @JSName("DEFAULT_LOWERCASE_FORMATTER")
  var DEFAULT_LOWERCASE_FORMATTER_Original: TextFormatter = js.native
}
