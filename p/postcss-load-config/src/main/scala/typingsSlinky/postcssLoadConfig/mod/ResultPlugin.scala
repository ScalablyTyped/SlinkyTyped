package typingsSlinky.postcssLoadConfig.mod

import typingsSlinky.postcss.mod.Processor
import typingsSlinky.std.Plugin
import typingsSlinky.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Result of postcssrc is a Promise containing the filename plus the options
// and plugins that are ready to pass on to postcss.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Plugin
  - typingsSlinky.std.Transformer[js.Any, js.Any]
  - typingsSlinky.postcss.mod.Processor
*/
trait ResultPlugin extends js.Object

object ResultPlugin {
  @scala.inline
  implicit def apply(value: Plugin): ResultPlugin = value.asInstanceOf[ResultPlugin]
  @scala.inline
  implicit def apply(value: Processor): ResultPlugin = value.asInstanceOf[ResultPlugin]
  @scala.inline
  implicit def apply(value: Transformer[js.Any, js.Any]): ResultPlugin = value.asInstanceOf[ResultPlugin]
}

