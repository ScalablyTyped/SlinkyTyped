package typingsSlinky.rcCollapse.components

import typingsSlinky.rcCollapse.interfaceMod.CollapsePanelProps
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import typingsSlinky.rcCollapse.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcCollapse {
  
  object Panel {
    
    @JSImport("rc-collapse", "default.Panel")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Panel.type): SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.mod.default.Panel] = new SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.mod.default.Panel](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CollapsePanelProps): SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.mod.default.Panel] = new SharedBuilder_CollapsePanelProps729265015[typingsSlinky.rcCollapse.mod.default.Panel](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-collapse", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcCollapse.type): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
