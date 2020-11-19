package typingsSlinky.ltx.parserMod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ltx/lib/Parser", "Parser")
@js.native
class Parser () extends EventEmitter {
  def this(options: ParserOptions) = this()
  
  def end(data: String): Unit = js.native
  
  def write(data: String): Unit = js.native
}
