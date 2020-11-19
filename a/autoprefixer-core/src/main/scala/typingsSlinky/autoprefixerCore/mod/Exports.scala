package typingsSlinky.autoprefixerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exports extends js.Object {
  
  def apply(config: Config): Processor = js.native
  
  def info(): String = js.native
  
  var postcss: js.Any = js.native
  
  def process(css: String): Result = js.native
  def process(css: String, opts: Options): Result = js.native
}
