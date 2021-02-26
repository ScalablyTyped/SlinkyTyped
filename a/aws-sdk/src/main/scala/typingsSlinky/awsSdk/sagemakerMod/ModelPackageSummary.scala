package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelPackageSummary extends StObject {
  
  /**
    * A timestamp that shows when the model package was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typingsSlinky.awsSdk.sagemakerMod.ModelPackageArn = js.native
  
  /**
    * A brief description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  
  /**
    * The name of the model package.
    */
  var ModelPackageName: EntityName = js.native
  
  /**
    * The overall status of the model package.
    */
  var ModelPackageStatus: typingsSlinky.awsSdk.sagemakerMod.ModelPackageStatus = js.native
}
object ModelPackageSummary {
  
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus
  ): ModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageSummary]
  }
  
  @scala.inline
  implicit class ModelPackageSummaryMutableBuilder[Self <: ModelPackageSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    @scala.inline
    def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
  }
}
