package typingsSlinky.pulumiAws.inputMod.ssm

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationOutputLocation extends StObject {
  
  /**
    * The S3 bucket name.
    */
  var s3BucketName: Input[String] = js.native
  
  /**
    * The S3 bucket prefix. Results stored in the root if not configured.
    */
  var s3KeyPrefix: js.UndefOr[Input[String]] = js.native
}
object AssociationOutputLocation {
  
  @scala.inline
  def apply(s3BucketName: Input[String]): AssociationOutputLocation = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOutputLocation]
  }
  
  @scala.inline
  implicit class AssociationOutputLocationMutableBuilder[Self <: AssociationOutputLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
  }
}
