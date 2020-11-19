package typingsSlinky.reactTable.mod

import typingsSlinky.reactTable.anon.PartialTableToggleRowsSel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowSelectRowProps[D /* <: js.Object */] extends js.Object {
  
  def getToggleRowSelectedProps(): TableToggleRowsSelectedProps = js.native
  def getToggleRowSelectedProps(props: PartialTableToggleRowsSel): TableToggleRowsSelectedProps = js.native
  
  var isSelected: Boolean = js.native
  
  var isSomeSelected: Boolean = js.native
  
  def toggleRowSelected(): Unit = js.native
  def toggleRowSelected(set: Boolean): Unit = js.native
}
