package typingsSlinky.rcCollapse

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.rcCollapse.anon.Accordion
import typingsSlinky.rcCollapse.anon.ForceRender
import typingsSlinky.rcCollapse.anon.PartialCollapseState
import typingsSlinky.rcCollapse.anon.TypeofCollapsePanel
import typingsSlinky.rcCollapse.interfaceMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-collapse", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Panel ()
    extends typingsSlinky.rcCollapse.panelMod.default
  @js.native
  object Panel
    extends Instantiable0[typingsSlinky.rcCollapse.panelMod.default] {
    
    var defaultProps: ForceRender = js.native
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.rcCollapse.collapseMod.default {
    def this(props: CollapseProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Panel: TypeofCollapsePanel = js.native
    
    var defaultProps: Accordion = js.native
    
    def getDerivedStateFromProps(nextProps: CollapseProps): PartialCollapseState = js.native
  }
}
