package typingsSlinky.reactInspector.components

import typingsSlinky.reactInspector.reactInspectorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInspector {
  object InspectorAsTableProps {
    @JSImport("react-inspector", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.reactInspector.mod.InspectorAsTableProps): SharedBuilder_InspectorProps474652290 = new SharedBuilder_InspectorProps474652290(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(table: `true`): SharedBuilder_InspectorProps474652290 = {
        val __props = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
        new SharedBuilder_InspectorProps474652290(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactInspector.mod.InspectorAsTableProps]))
    }
  }
  
  object InspectorAsTreeProps {
    @JSImport("react-inspector", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.reactInspector.mod.InspectorAsTreeProps): SharedBuilder_InspectorProps474652290 = new SharedBuilder_InspectorProps474652290(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: InspectorAsTreeProps.type): SharedBuilder_InspectorProps474652290 = new SharedBuilder_InspectorProps474652290(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

