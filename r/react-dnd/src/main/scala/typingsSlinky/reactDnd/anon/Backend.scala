package typingsSlinky.reactDnd.anon

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend[BackendContext, BackendOptions] extends DndProviderProps[BackendContext, BackendOptions] {
  var backend: BackendFactory
  var context: js.UndefOr[BackendContext] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[BackendOptions] = js.undefined
}

object Backend {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: (/* manager */ typingsSlinky.dndCore.interfacesMod.DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typingsSlinky.dndCore.interfacesMod.Backend,
    context: BackendContext = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    options: BackendOptions = null
  ): Backend[BackendContext, BackendOptions] = {
    val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend[BackendContext, BackendOptions]]
  }
}

