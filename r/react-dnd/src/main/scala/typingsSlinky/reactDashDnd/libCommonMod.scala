package typingsSlinky.reactDashDnd

import slinky.core.ReactComponentClass
import typingsSlinky.dndDashCore.libInterfacesMod.BackendFactory
import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashDnd.libCommonDndContextMod.DndContextType
import typingsSlinky.reactDashDnd.libCommonDndProviderMod.DndProviderProps
import typingsSlinky.reactDashDnd.libCommonDragPreviewImageMod.DragPreviewImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common", JSImport.Namespace)
@js.native
object libCommonMod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: ReactComponentClass[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: ReactComponentClass[DragPreviewImageProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): Anon_DragDropManager = js.native
}

