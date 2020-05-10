package typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog

import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open file dialog
  */
@js.native
trait IFileOptions extends IDirectoryOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.native
}

object IFileOptions {
  @scala.inline
  def apply(iconRegistry: IIconRegistry, manager: IDocumentManager): IFileOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
  @scala.inline
  implicit class IFileOptionsOps[Self <: IFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: /* value */ IModel => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
  }
  
}

