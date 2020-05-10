package typingsSlinky.jupyterlabConsole.panelMod.ConsolePanel

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsSlinky.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console panel.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The base path for a new console.
    */
  var basePath: js.UndefOr[String] = js.native
  /**
    * The content factory for the panel.
    */
  var contentFactory: IContentFactory = js.native
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.native
  /**
    * The service manager used by the panel.
    */
  var manager: IManager = js.native
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.native
  /**
    * The name of the console.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The path of an existing console.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The rendermime instance used by the panel.
    */
  var rendermime: IRenderMimeRegistry = js.native
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    manager: IManager,
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentFactory(value: IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManager(value: IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeTypeService(value: IEditorMimeTypeService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendermime(value: IRenderMimeRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendermime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelPreference(value: IKernelPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withModelFactory(value: IModelFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBusy(value: () => IDisposable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSetBusy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBusy")(js.undefined)
        ret
    }
  }
  
}

