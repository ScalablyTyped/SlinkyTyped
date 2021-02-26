package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Err extends StObject {
  
  var err: js.Array[js.Error] | Null = js.native
  
  var keys: js.Array[typingsSlinky.openpgp.mod.key.Key] = js.native
}
object Err {
  
  @scala.inline
  def apply(keys: js.Array[typingsSlinky.openpgp.mod.key.Key]): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  
  @scala.inline
  implicit class ErrMutableBuilder[Self <: Err] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErr(value: js.Array[js.Error]): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrNull: Self = StObject.set(x, "err", null)
    
    @scala.inline
    def setErrVarargs(value: js.Error*): Self = StObject.set(x, "err", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[typingsSlinky.openpgp.mod.key.Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: typingsSlinky.openpgp.mod.key.Key*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
