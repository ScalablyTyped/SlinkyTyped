package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentProps
import typingsSlinky.atIonicCore.distTypesComponentsNavNavDashInterfaceMod.NavComponent
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav-link/nav-link", JSImport.Namespace)
@js.native
object distTypesComponentsNavDashLinkNavDashLinkMod extends js.Object {
  @js.native
  class NavLink () extends ComponentInterface {
    /**
      * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
      */
    var component: js.UndefOr[NavComponent] = js.native
    /**
      * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    var el: HTMLElement = js.native
    var onClick: js.Any = js.native
    /**
      * The transition direction when navigating to another page.
      */
    var routerDirection: RouterDirection = js.native
    @JSName("render")
    def render_MNavLink(): js.Any = js.native
  }
  
}

