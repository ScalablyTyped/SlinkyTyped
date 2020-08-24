package typingsSlinky.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.elementInterfaceMod.ButtonInterface
import typingsSlinky.ionicCore.segmentSegmentInterfaceMod.SegmentButtonLayout
import typingsSlinky.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/segment-button/segment-button", JSImport.Namespace)
@js.native
object segmentButtonMod extends js.Object {
  @js.native
  class SegmentButton ()
    extends ComponentInterface
       with ButtonInterface {
    var checked: Boolean = js.native
    var el: HTMLElement = js.native
    /**
      * Set the layout of the text and icon in the segment.
      */
    var layout: js.UndefOr[SegmentButtonLayout] = js.native
    var segmentEl: js.Any = js.native
    var updateState: js.Any = js.native
    /**
      * The value of the segment button.
      */
    var value: String = js.native
    @JSName("connectedCallback")
    def connectedCallback_MSegmentButton(): Unit = js.native
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSegmentButton(): Unit = js.native
    /* private */ def hasIcon: js.Any = js.native
    /* private */ def hasLabel: js.Any = js.native
    @JSName("render")
    def render_MSegmentButton(): js.Any = js.native
  }
  
}

