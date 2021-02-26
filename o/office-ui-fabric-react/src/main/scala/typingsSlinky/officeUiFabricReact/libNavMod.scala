package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.navTypesMod.INavProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavMod {
  
  @JSImport("office-ui-fabric-react/lib/Nav", "Nav")
  @js.native
  val Nav: ReactComponentClass[INavProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Nav", "NavBase")
  @js.native
  class NavBase protected ()
    extends typingsSlinky.officeUiFabricReact.navMod.NavBase {
    def this(props: INavProps) = this()
  }
  /* static members */
  object NavBase {
    
    @JSImport("office-ui-fabric-react/lib/Nav", "NavBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Nav", "NavBase.defaultProps")
    @js.native
    def defaultProps: INavProps = js.native
    @scala.inline
    def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Nav", "isRelativeUrl")
  @js.native
  def isRelativeUrl(url: String): Boolean = js.native
}
