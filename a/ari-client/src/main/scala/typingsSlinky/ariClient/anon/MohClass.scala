package typingsSlinky.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MohClass extends StObject {
  
  var bridgeId: String = js.native
  
  var mohClass: js.UndefOr[String] = js.native
}
object MohClass {
  
  @scala.inline
  def apply(bridgeId: String): MohClass = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MohClass]
  }
  
  @scala.inline
  implicit class MohClassMutableBuilder[Self <: MohClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMohClass(value: String): Self = StObject.set(x, "mohClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMohClassUndefined: Self = StObject.set(x, "mohClass", js.undefined)
  }
}
