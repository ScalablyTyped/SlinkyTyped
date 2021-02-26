package typingsSlinky.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordMeta extends StObject {
  
  var `@rid`: ORID = js.native
  
  var `@version`: Version = js.native
}
object RecordMeta {
  
  @scala.inline
  def apply(`@rid`: ORID, `@version`: Version): RecordMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@rid")(`@rid`.asInstanceOf[js.Any])
    __obj.updateDynamic("@version")(`@version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMeta]
  }
  
  @scala.inline
  implicit class RecordMetaMutableBuilder[Self <: RecordMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set@rid`(value: ORID): Self = StObject.set(x, "@rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@version`(value: Version): Self = StObject.set(x, "@version", value.asInstanceOf[js.Any])
  }
}
