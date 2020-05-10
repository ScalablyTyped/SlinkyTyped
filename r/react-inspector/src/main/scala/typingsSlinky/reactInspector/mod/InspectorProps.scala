package typingsSlinky.reactInspector.mod

import typingsSlinky.reactInspector.reactInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactInspector.mod.InspectorAsTableProps
  - typingsSlinky.reactInspector.mod.InspectorAsTreeProps
*/
trait InspectorProps extends js.Object

object InspectorProps {
  @scala.inline
  def InspectorAsTableProps(table: `true`): InspectorProps = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorProps]
  }
  @scala.inline
  def InspectorAsTreeProps(): InspectorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorProps]
  }
}

