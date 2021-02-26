package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.navTypesMod.INavProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Nav", "Nav")
  @js.native
  val Nav: ReactComponentClass[INavProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Nav", "NavBase")
  @js.native
  class NavBase protected ()
    extends typingsSlinky.officeUiFabricReact.navBaseMod.NavBase {
    def this(props: INavProps) = this()
  }
  /* static members */
  object NavBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Nav", "NavBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Nav", "NavBase.defaultProps")
    @js.native
    def defaultProps: INavProps = js.native
    @scala.inline
    def defaultProps_=(x: INavProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Nav", "isRelativeUrl")
  @js.native
  def isRelativeUrl(url: String): Boolean = js.native
}
