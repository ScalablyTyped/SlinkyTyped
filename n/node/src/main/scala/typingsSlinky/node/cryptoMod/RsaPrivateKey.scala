package typingsSlinky.node.cryptoMod

import typingsSlinky.node.NodeJS.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaPrivateKey extends StObject {
  
  var key: KeyLike = js.native
  
  /**
    * @default 'sha1'
    */
  var oaepHash: js.UndefOr[String] = js.native
  
  var oaepLabel: js.UndefOr[TypedArray] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
}
object RsaPrivateKey {
  
  @scala.inline
  def apply(key: KeyLike): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPrivateKey]
  }
  
  @scala.inline
  implicit class RsaPrivateKeyMutableBuilder[Self <: RsaPrivateKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: KeyLike): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepHash(value: String): Self = StObject.set(x, "oaepHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepHashUndefined: Self = StObject.set(x, "oaepHash", js.undefined)
    
    @scala.inline
    def setOaepLabel(value: TypedArray): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelFloat32Array(value: js.typedarray.Float32Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelFloat64Array(value: js.typedarray.Float64Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelInt16Array(value: js.typedarray.Int16Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelInt32Array(value: js.typedarray.Int32Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelInt8Array(value: js.typedarray.Int8Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelUint16Array(value: js.typedarray.Uint16Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelUint32Array(value: js.typedarray.Uint32Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOaepLabelUndefined: Self = StObject.set(x, "oaepLabel", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}
