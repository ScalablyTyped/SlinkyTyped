package typingsSlinky.rcCollapse.components

import typingsSlinky.rcCollapse.collapseMod.default
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  @JSImport("rc-collapse/es/Collapse", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Collapse.type): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, js.Dictionary.empty))()
}
