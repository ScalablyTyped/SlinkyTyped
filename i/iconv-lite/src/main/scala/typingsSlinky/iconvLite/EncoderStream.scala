package typingsSlinky.iconvLite

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncoderStream extends StObject {
  
  def end(): js.UndefOr[Buffer] = js.native
  
  def write(str: String): Buffer = js.native
}
object EncoderStream {
  
  @scala.inline
  def apply(end: () => js.UndefOr[Buffer], write: String => Buffer): EncoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EncoderStream]
  }
  
  @scala.inline
  implicit class EncoderStreamMutableBuilder[Self <: EncoderStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => js.UndefOr[Buffer]): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: String => Buffer): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
