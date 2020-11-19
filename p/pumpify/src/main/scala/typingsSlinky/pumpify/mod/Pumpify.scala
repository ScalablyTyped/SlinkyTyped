package typingsSlinky.pumpify.mod

import typingsSlinky.duplexify.mod.Duplexify
import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pumpify extends Duplexify {
  
  def setPipeline(streams: Stream*): Unit = js.native
  def setPipeline(streams: js.Array[Stream]): Unit = js.native
}
