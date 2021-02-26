package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Projection that may be projected along with other supported volume types
  */
@js.native
trait VolumeProjection extends StObject {
  
  /**
    * information about the configMap data to project
    */
  var configMap: js.UndefOr[Input[ConfigMapProjection]] = js.native
  
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIProjection]] = js.native
  
  /**
    * information about the secret data to project
    */
  var secret: js.UndefOr[Input[SecretProjection]] = js.native
  
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: js.UndefOr[Input[ServiceAccountTokenProjection]] = js.native
}
object VolumeProjection {
  
  @scala.inline
  def apply(): VolumeProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeProjection]
  }
  
  @scala.inline
  implicit class VolumeProjectionMutableBuilder[Self <: VolumeProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMap(value: Input[ConfigMapProjection]): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    @scala.inline
    def setDownwardAPI(value: Input[DownwardAPIProjection]): Self = StObject.set(x, "downwardAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownwardAPIUndefined: Self = StObject.set(x, "downwardAPI", js.undefined)
    
    @scala.inline
    def setSecret(value: Input[SecretProjection]): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setServiceAccountToken(value: Input[ServiceAccountTokenProjection]): Self = StObject.set(x, "serviceAccountToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountTokenUndefined: Self = StObject.set(x, "serviceAccountToken", js.undefined)
  }
}
