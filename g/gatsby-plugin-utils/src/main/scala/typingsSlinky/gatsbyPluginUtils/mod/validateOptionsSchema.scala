package typingsSlinky.gatsbyPluginUtils.mod

import typingsSlinky.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod.ObjectSchema
import typingsSlinky.gatsbyPluginUtils.typesMod.IPluginInfoOptions
import typingsSlinky.gatsbyPluginUtils.validateMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gatsby-plugin-utils/dist", "validateOptionsSchema")
@js.native
object validateOptionsSchema extends js.Object {
  
  def apply(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions): js.Promise[IPluginInfoOptions] = js.native
  def apply(pluginSchema: ObjectSchema[_], pluginOptions: IPluginInfoOptions, options: IOptions): js.Promise[IPluginInfoOptions] = js.native
}
