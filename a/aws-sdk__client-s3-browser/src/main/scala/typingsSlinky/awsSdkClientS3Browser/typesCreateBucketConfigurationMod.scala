package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EU
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-northeast-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-south-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`ap-southeast-2`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`cn-north-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-central-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`eu-west-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`sa-east-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-1`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`us-west-2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBucketConfigurationMod {
  
  @js.native
  trait CreateBucketConfiguration extends StObject {
    
    /**
      * <p>Specifies the region where the bucket will be created. If you don't specify a region, the bucket will be created in US Standard.</p>
      */
    var LocationConstraint: js.UndefOr[
        EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ] = js.native
  }
  object CreateBucketConfiguration {
    
    @scala.inline
    def apply(): CreateBucketConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateBucketConfiguration]
    }
    
    @scala.inline
    implicit class CreateBucketConfigurationMutableBuilder[Self <: CreateBucketConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationConstraint(
        value: EU | `eu-west-1` | `us-west-1` | `us-west-2` | `ap-south-1` | `ap-southeast-1` | `ap-southeast-2` | `ap-northeast-1` | `sa-east-1` | `cn-north-1` | `eu-central-1` | String
      ): Self = StObject.set(x, "LocationConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationConstraintUndefined: Self = StObject.set(x, "LocationConstraint", js.undefined)
    }
  }
  
  type UnmarshalledCreateBucketConfiguration = CreateBucketConfiguration
}
