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
@js.native
trait IOptions extends js.Object {
  /**
    * An optional `Contents.IDrive` name for the model.
    * If given, the model will prepend `driveName:` to
    * all paths used in file operations.
    */
  var driveName: js.UndefOr[String] = js.native
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.native
  /**
    * The state database to use for saving file browser state and restoring it.
    *
    * #### Notes
    * Unless the value `null` is set for this option, the application state
    * database will be automatically passed in and used for state restoration.
    */
  var state: js.UndefOr[IStateDB[ReadonlyJSONValue] | Null] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveName")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: IStateDB[ReadonlyJSONValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(null)
        ret
    }
  }
  
}

