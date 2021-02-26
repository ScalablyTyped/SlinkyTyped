package typingsSlinky.reactDnd

import slinky.core.ReactComponentClass
import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.SourceType
import typingsSlinky.dndCore.interfacesMod.TargetType
import typingsSlinky.react.mod.Context
import typingsSlinky.reactDnd.connectorsMod.ConnectDragPreview
import typingsSlinky.reactDnd.connectorsMod.ConnectDragSource
import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.dndContextMod.DndContextType
import typingsSlinky.reactDnd.dndProviderMod.DndProviderProps
import typingsSlinky.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import typingsSlinky.reactDnd.hooksApiMod.DragObjectWithType
import typingsSlinky.reactDnd.hooksApiMod.DragSourceHookSpec
import typingsSlinky.reactDnd.hooksApiMod.DropTargetHookSpec
import typingsSlinky.reactDnd.interfacesMod.DndComponentEnhancer
import typingsSlinky.reactDnd.interfacesMod.DragLayerCollector
import typingsSlinky.reactDnd.interfacesMod.DragSourceCollector
import typingsSlinky.reactDnd.interfacesMod.DragSourceSpec
import typingsSlinky.reactDnd.interfacesMod.DropTargetCollector
import typingsSlinky.reactDnd.interfacesMod.DropTargetSpec
import typingsSlinky.reactDnd.monitorsMod.DragLayerMonitor
import typingsSlinky.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd", "DndProvider")
  @js.native
  val DndProvider: ReactComponentClass[DndProviderProps[js.Any, js.Any]] = js.native
  
  @JSImport("react-dnd", "DragLayer")
  @js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DragLayer")
  @js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
  
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  val DragPreviewImage: ReactComponentClass[DragPreviewImageProps] = js.native
  
  @JSImport("react-dnd", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  
  @JSImport("react-dnd", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd", "DropTarget")
  @js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: BackendContext,
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: js.UndefOr[scala.Nothing], options: BackendOptions): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: BackendOptions,
    debugMode: Boolean
  ): DndContextType = js.native
  @JSImport("react-dnd", "createDndContext")
  @js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  
  @JSImport("react-dnd", "useDrag")
  @js.native
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  
  @JSImport("react-dnd", "useDragDropManager")
  @js.native
  def useDragDropManager(): DragDropManager = js.native
  
  @JSImport("react-dnd", "useDragLayer")
  @js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  
  @JSImport("react-dnd", "useDrop")
  @js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}
