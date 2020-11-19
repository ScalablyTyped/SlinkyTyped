package typingsSlinky.domHelpers

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-helpers/cjs/transitionEnd", JSImport.Namespace)
@js.native
object transitionEndMod extends js.Object {
  
  val TRANSITION_SUPPORTED: Boolean = js.native
  
  def default(element: HTMLElement, handler: Listener): js.Function0[Unit] = js.native
  def default(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = js.native
  
  def parseDuration(node: HTMLElement): Double = js.native
  
  type Listener = js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, js.Any]
}
