package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.TargetType
import typingsSlinky.reactDnd.interfacesMod.DndComponentEnhancer
import typingsSlinky.reactDnd.interfacesMod.DropTargetCollector
import typingsSlinky.reactDnd.interfacesMod.DropTargetSpec
import typingsSlinky.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropTargetMod {
  
  @JSImport("react-dnd/lib/decorators/DropTarget", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DropTarget", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DropTarget", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DropTarget", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
}
