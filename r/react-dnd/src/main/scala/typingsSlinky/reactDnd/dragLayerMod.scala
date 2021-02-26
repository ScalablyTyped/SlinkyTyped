package typingsSlinky.reactDnd

import typingsSlinky.reactDnd.interfacesMod.DndComponentEnhancer
import typingsSlinky.reactDnd.interfacesMod.DragLayerCollector
import typingsSlinky.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragLayerMod {
  
  @JSImport("react-dnd/lib/decorators/DragLayer", "DragLayer")
  @js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragLayer", "DragLayer")
  @js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
}
