package typingsSlinky.reactMdStates.utilsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdStates.reactMdStatesStrings.currentTarget
import typingsSlinky.reactMdStates.reactMdStatesStrings.target
import typingsSlinky.reactMdStates.typesMod.RippleEvent
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/states/types/ripples/utils", "isBubbled")
@js.native
object isBubbled extends js.Object {
  
  def apply[E /* <: HTMLElement */](event: Pick[RippleEvent[E], currentTarget | target]): Boolean = js.native
}
