package typingsSlinky.reactMdExpansionPanel

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdExpansionPanel.expansionListMod.ExpansionListProps
import typingsSlinky.reactMdExpansionPanel.expansionPanelHeaderMod.ExpansionPanelHeaderProps
import typingsSlinky.reactMdExpansionPanel.expansionPanelMod.ExpansionPanelProps
import typingsSlinky.reactMdExpansionPanel.usePanelsMod.ReturnValue
import typingsSlinky.reactMdExpansionPanel.usePanelsMod.UsePanelsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/expansion-panel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps with RefAttributes[HTMLDivElement]] = js.native
  
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]] = js.native
  
  def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = js.native
}
