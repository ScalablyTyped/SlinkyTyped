package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import typingsSlinky.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav-set-root/nav-set-root", JSImport.Namespace)
@js.native
object navSetRootMod extends js.Object {
  @js.native
  class NavSetRoot () extends ComponentInterface {
    /**
      * Component you want to make root for the navigation stack
      *
      */
    var component: js.UndefOr[NavComponent] = js.native
    /**
      * Data you want to pass to the component as props
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    var el: HTMLElement = js.native
    var setRoot: js.Any = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MNavSetRoot(): Unit = js.native
    @JSName("render")
    def render_MNavSetRoot(): js.Any = js.native
  }
  
}

