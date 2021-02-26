package typingsSlinky.reactMdTransition

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdTransition.typesMod.CollapseOptions
import typingsSlinky.reactMdTransition.typesMod.CollapseTransitionProvidedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCollapseMod {
  
  @JSImport("@react-md/transition/types/useCollapse", "useCollapse")
  @js.native
  def useCollapse[E /* <: HTMLElement */](collapsed: Boolean): ReturnValue[E] = js.native
  @JSImport("@react-md/transition/types/useCollapse", "useCollapse")
  @js.native
  def useCollapse[E /* <: HTMLElement */](
    collapsed: Boolean,
    hasClassNameAppearTimeoutOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedMinHeightMinPaddingTopMinPaddingBottomTemporary: CollapseOptions[E]
  ): ReturnValue[E] = js.native
  
  type Rendered = Boolean
  
  type ReturnValue[E /* <: HTMLElement */] = js.Tuple2[Rendered, CollapseTransitionProvidedProps[E]]
}
