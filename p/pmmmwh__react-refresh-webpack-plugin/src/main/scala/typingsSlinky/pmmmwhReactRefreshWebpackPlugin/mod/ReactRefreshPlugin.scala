package typingsSlinky.pmmmwhReactRefreshWebpackPlugin.mod

import typingsSlinky.pmmmwhReactRefreshWebpackPlugin.typesMod.NormalizedPluginOptions
import typingsSlinky.pmmmwhReactRefreshWebpackPlugin.typesMod.ReactRefreshPluginOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pmmmwh/react-refresh-webpack-plugin", "ReactRefreshPlugin")
@js.native
/**
  * @param {import('./types').ReactRefreshPluginOptions} [options] Options for react-refresh-plugin.
  */
class ReactRefreshPlugin () extends js.Object {
  def this(options: ReactRefreshPluginOptions) = this()
  
  /**
    * Applies the plugin.
    * @param {import('webpack').Compiler} compiler A webpack compiler object.
    * @returns {void}
    */
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  ): Unit = js.native
  
  /**
    * @readonly
    * @type {import('./types').NormalizedPluginOptions}
    */
  val options: NormalizedPluginOptions = js.native
}
