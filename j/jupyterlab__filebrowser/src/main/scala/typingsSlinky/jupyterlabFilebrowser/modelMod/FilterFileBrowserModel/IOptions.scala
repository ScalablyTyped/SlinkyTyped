package typingsSlinky.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel

import typingsSlinky.jupyterlabCoreutils.tokensMod.IStateDB
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options
  */
trait IOptions
  extends typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    iconRegistry: IIconRegistry,
    manager: IDocumentManager,
    driveName: String = null,
    filter: /* value */ IModel => Boolean = null,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    state: IStateDB[ReadonlyJSONValue] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(iconRegistry = iconRegistry.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    if (driveName != null) __obj.updateDynamic("driveName")(driveName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

