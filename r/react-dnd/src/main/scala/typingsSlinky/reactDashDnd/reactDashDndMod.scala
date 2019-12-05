package typingsSlinky.reactDashDnd

import slinky.core.ReactComponentClass
import typingsSlinky.dndDashCore.libInterfacesMod.BackendFactory
import typingsSlinky.dndDashCore.libInterfacesMod.SourceType
import typingsSlinky.dndDashCore.libInterfacesMod.TargetType
import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashDnd.libCommonDndContextMod.DndContextType
import typingsSlinky.reactDashDnd.libCommonDndProviderMod.DndProviderProps
import typingsSlinky.reactDashDnd.libCommonDragPreviewImageMod.DragPreviewImageProps
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DndComponentEnhancer
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DragLayerCollector
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DragSourceCollector
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DragSourceSpec
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DropTargetCollector
import typingsSlinky.reactDashDnd.libDecoratorsInterfacesMod.DropTargetSpec
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectDragSource
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DragSourceHookSpec
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DropTargetHookSpec
import typingsSlinky.reactDashDnd.libInterfacesMonitorsMod.DragLayerMonitor
import typingsSlinky.reactDashDnd.libInterfacesOptionsMod.DndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd", JSImport.Namespace)
@js.native
object reactDashDndMod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: ReactComponentClass[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: ReactComponentClass[DragPreviewImageProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): Anon_DragDropManager = js.native
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

