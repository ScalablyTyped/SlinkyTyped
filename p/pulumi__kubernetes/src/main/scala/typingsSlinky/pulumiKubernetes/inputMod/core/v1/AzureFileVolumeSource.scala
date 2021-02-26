package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
@js.native
trait AzureFileVolumeSource extends StObject {
  
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: Input[String] = js.native
  
  /**
    * Share Name
    */
  var shareName: Input[String] = js.native
}
object AzureFileVolumeSource {
  
  @scala.inline
  def apply(secretName: Input[String], shareName: Input[String]): AzureFileVolumeSource = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFileVolumeSource]
  }
  
  @scala.inline
  implicit class AzureFileVolumeSourceMutableBuilder[Self <: AzureFileVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecretName(value: Input[String]): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareName(value: Input[String]): Self = StObject.set(x, "shareName", value.asInstanceOf[js.Any])
  }
}
