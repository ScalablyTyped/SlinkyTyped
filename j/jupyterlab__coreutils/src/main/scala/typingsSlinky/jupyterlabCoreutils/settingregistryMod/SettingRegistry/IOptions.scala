package typingsSlinky.jupyterlabCoreutils.settingregistryMod.SettingRegistry

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IDataConnector
import typingsSlinky.jupyterlabCoreutils.settingregistryMod.ISchemaValidator
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a setting registry
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The data connector used by the setting registry.
    */
  var connector: IDataConnector[IPlugin, String, String] = js.native
  /**
    * Preloaded plugin data to populate the setting registry.
    */
  var plugins: js.UndefOr[js.Array[IPlugin]] = js.native
  /**
    * The number of milliseconds before a `load()` call to the registry waits
    * before timing out if it requires a transformation that has not been
    * registered.
    *
    * #### Notes
    * The default value is 7000.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * The validator used to enforce the settings JSON schema.
    */
  var validator: js.UndefOr[ISchemaValidator] = js.native
}

object IOptions {
  @scala.inline
  def apply(connector: IDataConnector[IPlugin, String, String]): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnector(value: IDataConnector[IPlugin, String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[IPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: ISchemaValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
  }
  
}

