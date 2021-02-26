package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Critical extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.native
  
  var issuer: StringParam = js.native
  
  var kid: HexParam = js.native
  
  var sn: HexParam = js.native
}
object Critical {
  
  @scala.inline
  def apply(issuer: StringParam, kid: HexParam, sn: HexParam): Critical = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  
  @scala.inline
  implicit class CriticalMutableBuilder[Self <: Critical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    @scala.inline
    def setIssuer(value: StringParam): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKid(value: HexParam): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSn(value: HexParam): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
  }
}
