package typingsSlinky.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFaqResponse extends StObject {
  
  /**
    * The date and time that the FAQ was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The description of the FAQ that you provided when it was created.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Description] = js.native
  
  /**
    * If the Status field is FAILED, the ErrorMessage field contains the reason why the FAQ failed.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorMessage] = js.native
  
  /**
    * The file format used by the input files for the FAQ.
    */
  var FileFormat: js.UndefOr[FaqFileFormat] = js.native
  
  /**
    * The identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.native
  
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: js.UndefOr[typingsSlinky.awsSdk.kendraMod.IndexId] = js.native
  
  /**
    * The name that you gave the FAQ when it was created.
    */
  var Name: js.UndefOr[FaqName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for the FAQ.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.kendraMod.RoleArn] = js.native
  
  var S3Path: js.UndefOr[typingsSlinky.awsSdk.kendraMod.S3Path] = js.native
  
  /**
    * The status of the FAQ. It is ready to use when the status is ACTIVE.
    */
  var Status: js.UndefOr[FaqStatus] = js.native
  
  /**
    * The date and time that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.native
}
object DescribeFaqResponse {
  
  @scala.inline
  def apply(): DescribeFaqResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFaqResponse]
  }
  
  @scala.inline
  implicit class DescribeFaqResponseMutableBuilder[Self <: DescribeFaqResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setFileFormat(value: FaqFileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormatUndefined: Self = StObject.set(x, "FileFormat", js.undefined)
    
    @scala.inline
    def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    @scala.inline
    def setName(value: FaqName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setS3Path(value: S3Path): Self = StObject.set(x, "S3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PathUndefined: Self = StObject.set(x, "S3Path", js.undefined)
    
    @scala.inline
    def setStatus(value: FaqStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
