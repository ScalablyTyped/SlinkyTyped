package typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog

import org.scalajs.dom.raw.HTMLElement
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
trait IDirectoryOptions extends js.Object {
  var focusNodeSelector: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[HTMLElement] = js.undefined
  /**
    * An icon registry instance.
    */
  var iconRegistry: IIconRegistry
  /**
    * Document manager
    */
  var manager: IDocumentManager
  var renderer: js.UndefOr[IRenderer] = js.undefined
  var title: js.UndefOr[Header] = js.undefined
}

object IDirectoryOptions {
  @scala.inline
  def apply(
    iconRegistry: IIconRegistry,
    manager: IDocumentManager,
    focusNodeSelector: String = null,
    host: HTMLElement = null,
    renderer: IRenderer = null,
    title: Header = null
  ): IDirectoryOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    if (focusNodeSelector != null) __obj.updateDynamic("focusNodeSelector")(focusNodeSelector.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectoryOptions]
  }
}

