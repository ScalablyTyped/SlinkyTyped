package typingsSlinky.reactVirtualized.anon

import typingsSlinky.reactVirtualized.esMasonryMod.resetParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reset extends StObject {
  
  def reset(params: resetParams): Unit = js.native
}
object Reset {
  
  @scala.inline
  def apply(reset: resetParams => Unit): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[Reset]
  }
  
  @scala.inline
  implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReset(value: resetParams => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
  }
}
