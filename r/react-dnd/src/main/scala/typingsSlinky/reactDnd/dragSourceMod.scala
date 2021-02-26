package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.SourceType
import typingsSlinky.reactDnd.interfacesMod.DndComponentEnhancer
import typingsSlinky.reactDnd.interfacesMod.DragSourceCollector
import typingsSlinky.reactDnd.interfacesMod.DragSourceSpec
import typingsSlinky.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragSourceMod {
  
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
}
