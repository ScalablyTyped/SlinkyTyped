package typingsSlinky.postcssLoadConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Result of postcssrc is a Promise containing the filename plus the options
  // and plugins that are ready to pass on to postcss.
  type ResultPlugin = typingsSlinky.std.Plugin | (typingsSlinky.std.Transformer[js.Any, js.Any]) | typingsSlinky.postcss.mod.Processor
}
