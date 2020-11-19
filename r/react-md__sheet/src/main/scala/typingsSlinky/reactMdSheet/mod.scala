package typingsSlinky.reactMdSheet

import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.reactMdSheet.anon.SheetPropsPickSheetPropsh
import typingsSlinky.reactMdSheet.anon.SheetPropsPickSheetPropshAbout
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/sheet", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_SHEET_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val DEFAULT_SHEET_TIMEOUT: TransitionTimeout = js.native
  
  /**
    * The Sheet component is an extension of the `Dialog` except that it is fixed
    * to the edges of the viewport instead of centered or full page. This component
    * is great for rendering a navigation tree or menus on mobile devices.
    */
  val Sheet: ForwardRefExoticComponent[SheetPropsPickSheetPropsh | SheetPropsPickSheetPropshAbout] = js.native
}
