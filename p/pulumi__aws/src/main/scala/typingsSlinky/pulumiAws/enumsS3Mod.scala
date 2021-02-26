package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.pulumiAwsStrings.`authenticated-read`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`aws-exec-read`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`log-delivery-write`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`private`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`public-read-write`
import typingsSlinky.pulumiAws.pulumiAwsStrings.`public-read`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumsS3Mod {
  
  /* Inlined { readonly Private :'private',  readonly PublicRead :'public-read',  readonly PublicReadWrite :'public-read-write',  readonly AwsExecRead :'aws-exec-read',  readonly AuthenticatedRead :'authenticated-read',  readonly BucketOwnerRead :'bucket-owner-read',  readonly BucketOwnerFullControl :'bucket-owner-full-control',  readonly LogDeliveryWrite :'log-delivery-write'}[keyof { readonly Private :'private',  readonly PublicRead :'public-read',  readonly PublicReadWrite :'public-read-write',  readonly AwsExecRead :'aws-exec-read',  readonly AuthenticatedRead :'authenticated-read',  readonly BucketOwnerRead :'bucket-owner-read',  readonly BucketOwnerFullControl :'bucket-owner-full-control',  readonly LogDeliveryWrite :'log-delivery-write'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`bucket-owner-full-control`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`public-read-write`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`log-delivery-write`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`private`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`authenticated-read`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`aws-exec-read`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`bucket-owner-read`
    - typingsSlinky.pulumiAws.pulumiAwsStrings.`public-read`
  */
  trait CannedAcl extends StObject
  object CannedAcl {
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.AuthenticatedRead")
    @js.native
    val AuthenticatedRead: `authenticated-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.AwsExecRead")
    @js.native
    val AwsExecRead: `aws-exec-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.BucketOwnerFullControl")
    @js.native
    val BucketOwnerFullControl: `bucket-owner-full-control` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.BucketOwnerRead")
    @js.native
    val BucketOwnerRead: `bucket-owner-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.LogDeliveryWrite")
    @js.native
    val LogDeliveryWrite: `log-delivery-write` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.Private")
    @js.native
    val Private: `private` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.PublicRead")
    @js.native
    val PublicRead: `public-read` = js.native
    
    @JSImport("@pulumi/aws/types/enums/s3", "CannedAcl.PublicReadWrite")
    @js.native
    val PublicReadWrite: `public-read-write` = js.native
  }
}
