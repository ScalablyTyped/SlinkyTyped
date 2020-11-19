package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/ScrollablePane", JSImport.Namespace)
@js.native
object libScrollablePaneMod extends js.Object {
  
  val ScrollablePane: ReactComponentClass[IScrollablePaneProps] = js.native
  
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  
  @js.native
  class ScrollablePaneBase protected ()
    extends typingsSlinky.officeUiFabricReact.scrollablePaneMod.ScrollablePaneBase {
    def this(props: IScrollablePaneProps) = this()
  }
  
  @js.native
  object ScrollbarVisibility extends js.Object {
    
    var always: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.always = js.native
    
    var auto: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.auto = js.native
  }
}
