package typingsSlinky.reactDashDevDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moduleScopePluginMod {
  import typingsSlinky.webpack.webpackMod.Plugin

  /**
    * This Webpack plugin ensures that relative imports from app's source
    * directories don't reach outside of it.
    */
  type ModuleScopePlugin = Plugin
}
