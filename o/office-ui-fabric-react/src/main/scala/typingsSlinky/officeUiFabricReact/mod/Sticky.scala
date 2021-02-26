package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.scrollablePaneTypesMod.IScrollablePaneContext
import typingsSlinky.officeUiFabricReact.stickyTypesMod.IStickyProps
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Sticky")
@js.native
class Sticky protected ()
  extends typingsSlinky.officeUiFabricReact.libStickyMod.Sticky {
  def this(props: IStickyProps) = this()
}
/* static members */
object Sticky {
  
  @JSImport("office-ui-fabric-react", "Sticky")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Sticky.contextType")
  @js.native
  def contextType: Context[IScrollablePaneContext] = js.native
  @scala.inline
  def contextType_=(x: Context[IScrollablePaneContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Sticky.defaultProps")
  @js.native
  def defaultProps: IStickyProps = js.native
  @scala.inline
  def defaultProps_=(x: IStickyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
