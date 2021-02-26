package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.csr.CertificationRequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Csrinfo extends StObject {
  
  var csrinfo: CertificationRequestInfo = js.native
}
object Csrinfo {
  
  @scala.inline
  def apply(csrinfo: CertificationRequestInfo): Csrinfo = {
    val __obj = js.Dynamic.literal(csrinfo = csrinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csrinfo]
  }
  
  @scala.inline
  implicit class CsrinfoMutableBuilder[Self <: Csrinfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsrinfo(value: CertificationRequestInfo): Self = StObject.set(x, "csrinfo", value.asInstanceOf[js.Any])
  }
}
