package typingsSlinky.reactInspector.mod

import typingsSlinky.reactInspector.reactInspectorBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactInspector.mod.ThemedComponentProps because Already inherited
- typingsSlinky.reactInspector.mod.TreeViewProps because Already inherited
- typingsSlinky.reactInspector.mod.DOMInspectorProps because var conflicts: data, expandLevel, expandPaths, name, nodeRenderer, theme. Inlined  */ @js.native
trait InspectorAsTreeProps
  extends ObjectInspectorProps
     with InspectorBaseProps
     with InspectorProps {
  
  @JSName("table")
  var table_InspectorAsTreeProps: js.UndefOr[`false`] = js.native
}
object InspectorAsTreeProps {
  
  @scala.inline
  def apply(): InspectorAsTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectorAsTreeProps]
  }
  
  @scala.inline
  implicit class InspectorAsTreePropsMutableBuilder[Self <: InspectorAsTreeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTable(value: `false`): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
