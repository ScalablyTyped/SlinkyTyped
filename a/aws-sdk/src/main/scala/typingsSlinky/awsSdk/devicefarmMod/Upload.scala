package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upload extends StObject {
  
  /**
    * The upload's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The upload's category. Allowed values include:   CURATED: An upload managed by AWS Device Farm.   PRIVATE: An upload managed by the AWS Device Farm customer.  
    */
  var category: js.UndefOr[UploadCategory] = js.native
  
  /**
    * The upload's content type (for example, application/octet-stream).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  
  /**
    * When the upload was created.
    */
  var created: js.UndefOr[js.Date] = js.native
  
  /**
    * A message about the upload's result.
    */
  var message: js.UndefOr[Message] = js.native
  
  /**
    * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
    */
  var metadata: js.UndefOr[Metadata] = js.native
  
  /**
    * The upload's file name.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The upload's status. Must be one of the following values:   FAILED   INITIALIZED   PROCESSING   SUCCEEDED  
    */
  var status: js.UndefOr[UploadStatus] = js.native
  
  /**
    * The upload's type. Must be one of the following values:   ANDROID_APP   IOS_APP   WEB_APP   EXTERNAL_DATA   APPIUM_JAVA_JUNIT_TEST_PACKAGE   APPIUM_JAVA_TESTNG_TEST_PACKAGE   APPIUM_PYTHON_TEST_PACKAGE   APPIUM_NODE_TEST_PACKAGE   APPIUM_RUBY_TEST_PACKAGE   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE   APPIUM_WEB_PYTHON_TEST_PACKAGE   APPIUM_WEB_NODE_TEST_PACKAGE   APPIUM_WEB_RUBY_TEST_PACKAGE   CALABASH_TEST_PACKAGE   INSTRUMENTATION_TEST_PACKAGE   UIAUTOMATION_TEST_PACKAGE   UIAUTOMATOR_TEST_PACKAGE   XCTEST_TEST_PACKAGE   XCTEST_UI_TEST_PACKAGE   APPIUM_JAVA_JUNIT_TEST_SPEC   APPIUM_JAVA_TESTNG_TEST_SPEC   APPIUM_PYTHON_TEST_SPEC   APPIUM_NODE_TEST_SPEC   APPIUM_RUBY_TEST_SPEC   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC   APPIUM_WEB_PYTHON_TEST_SPEC   APPIUM_WEB_NODE_TEST_SPEC   APPIUM_WEB_RUBY_TEST_SPEC   INSTRUMENTATION_TEST_SPEC   XCTEST_UI_TEST_SPEC  
    */
  var `type`: js.UndefOr[UploadType] = js.native
  
  /**
    * The presigned Amazon S3 URL that was used to store a file using a PUT request.
    */
  var url: js.UndefOr[URL] = js.native
}
object Upload {
  
  @scala.inline
  def apply(): Upload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upload]
  }
  
  @scala.inline
  implicit class UploadMutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCategory(value: UploadCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: UploadStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: UploadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
