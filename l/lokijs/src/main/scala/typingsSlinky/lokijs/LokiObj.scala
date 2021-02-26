package typingsSlinky.lokijs

import typingsSlinky.lokijs.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LokiObj extends StObject {
  
  @JSName("$loki")
  var $loki: Double = js.native
  
  var meta: Created = js.native
}
object LokiObj {
  
  @scala.inline
  def apply($loki: Double, meta: Created): LokiObj = {
    val __obj = js.Dynamic.literal($loki = $loki.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiObj]
  }
  
  @scala.inline
  implicit class LokiObjMutableBuilder[Self <: LokiObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$loki(value: Double): Self = StObject.set(x, "$loki", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: Created): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
