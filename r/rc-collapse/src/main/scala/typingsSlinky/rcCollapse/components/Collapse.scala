package typingsSlinky.rcCollapse.components

import typingsSlinky.rcCollapse.collapseMod.default
import typingsSlinky.rcCollapse.interfaceMod.CollapsePanelProps
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  object Panel {
    
    @JSImport("rc-collapse/es/Collapse", "default.Panel")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.collapseMod.default.Panel] = new SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.collapseMod.default.Panel](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.collapseMod.default.Panel] = new SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.collapseMod.default.Panel](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-collapse/es/Collapse", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Collapse.type): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
