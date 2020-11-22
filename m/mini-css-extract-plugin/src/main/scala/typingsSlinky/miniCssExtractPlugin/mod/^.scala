package typingsSlinky.miniCssExtractPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lightweight CSS extraction webpack plugin
  * This plugin extract CSS into separate files. It creates a CSS file per JS file which contains CSS. It supports On-Demand-Loading of CSS and SourceMaps.
  * Configuration Detail: https://github.com/webpack-contrib/mini-css-extract-plugin#configuration
  */
@JSImport("mini-css-extract-plugin", JSImport.Namespace)
@js.native
class ^ () extends MiniCssExtractPlugin {
  def this(options: PluginOptions) = this()
}
@JSImport("mini-css-extract-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Webpack loader used always at the end of loaders list
    */
  var loader: String = js.native
}
