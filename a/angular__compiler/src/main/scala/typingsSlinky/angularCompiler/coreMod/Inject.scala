package typingsSlinky.angularCompiler.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inject extends StObject {
  
  var token: js.Any = js.native
}
object Inject {
  
  @scala.inline
  def apply(token: js.Any): Inject = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inject]
  }
  
  @scala.inline
  implicit class InjectMutableBuilder[Self <: Inject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
