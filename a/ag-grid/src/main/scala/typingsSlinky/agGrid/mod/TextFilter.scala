package typingsSlinky.agGrid.mod

import typingsSlinky.agGrid.textFilterMod.TextComparator
import typingsSlinky.agGrid.textFilterMod.TextFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "TextFilter")
@js.native
class TextFilter ()
  extends typingsSlinky.agGrid.textFilterMod.TextFilter {
  def this(template: String) = this()
}
/* static members */
object TextFilter {
  
  @JSImport("ag-grid", "TextFilter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "TextFilter.DEFAULT_COMPARATOR")
  @js.native
  def DEFAULT_COMPARATOR: TextComparator = js.native
  @JSImport("ag-grid", "TextFilter.DEFAULT_COMPARATOR")
  @js.native
  def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = js.native
  @scala.inline
  def DEFAULT_COMPARATOR_=(x: TextComparator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPARATOR")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "TextFilter.DEFAULT_FORMATTER")
  @js.native
  def DEFAULT_FORMATTER: TextFormatter = js.native
  @JSImport("ag-grid", "TextFilter.DEFAULT_FORMATTER")
  @js.native
  def DEFAULT_FORMATTER(from: String): String = js.native
  @scala.inline
  def DEFAULT_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FORMATTER")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "TextFilter.DEFAULT_LOWERCASE_FORMATTER")
  @js.native
  def DEFAULT_LOWERCASE_FORMATTER: TextFormatter = js.native
  @JSImport("ag-grid", "TextFilter.DEFAULT_LOWERCASE_FORMATTER")
  @js.native
  def DEFAULT_LOWERCASE_FORMATTER(from: String): String = js.native
  @scala.inline
  def DEFAULT_LOWERCASE_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_LOWERCASE_FORMATTER")(x.asInstanceOf[js.Any])
}
