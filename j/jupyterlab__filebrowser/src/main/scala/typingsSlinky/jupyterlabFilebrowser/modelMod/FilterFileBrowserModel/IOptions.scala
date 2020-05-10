package typingsSlinky.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel

import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options
  */
@js.native
trait IOptions
  extends typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.native
}

object IOptions {
  @scala.inline
  def apply(iconRegistry: IIconRegistry, manager: IDocumentManager): IOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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

