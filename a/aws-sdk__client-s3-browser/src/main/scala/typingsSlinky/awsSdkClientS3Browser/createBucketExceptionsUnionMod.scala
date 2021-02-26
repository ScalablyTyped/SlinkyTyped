package typingsSlinky.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBucketExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists
    - typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
  */
  trait CreateBucketExceptionsUnion extends StObject
  object CreateBucketExceptionsUnion {
    
    @scala.inline
    def BucketAlreadyExists(name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyExists): typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists]
    }
    
    @scala.inline
    def BucketAlreadyOwnedByYou(name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou): typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou]
    }
  }
}
