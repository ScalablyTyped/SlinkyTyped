package typingsSlinky.reactDnd

import slinky.core.ReactComponentClass
import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.react.mod.Context
import typingsSlinky.reactDnd.anon.DragDropManager
import typingsSlinky.reactDnd.dndContextMod.DndContextType
import typingsSlinky.reactDnd.dndProviderMod.DndProviderProps
import typingsSlinky.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common", JSImport.Namespace)
@js.native
object commonMod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: ReactComponentClass[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: ReactComponentClass[DragPreviewImageProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DragDropManager = js.native
}

