package typingsSlinky.rcCollapse.components

import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import typingsSlinky.rcCollapse.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcCollapse {
  
  @JSImport("rc-collapse", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CollapseProps): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcCollapse.type): SharedBuilder_CollapseProps_808038352[default] = new SharedBuilder_CollapseProps_808038352[default](js.Array(this.component, js.Dictionary.empty))()
}
