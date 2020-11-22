package typingsSlinky.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.akamaiEdgeworkers.anon.HighWaterMark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteLengthQueuingStrategy
  extends QueuingStrategy[js.typedarray.ArrayBufferView] {
  
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: js.typedarray.ArrayBufferView): Double = js.native
}
@JSImport("streams", "ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy extends Instantiable1[/* options */ HighWaterMark, ByteLengthQueuingStrategy]
