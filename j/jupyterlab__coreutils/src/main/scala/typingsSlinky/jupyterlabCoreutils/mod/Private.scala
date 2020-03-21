package typingsSlinky.jupyterlabCoreutils.mod

import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IProperty
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISchema
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Private")
@js.native
object Private extends js.Object {
  /**
    * Returns an annotated (JSON with comments) version of a schema's defaults.
    */
  def annotatedDefaults(schema: ISchema, plugin: String): String = js.native
  /**
    * Returns an annotated (JSON with comments) version of a plugin's
    * setting data.
    */
  def annotatedPlugin(plugin: IPlugin, data: JSONObject): String = js.native
  /**
    * Create a fully extrapolated default value for a root key in a schema.
    */
  def reifyDefault(schema: IProperty): js.UndefOr[JSONValue] = js.native
  def reifyDefault(schema: IProperty, root: String): js.UndefOr[JSONValue] = js.native
}

