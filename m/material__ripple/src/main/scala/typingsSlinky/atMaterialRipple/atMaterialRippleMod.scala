package typingsSlinky.atMaterialRipple

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Window
import typingsSlinky.atMaterialRipple.adapterMod.MDCRippleAdapter
import typingsSlinky.atMaterialRipple.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple", JSImport.Namespace)
@js.native
object atMaterialRippleMod extends js.Object {
  @js.native
  class MDCRipple ()
    extends typingsSlinky.atMaterialBase.componentMod.default[MDCRippleAdapter, default] {
    var unbounded: Boolean = js.native
    def activate(): Unit = js.native
    def deactivate(): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCRippleFoundation () extends default
  
  @js.native
  class RippleCapableSurface () extends js.Object {
    /**
      * Whether or not the ripple is attached to a disabled component.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    var root_ : Element = js.native
    /**
      * Whether or not the ripple bleeds out of the bounds of the element.
      */
    var unbounded: js.UndefOr[Boolean] = js.native
  }
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): MDCRipple = js.native
    def attachTo(root: Element, options: Anon_IsUnbounded): MDCRipple = js.native
    def createAdapter(instance: RippleCapableSurface): MDCRippleAdapter = js.native
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

