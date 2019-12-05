package typingsSlinky.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.atMaterialRipple.Anon_IsUnbounded
import typingsSlinky.atMaterialRipple.Anon_Passive
import typingsSlinky.atMaterialRipple.Anon_X
import typingsSlinky.atMaterialRipple.adapterMod.MDCRippleAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "ripple")
@js.native
object ripple extends js.Object {
  @js.native
  class MDCRipple ()
    extends typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple
  
  @js.native
  class MDCRippleFoundation ()
    extends typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRippleFoundation
  
  @js.native
  class RippleCapableSurface ()
    extends typingsSlinky.atMaterialRipple.atMaterialRippleMod.RippleCapableSurface
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple = js.native
    def attachTo(root: Element, options: Anon_IsUnbounded): typingsSlinky.atMaterialRipple.atMaterialRippleMod.MDCRipple = js.native
    def createAdapter(instance: typingsSlinky.atMaterialRipple.atMaterialRippleMod.RippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    val cssClasses: typingsSlinky.atMaterialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typingsSlinky.atMaterialRipple.constantsMod.numbers = js.native
    val strings: typingsSlinky.atMaterialRipple.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def applyPassive(): Boolean | Anon_Passive = js.native
    def applyPassive(globalObj: Window): Boolean | Anon_Passive = js.native
    def applyPassive(globalObj: Window, forceRefresh: Boolean): Boolean | Anon_Passive = js.native
    def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
    def getNormalizedEventCoords(ev: Event, pageOffset: Anon_X, clientRect: ClientRect): Anon_X = js.native
    def supportsCssVariables(windowObj: Window): js.UndefOr[Boolean] = js.native
    def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
  }
  
}

