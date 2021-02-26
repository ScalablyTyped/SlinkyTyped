package typingsSlinky.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stylized table of text elements.
  */
@JSImport("blessed", "Widgets.TableElement")
@js.native
class TableElement protected () extends BoxElement {
  def this(opts: TableOptions) = this()
  
  @JSName("options")
  var options_TableElement: TableOptions = js.native
  
  /**
    * set rows in table. array of arrays of strings.
    */
  def setData(rows: js.Array[js.Array[String]]): Unit = js.native
  
  /**
    * set rows in table. array of arrays of strings.
    */
  def setRows(rows: js.Array[js.Array[String]]): Unit = js.native
}
