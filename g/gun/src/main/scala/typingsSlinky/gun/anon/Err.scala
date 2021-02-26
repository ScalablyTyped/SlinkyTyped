package typingsSlinky.gun.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Err extends StObject {
  
  var err: js.Error = js.native
  
  var ok: js.Any = js.native
}
object Err {
  
  @scala.inline
  def apply(err: js.Error, ok: js.Any): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  
  @scala.inline
  implicit class ErrMutableBuilder[Self <: Err] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: js.Any): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
