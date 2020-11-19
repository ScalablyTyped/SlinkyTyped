package typingsSlinky.reactMdTransition

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.reactMdTransition.constantsMod.TransitionAction
import typingsSlinky.reactMdTransition.constantsMod.TransitionStage
import typingsSlinky.reactMdTransition.typesMod.CSSTransitionOptions
import typingsSlinky.reactMdTransition.typesMod.CSSTransitionProvidedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/transition/types/useCSSTransition", JSImport.Namespace)
@js.native
object useCSSTransitionMod extends js.Object {
  
  def default[E /* <: HTMLElement */](
    hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNameClassNamesRef: CSSTransitionOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  type CSSTransitionReturnValue[E /* <: HTMLElement */] = js.Tuple4[Rendered, CSSTransitionProvidedProps[E], Dispatch[TransitionAction], TransitionStage]
  
  type Rendered = Boolean
}
