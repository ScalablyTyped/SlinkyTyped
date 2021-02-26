package typingsSlinky.reactMdAppBar

import org.scalajs.dom.raw.HTMLButtonElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdAppBar.useInheritContextMod.AppBarColorInherit
import typingsSlinky.reactMdButton.buttonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarNavMod {
  
  @JSImport("@react-md/app-bar/types/AppBarNav", "AppBarNav")
  @js.native
  val AppBarNav: ForwardRefExoticComponent[AppBarNavProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @js.native
  trait AppBarNavProps
    extends ButtonProps
       with AppBarColorInherit
  object AppBarNavProps {
    
    @scala.inline
    def apply(): AppBarNavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarNavProps]
    }
  }
}
