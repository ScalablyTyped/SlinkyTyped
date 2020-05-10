package typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel

import typingsSlinky.jupyterlabCoreutils.tokensMod.IStateDB
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a file browser.
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
    * An icon registry instance.
    */
  var iconRegistry: IIconRegistry = js.native
  /**
    * A document manager instance.
    */
  var manager: IDocumentManager = js.native
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.native
  /**
    * An optional state database. If provided, the model will restore which
    * folder was last opened when it is restored.
    */
  var state: js.UndefOr[IStateDB[ReadonlyJSONValue]] = js.native
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
  }
  
}

