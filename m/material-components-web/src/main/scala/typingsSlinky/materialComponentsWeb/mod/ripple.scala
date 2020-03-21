package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsSlinky.materialRipple.AnonIsUnbounded
import typingsSlinky.materialRipple.AnonPassive
import typingsSlinky.materialRipple.AnonX
import typingsSlinky.materialRipple.adapterMod.MDCRippleAdapter
import typingsSlinky.std.Event_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "ripple")
@js.native
object ripple extends js.Object {
  @js.native
  class MDCRipple ()
    extends typingsSlinky.materialRipple.mod.MDCRipple
  
  @js.native
  class MDCRippleFoundation ()
    extends typingsSlinky.materialRipple.mod.MDCRippleFoundation
  
  @js.native
  class RippleCapableSurface ()
    extends typingsSlinky.materialRipple.mod.RippleCapableSurface
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): typingsSlinky.materialRipple.mod.MDCRipple = js.native
    def attachTo(root: Element, options: AnonIsUnbounded): typingsSlinky.materialRipple.mod.MDCRipple = js.native
    def createAdapter(instance: typingsSlinky.materialRipple.mod.RippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typingsSlinky.materialRipple.constantsMod.numbers = js.native
    val strings: typingsSlinky.materialRipple.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def applyPassive(): Boolean | AnonPassive = js.native
    def applyPassive(globalObj: Window_): Boolean | AnonPassive = js.native
    def applyPassive(globalObj: Window_, forceRefresh: Boolean): Boolean | AnonPassive = js.native
    def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
    def getNormalizedEventCoords(ev: Event_, pageOffset: AnonX, clientRect: ClientRect): AnonX = js.native
    def supportsCssVariables(windowObj: Window_): js.UndefOr[Boolean] = js.native
    def supportsCssVariables(windowObj: Window_, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
  }
  
}

