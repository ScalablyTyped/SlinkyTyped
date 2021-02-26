package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variant extends StObject {
  
  /** The device spec used to generate the APK. */
  var deviceSpec: js.UndefOr[DeviceSpec] = js.native
  
  /** Output only. The ID of a previously created system APK variant. */
  var variantId: js.UndefOr[Double] = js.native
}
object Variant {
  
  @scala.inline
  def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  @scala.inline
  implicit class VariantMutableBuilder[Self <: Variant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceSpec(value: DeviceSpec): Self = StObject.set(x, "deviceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceSpecUndefined: Self = StObject.set(x, "deviceSpec", js.undefined)
    
    @scala.inline
    def setVariantId(value: Double): Self = StObject.set(x, "variantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantIdUndefined: Self = StObject.set(x, "variantId", js.undefined)
  }
}
