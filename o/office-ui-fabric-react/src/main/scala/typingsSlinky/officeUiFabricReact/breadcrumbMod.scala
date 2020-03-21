package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Breadcrumb", JSImport.Namespace)
@js.native
object breadcrumbMod extends js.Object {
  @js.native
  class BreadcrumbBase protected ()
    extends typingsSlinky.officeUiFabricReact.breadcrumbBaseMod.BreadcrumbBase {
    def this(props: IBreadcrumbProps) = this()
  }
  
  val Breadcrumb: ReactComponentClass[IBreadcrumbProps] = js.native
  /* static members */
  @js.native
  object BreadcrumbBase extends js.Object {
    var defaultProps: IBreadcrumbProps = js.native
  }
  
}

