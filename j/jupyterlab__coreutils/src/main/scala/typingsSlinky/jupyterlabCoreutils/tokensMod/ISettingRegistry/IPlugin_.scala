package typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The settings for a specific plugin.
  */
@js.native
trait IPlugin_ extends JSONObject {
  /**
    * The collection of values for a specified plugin.
    */
  var data: ISettingBundle = js.native
  /**
    * The name of the plugin.
    */
  var id: String = js.native
  /**
    * The raw user settings data as a string containing JSON with comments.
    */
  var raw: String = js.native
  /**
    * The JSON schema for the plugin.
    */
  var schema: ISchema = js.native
  /**
    * The published version of the NPM package containing the plugin.
    */
  var version: String = js.native
}

object IPlugin_ {
  @scala.inline
  def apply(data: ISettingBundle, id: String, raw: String, schema: ISchema, version: String): IPlugin_ = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin_]
  }
  @scala.inline
  implicit class IPlugin_Ops[Self <: IPlugin_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ISettingBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: ISchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

