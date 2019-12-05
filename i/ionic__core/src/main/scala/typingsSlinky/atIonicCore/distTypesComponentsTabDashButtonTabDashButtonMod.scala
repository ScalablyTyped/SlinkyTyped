package typingsSlinky.atIonicCore

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atIonicCore.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod.TabButtonClickEventDetail
import typingsSlinky.atIonicCore.distTypesComponentsTabDashBarTabDashBarDashInterfaceMod.TabButtonLayout
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import typingsSlinky.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import typingsSlinky.atIonicCore.distTypesUtilsElementDashInterfaceMod.AnchorInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/tab-button/tab-button", JSImport.Namespace)
@js.native
object distTypesComponentsTabDashButtonTabDashButtonMod extends js.Object {
  @js.native
  class TabButton ()
    extends ComponentInterface
       with AnchorInterface {
    /**
      * If `true`, the user cannot interact with the tab button.
      */
    var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    val hasIcon: js.Any = js.native
    val hasLabel: js.Any = js.native
    /**
      * Emitted when the tab bar is clicked
      * @internal
      */
    var ionTabButtonClick: EventEmitter[TabButtonClickEventDetail] = js.native
    /**
      * Set the layout of the text and icon in the tab bar.
      * It defaults to `'icon-top'`.
      */
    var layout: js.UndefOr[TabButtonLayout] = js.native
    var onClick: js.Any = js.native
    var onKeyUp: js.Any = js.native
    var selectTab: js.Any = js.native
    /**
      * The selected tab component
      */
    var selected: Boolean = js.native
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: js.UndefOr[String] = js.native
    val tabIndex: js.Any = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MTabButton(): Unit = js.native
    def onTabBarChanged(ev: CustomEvent): Unit = js.native
    @JSName("render")
    def render_MTabButton(): js.Any = js.native
  }
  
}

