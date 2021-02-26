package typingsSlinky.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode_ extends StObject {
  
  /**
    * Processes the data block at offset.
    *
    * @param words The data words to operate on.
    * @param offset The offset where the block starts.
    *
    * @example
    *
    *     mode.processBlock(data.words, offset);
    */
  def processBlock(words: js.Array[Double], offset: Double): Unit = js.native
}
object Mode_ {
  
  @scala.inline
  def apply(processBlock: (js.Array[Double], Double) => Unit): Mode_ = {
    val __obj = js.Dynamic.literal(processBlock = js.Any.fromFunction2(processBlock))
    __obj.asInstanceOf[Mode_]
  }
  
  @scala.inline
  implicit class Mode_MutableBuilder[Self <: Mode_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessBlock(value: (js.Array[Double], Double) => Unit): Self = StObject.set(x, "processBlock", js.Any.fromFunction2(value))
  }
}
