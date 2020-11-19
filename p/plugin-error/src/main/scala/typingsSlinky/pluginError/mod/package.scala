package typingsSlinky.pluginError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Abstraction for error handling for Vinyl plugins
    */
  type PluginError[T] = typingsSlinky.pluginError.mod.SimplePluginError with T
}
