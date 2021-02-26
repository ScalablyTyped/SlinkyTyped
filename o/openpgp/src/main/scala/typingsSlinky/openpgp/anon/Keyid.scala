package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyid extends StObject {
  
  var keyid: typingsSlinky.openpgp.mod.`type`.keyid.Keyid = js.native
  
  var valid: Boolean = js.native
}
object Keyid {
  
  @scala.inline
  def apply(keyid: typingsSlinky.openpgp.mod.`type`.keyid.Keyid, valid: Boolean): Keyid = {
    val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
  
  @scala.inline
  implicit class KeyidMutableBuilder[Self <: Keyid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyid(value: typingsSlinky.openpgp.mod.`type`.keyid.Keyid): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
