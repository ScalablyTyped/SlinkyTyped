package typingsSlinky.playable.anon

import typingsSlinky.playable.chomecastApiMockMod.CastContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstance extends StObject {
  
  def getInstance(): CastContext = js.native
}
object GetInstance {
  
  @scala.inline
  def apply(getInstance: () => CastContext): GetInstance = {
    val __obj = js.Dynamic.literal(getInstance = js.Any.fromFunction0(getInstance))
    __obj.asInstanceOf[GetInstance]
  }
  
  @scala.inline
  implicit class GetInstanceMutableBuilder[Self <: GetInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInstance(value: () => CastContext): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
  }
}
