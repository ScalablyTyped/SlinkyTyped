package typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd

import typingsSlinky.jupyterlabApputils.mod.CommandLinker
import typingsSlinky.jupyterlabDocregistry.mod.DocumentRegistry
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a JupyterFrontEnd.
  */
@js.native
trait IOptions[T /* <: IShell */, U]
  extends typingsSlinky.phosphorApplication.mod.Application.IOptions[T] {
  /**
    * The command linker used by the application.
    */
  var commandLinker: js.UndefOr[CommandLinker] = js.native
  /**
    * The document registry instance used by the application.
    */
  var docRegistry: js.UndefOr[DocumentRegistry] = js.native
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  var restored: js.UndefOr[js.Promise[U]] = js.native
  /**
    * The service manager used by the application.
    */
  var serviceManager: js.UndefOr[ServiceManager] = js.native
}

object IOptions {
  @scala.inline
  def apply[T, U](shell: T): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
  @scala.inline
  implicit class IOptionsOps[Self[t, u] <: IOptions[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withCommandLinker(value: CommandLinker): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLinker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLinker: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLinker")(js.undefined)
        ret
    }
    @scala.inline
    def withDocRegistry(value: DocumentRegistry): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocRegistry: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docRegistry")(js.undefined)
        ret
    }
    @scala.inline
    def withRestored(value: js.Promise[U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestored: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceManager(value: ServiceManager): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceManager: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManager")(js.undefined)
        ret
    }
  }
  
}

