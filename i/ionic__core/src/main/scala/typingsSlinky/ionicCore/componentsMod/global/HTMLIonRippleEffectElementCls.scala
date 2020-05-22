package typingsSlinky.ionicCore.componentsMod.global

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import typingsSlinky.ionicCore.ionicCoreStrings.bounded
import typingsSlinky.ionicCore.ionicCoreStrings.unbounded
import typingsSlinky.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonRippleEffectElement")
@js.native
class HTMLIonRippleEffectElementCls () extends HTMLIonRippleEffectElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * Sets the type of ripple-effect:  - `bounded`: the ripple effect expands from the user's click position - `unbounded`: the ripple effect expands from the center of the button and overflows the container.  NOTE: Surfaces for bounded ripples should have the overflow property set to hidden, while surfaces for unbounded ripples should have it set to visible.
    */
  /* CompleteClass */
  override var `type`: bounded | unbounded = js.native
  /**
    * Adds the ripple effect to the parent element.
    * @param x The horizontal coordinate of where the ripple should start.
    * @param y The vertical coordinate of where the ripple should start.
    */
  /* CompleteClass */
  override def addRipple(x: Double, y: Double): js.Promise[js.Function0[Unit]] = js.native
}

