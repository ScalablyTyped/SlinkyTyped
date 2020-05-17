package typingsSlinky.reactDnd.anon

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend[BackendContext, BackendOptions] extends DndProviderProps[BackendContext, BackendOptions] {
  var backend: BackendFactory = js.native
  var context: js.UndefOr[BackendContext] = js.native
  var debugMode: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[BackendOptions] = js.native
}

object Backend {
  @scala.inline
  def apply[BackendContext, BackendOptions](
    backend: (/* manager */ typingsSlinky.dndCore.interfacesMod.DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typingsSlinky.dndCore.interfacesMod.Backend
  ): Backend[BackendContext, BackendOptions] = {
    val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
    __obj.asInstanceOf[Backend[BackendContext, BackendOptions]]
  }
  @scala.inline
  implicit class BackendOps[Self[backendcontext, backendoptions] <: Backend[backendcontext, backendoptions], BackendContext, BackendOptions] (val x: Self[BackendContext, BackendOptions]) extends AnyVal {
    @scala.inline
    def duplicate: Self[BackendContext, BackendOptions] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[BackendContext, BackendOptions]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[BackendContext, BackendOptions]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[BackendContext, BackendOptions]) with Other]
    @scala.inline
    def withBackend(
      value: (/* manager */ typingsSlinky.dndCore.interfacesMod.DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typingsSlinky.dndCore.interfacesMod.Backend
    ): Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withContext(value: BackendContext): Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: BackendOptions): Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[BackendContext, BackendOptions] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

