package typingsSlinky.atIonicCore

import typingsSlinky.atIonicCore.atIonicCoreMod.Color
import typingsSlinky.atIonicCore.atIonicCoreStrings.button
import typingsSlinky.atIonicCore.atIonicCoreStrings.reset
import typingsSlinky.atIonicCore.atIonicCoreStrings.submit
import typingsSlinky.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesUtilsElementDashInterfaceMod.AnchorInterface
import typingsSlinky.atIonicCore.distTypesUtilsElementDashInterfaceMod.ButtonInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/card/card", JSImport.Namespace)
@js.native
object distTypesComponentsCardCardMod extends js.Object {
  @js.native
  class Card ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    /**
      * If `true`, a button tag will be rendered and the card will be tappable.
      */
    var button: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /* CompleteClass */
    override var disabled: Boolean = js.native
    var isClickable: js.Any = js.native
    var renderCard: js.Any = js.native
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("render")
    def render_MCard(): js.Any = js.native
  }
  
}

