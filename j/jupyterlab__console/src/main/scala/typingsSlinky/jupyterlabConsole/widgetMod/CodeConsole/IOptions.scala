package typingsSlinky.jupyterlabConsole.widgetMod.CodeConsole

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsSlinky.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The content factory for the console widget.
    */
  var contentFactory: IContentFactory = js.native
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.native
  /**
    * The mime renderer for the console widget.
    */
  var rendermime: IRenderMimeRegistry = js.native
  /**
    * The client session for the console widget.
    */
  var session: IClientSession = js.native
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry,
    session: IClientSession
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
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
    def withSession(value: IClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
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
  }
  
}

