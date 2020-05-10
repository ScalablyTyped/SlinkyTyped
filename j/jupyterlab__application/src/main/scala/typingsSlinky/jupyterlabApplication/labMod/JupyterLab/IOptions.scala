package typingsSlinky.jupyterlabApplication.labMod.JupyterLab

import typingsSlinky.jupyterlabApplication.AnonMatches
import typingsSlinky.jupyterlabApplication.PartialIPaths
import typingsSlinky.jupyterlabApplication.shellMod.LabShell
import typingsSlinky.jupyterlabApputils.mod.CommandLinker
import typingsSlinky.jupyterlabDocregistry.mod.DocumentRegistry
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import typingsSlinky.phosphorWidgets.menuMod.Menu.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a JupyterLab object.
  */
/* Inlined parent @jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IOptions<@jupyterlab/application.@jupyterlab/application/lib/shell.LabShell, any> */
/* Inlined parent std.Partial<@jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo> */
@js.native
trait IOptions extends js.Object {
  /**
    * The command linker used by the application.
    */
  var commandLinker: js.UndefOr[CommandLinker] = js.native
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[IRenderer] = js.native
  var deferred: js.UndefOr[AnonMatches] = js.native
  var devMode: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[AnonMatches] = js.native
  /**
    * The document registry instance used by the application.
    */
  var docRegistry: js.UndefOr[DocumentRegistry] = js.native
  var filesCached: js.UndefOr[Boolean] = js.native
  var mimeExtensions: js.UndefOr[js.Array[IExtensionModule]] = js.native
  var paths: js.UndefOr[PartialIPaths] = js.native
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  var restored: js.UndefOr[js.Promise[_]] = js.native
  /**
    * The service manager used by the application.
    */
  var serviceManager: js.UndefOr[ServiceManager] = js.native
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: LabShell = js.native
}

object IOptions {
  @scala.inline
  def apply(shell: LabShell): IOptions = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShell(value: LabShell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandLinker(value: CommandLinker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLinker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommandLinker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLinker")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuRenderer(value: IRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferred(value: AnonMatches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferred")(js.undefined)
        ret
    }
    @scala.inline
    def withDevMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: AnonMatches): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDocRegistry(value: DocumentRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docRegistry")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesCached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesCached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesCached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesCached")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeExtensions(value: js.Array[IExtensionModule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: PartialIPaths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withRestored(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceManager(value: ServiceManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceManager")(js.undefined)
        ret
    }
  }
  
}

