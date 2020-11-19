package typingsSlinky.reactMdStates.reducerMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdStates.typesMod.RippleEvent
import typingsSlinky.reactMdStates.typesMod.RippleState
import typingsSlinky.reactMdStates.typesMod.RipplesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue[E /* <: HTMLElement */] extends js.Object {
  
  def cancel(): Unit = js.native
  def cancel(ease: Boolean): Unit = js.native
  
  def create(event: RippleEvent[E]): Unit = js.native
  
  def entered(ripple: RippleState): Unit = js.native
  
  def release(event: RippleEvent[E]): Unit = js.native
  
  def remove(ripple: RippleState): Unit = js.native
  
  var state: RipplesState = js.native
}
