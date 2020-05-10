package typingsSlinky.reactDndMultiBackend.mod

import typingsSlinky.dndCore.interfacesMod.Backend
import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendDeclaration extends js.Object {
  /**
    * Backend - e.g. the one provided by react-dnd-html5-backend.
    */
  var backend: BackendFactory = js.native
  /**
    * Parameters to the backend
    */
  var options: js.UndefOr[js.Object] = js.native
  /**
    * Flag to indicate that this backend needs to have a custom preview generated. This is mainly
    * used for backends such as the react-dnd-touch-backend, where there is no default preview
    * available.
    */
  var preview: js.UndefOr[Boolean] = js.native
  /**
    * The transition that this backend should be used for.
    */
  var transition: js.UndefOr[Transition] = js.native
}

object BackendDeclaration {
  @scala.inline
  def apply(
    backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => Backend
  ): BackendDeclaration = {
    val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
    __obj.asInstanceOf[BackendDeclaration]
  }
  @scala.inline
  implicit class BackendDeclarationOps[Self <: BackendDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(
      value: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => Backend
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

