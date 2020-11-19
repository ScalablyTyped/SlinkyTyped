package typingsSlinky.reactMdExpansionPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object usePanelsMod {
  
  type CreateExpandById = js.Function1[/* panelId */ java.lang.String, js.Function0[scala.Unit]]
  
  type ExpandedIds = js.Array[java.lang.String]
  
  type ExpansionDispatcher = typingsSlinky.react.mod.Dispatch[
    typingsSlinky.react.mod.SetStateAction[typingsSlinky.reactMdExpansionPanel.usePanelsMod.ExpandedIds]
  ]
  
  type ExpansionPanelKeyDownHandler = typingsSlinky.react.mod.KeyboardEventHandler[org.scalajs.dom.raw.HTMLDivElement]
  
  type ReturnValue = js.Tuple5[
    js.Array[typingsSlinky.reactMdExpansionPanel.usePanelsMod.ProvidedPanelProps], 
    typingsSlinky.reactMdExpansionPanel.usePanelsMod.ExpansionPanelKeyDownHandler, 
    typingsSlinky.reactMdExpansionPanel.usePanelsMod.ExpandedIds, 
    typingsSlinky.reactMdExpansionPanel.usePanelsMod.ExpansionDispatcher, 
    typingsSlinky.reactMdExpansionPanel.usePanelsMod.CreateExpandById
  ]
}
