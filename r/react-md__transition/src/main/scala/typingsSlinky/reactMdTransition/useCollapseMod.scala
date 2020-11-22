package typingsSlinky.reactMdTransition

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdTransition.typesMod.CollapseOptions
import typingsSlinky.reactMdTransition.typesMod.CollapseTransitionProvidedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/transition/types/useCollapse", JSImport.Namespace)
@js.native
object useCollapseMod extends js.Object {
  
  def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = js.native
  def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = js.native
  
  type Rendered = Boolean
  
  type ReturnValue[E /* <: HTMLElement */] = js.Tuple2[Rendered, CollapseTransitionProvidedProps[E]]
}
