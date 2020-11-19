package typingsSlinky.reactMdStates.reducerMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdStates.typesMod.RippleEvent
import typingsSlinky.reactMdStates.typesMod.RippleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactMdStates.reducerMod.CreateAction[E]
  - typingsSlinky.reactMdStates.reducerMod.ReleaseAction[E]
  - typingsSlinky.reactMdStates.reducerMod.CancelAction
  - typingsSlinky.reactMdStates.reducerMod.EnteredAction
  - typingsSlinky.reactMdStates.reducerMod.RemoveAction
*/
trait RippleStateAction[E /* <: HTMLElement */] extends js.Object
object RippleStateAction {
  
  @scala.inline
  def ReleaseAction[E /* <: HTMLElement */](event: RippleEvent[E], `type`: /* "RELEASE" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def EnteredAction[E /* <: HTMLElement */](ripple: RippleState, `type`: /* "ENTERED" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def CancelAction[E /* <: HTMLElement */](ease: Boolean, `type`: /* "CANCEL" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def RemoveAction[E /* <: HTMLElement */](ripple: RippleState, `type`: /* "REMOVE" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(ripple = ripple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
  
  @scala.inline
  def CreateAction[E /* <: HTMLElement */](disableSpacebarClick: Boolean, event: RippleEvent[E], `type`: /* "CREATE" */ String): RippleStateAction[E] = {
    val __obj = js.Dynamic.literal(disableSpacebarClick = disableSpacebarClick.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleStateAction[E]]
  }
}
