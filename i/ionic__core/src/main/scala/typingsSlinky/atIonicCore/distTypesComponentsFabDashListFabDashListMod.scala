package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.atIonicCoreStrings.bottom
import typingsSlinky.atIonicCore.atIonicCoreStrings.end
import typingsSlinky.atIonicCore.atIonicCoreStrings.start
import typingsSlinky.atIonicCore.atIonicCoreStrings.top
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonFabElement
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/fab-list/fab-list", JSImport.Namespace)
@js.native
object distTypesComponentsFabDashListFabDashListMod extends js.Object {
  @js.native
  class FabList () extends ComponentInterface {
    /**
      * If `true`, the fab list will show all fab buttons in the list.
      */
    var activated: Boolean = js.native
    var el: HTMLIonFabElement = js.native
    /**
      * The side the fab list will show on relative to the main fab button.
      */
    var side: start | end | top | bottom = js.native
    /* protected */ def activatedChanged(activated: Boolean): Unit = js.native
    @JSName("render")
    def render_MFabList(): js.Any = js.native
  }
  
}

