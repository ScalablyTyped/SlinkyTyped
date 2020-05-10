package typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Header
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open directory dialog
  */
/* Inlined parent std.Partial<std.Pick<@jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>> */
@js.native
trait IDirectoryOptions extends js.Object {
  var focusNodeSelector: js.UndefOr[String] = js.native
  var host: js.UndefOr[HTMLElement] = js.native
  /**
    * An icon registry instance.
    */
  var iconRegistry: IIconRegistry = js.native
  /**
    * Document manager
    */
  var manager: IDocumentManager = js.native
  var renderer: js.UndefOr[IRenderer] = js.native
  var title: js.UndefOr[Header] = js.native
}

object IDirectoryOptions {
  @scala.inline
  def apply(iconRegistry: IIconRegistry, manager: IDocumentManager): IDirectoryOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectoryOptions]
  }
  @scala.inline
  implicit class IDirectoryOptionsOps[Self <: IDirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconRegistry(value: IIconRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRegistry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManager(value: IDocumentManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusNodeSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNodeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusNodeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusNodeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: IRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

