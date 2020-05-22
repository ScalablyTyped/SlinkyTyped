package typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Header
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open file dialog
  */
trait IFileOptions extends IDirectoryOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    iconRegistry: IIconRegistry,
    manager: IDocumentManager,
    filter: /* value */ IModel => Boolean = null,
    focusNodeSelector: String = null,
    host: HTMLElement = null,
    renderer: IRenderer = null,
    title: Header = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (focusNodeSelector != null) __obj.updateDynamic("focusNodeSelector")(focusNodeSelector.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

