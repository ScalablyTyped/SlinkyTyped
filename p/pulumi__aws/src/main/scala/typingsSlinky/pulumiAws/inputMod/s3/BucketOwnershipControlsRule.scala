package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketOwnershipControlsRule extends StObject {
  
  /**
    * Object ownership. Valid values: `BucketOwnerPreferred` or `ObjectWriter`
    */
  var objectOwnership: Input[String] = js.native
}
object BucketOwnershipControlsRule {
  
  @scala.inline
  def apply(objectOwnership: Input[String]): BucketOwnershipControlsRule = {
    val __obj = js.Dynamic.literal(objectOwnership = objectOwnership.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketOwnershipControlsRule]
  }
  
  @scala.inline
  implicit class BucketOwnershipControlsRuleMutableBuilder[Self <: BucketOwnershipControlsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectOwnership(value: Input[String]): Self = StObject.set(x, "objectOwnership", value.asInstanceOf[js.Any])
  }
}
