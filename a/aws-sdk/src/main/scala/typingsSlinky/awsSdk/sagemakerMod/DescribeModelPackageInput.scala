package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeModelPackageInput extends StObject {
  
  /**
    * The name of the model package to describe.
    */
  var ModelPackageName: VersionedArnOrName = js.native
}
object DescribeModelPackageInput {
  
  @scala.inline
  def apply(ModelPackageName: VersionedArnOrName): DescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageInput]
  }
  
  @scala.inline
  implicit class DescribeModelPackageInputMutableBuilder[Self <: DescribeModelPackageInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelPackageName(value: VersionedArnOrName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
  }
}
