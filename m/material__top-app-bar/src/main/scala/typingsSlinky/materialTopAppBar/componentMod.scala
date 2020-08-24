package typingsSlinky.materialTopAppBar

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventTarget
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialRipple.componentMod.MDCRippleFactory
import typingsSlinky.materialTopAppBar.materialTopAppBarMod.MDCTopAppBarBaseFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCTopAppBar () extends MDCComponent[MDCTopAppBarBaseFoundation] {
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    def setScrollTarget(target: EventTarget): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): MDCTopAppBar = js.native
  }
  
}

