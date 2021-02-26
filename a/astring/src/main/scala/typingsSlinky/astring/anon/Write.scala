package typingsSlinky.astring.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Write extends StObject {
  
  def write(s: String): Unit = js.native
}
object Write {
  
  @scala.inline
  def apply(write: String => Unit): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
  
  @scala.inline
  implicit class WriteMutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
