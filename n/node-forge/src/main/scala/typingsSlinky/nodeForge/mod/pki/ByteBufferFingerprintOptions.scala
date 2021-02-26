package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.nodeForgeStrings.RSAPublicKey
import typingsSlinky.nodeForge.nodeForgeStrings.SubjectPublicKeyInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteBufferFingerprintOptions extends StObject {
  
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.native
  
  /**
    * @description The type of fingerprint. If not specified, defaults to 'RSAPublicKey'
    */
  var `type`: js.UndefOr[SubjectPublicKeyInfo | RSAPublicKey] = js.native
}
object ByteBufferFingerprintOptions {
  
  @scala.inline
  def apply(): ByteBufferFingerprintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteBufferFingerprintOptions]
  }
  
  @scala.inline
  implicit class ByteBufferFingerprintOptionsMutableBuilder[Self <: ByteBufferFingerprintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setMd(value: MessageDigest): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    @scala.inline
    def setType(value: SubjectPublicKeyInfo | RSAPublicKey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
