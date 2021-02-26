package typingsSlinky.reactMdTabs

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTransition.typesMod.OverridableCSSTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelMod {
  
  @JSImport("@react-md/tabs/types/TabPanel", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TabPanelProps
    extends HTMLAttributes[HTMLDivElement]
       with OverridableCSSTransitionProps
  object TabPanelProps {
    
    @scala.inline
    def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
  }
}
