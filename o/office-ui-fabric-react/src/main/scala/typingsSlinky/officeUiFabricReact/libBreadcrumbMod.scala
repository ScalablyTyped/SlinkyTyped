package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBreadcrumbMod {
  
  @JSImport("office-ui-fabric-react/lib/Breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: ReactComponentClass[IBreadcrumbProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Breadcrumb", "BreadcrumbBase")
  @js.native
  class BreadcrumbBase protected ()
    extends typingsSlinky.officeUiFabricReact.breadcrumbMod.BreadcrumbBase {
    def this(props: IBreadcrumbProps) = this()
  }
  /* static members */
  object BreadcrumbBase {
    
    @JSImport("office-ui-fabric-react/lib/Breadcrumb", "BreadcrumbBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Breadcrumb", "BreadcrumbBase.defaultProps")
    @js.native
    def defaultProps: IBreadcrumbProps = js.native
    @scala.inline
    def defaultProps_=(x: IBreadcrumbProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
