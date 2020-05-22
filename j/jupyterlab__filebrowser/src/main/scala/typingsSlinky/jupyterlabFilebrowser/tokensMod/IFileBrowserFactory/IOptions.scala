package typingsSlinky.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory

import typingsSlinky.jupyterlabCoreutils.tokensMod.IStateDB
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating a file browser using a file browser factory.
  *
  * #### Notes
  * In future versions of JupyterLab, some of these options may disappear,
  * which is a backward-incompatible API change and will necessitate a new
  * version release. This is because in future versions, there will likely be
  * an application-wide notion of a singleton command registry and a singleton
  * state database.
  */
trait IOptions extends js.Object {
  /**
    * An optional `Contents.IDrive` name for the model.
    * If given, the model will prepend `driveName:` to
    * all paths used in file operations.
    */
  var driveName: js.UndefOr[String] = js.undefined
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  /**
    * The state database to use for saving file browser state and restoring it.
    *
    * #### Notes
    * Unless the value `null` is set for this option, the application state
    * database will be automatically passed in and used for state restoration.
    */
  var state: js.UndefOr[IStateDB[ReadonlyJSONValue] | Null] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    driveName: String = null,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    state: js.UndefOr[Null | IStateDB[ReadonlyJSONValue]] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (driveName != null) __obj.updateDynamic("driveName")(driveName.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

