package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AesGCM extends IParams {
  
  var aad: js.UndefOr[Buffer] = js.native
  
  var iv: js.UndefOr[Buffer] = js.native
  
  var ivBits: Double = js.native
  
  var tagBits: Double = js.native
}
object AesGCM {
  
  @scala.inline
  def apply(ivBits: Double, tagBits: Double, `type`: Double): AesGCM = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], tagBits = tagBits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGCM]
  }
  
  @scala.inline
  implicit class AesGCMMutableBuilder[Self <: AesGCM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAad(value: Buffer): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvBits(value: Double): Self = StObject.set(x, "ivBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    @scala.inline
    def setTagBits(value: Double): Self = StObject.set(x, "tagBits", value.asInstanceOf[js.Any])
  }
}
