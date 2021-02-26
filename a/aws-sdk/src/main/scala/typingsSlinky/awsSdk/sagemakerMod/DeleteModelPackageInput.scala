package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteModelPackageInput extends StObject {
  
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ModelPackageName: VersionedArnOrName = js.native
}
object DeleteModelPackageInput {
  
  @scala.inline
  def apply(ModelPackageName: VersionedArnOrName): DeleteModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelPackageInput]
  }
  
  @scala.inline
  implicit class DeleteModelPackageInputMutableBuilder[Self <: DeleteModelPackageInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelPackageName(value: VersionedArnOrName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
  }
}
