package typingsSlinky.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dataset extends StObject {
  
  /**
    * The ID of the AWS account that owns the dataset.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.databrewMod.AccountId] = js.native
  
  /**
    * The date and time that the dataset was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier (the user name) of the user who created the dataset.
    */
  var CreatedBy: js.UndefOr[typingsSlinky.awsSdk.databrewMod.CreatedBy] = js.native
  
  /**
    * Options that define how DataBrew interprets the data in the dataset.
    */
  var FormatOptions: js.UndefOr[typingsSlinky.awsSdk.databrewMod.FormatOptions] = js.native
  
  /**
    * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon S3.
    */
  var Input: typingsSlinky.awsSdk.databrewMod.Input = js.native
  
  /**
    * The identifier (the user name) of the user who last modified the dataset.
    */
  var LastModifiedBy: js.UndefOr[typingsSlinky.awsSdk.databrewMod.LastModifiedBy] = js.native
  
  /**
    * The last modification date and time of the dataset.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The unique name of the dataset.
    */
  var Name: DatasetName = js.native
  
  /**
    * The unique Amazon Resource Name (ARN) for the dataset.
    */
  var ResourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog.
    */
  var Source: js.UndefOr[typingsSlinky.awsSdk.databrewMod.Source] = js.native
  
  /**
    * Metadata tags that have been applied to the dataset.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object Dataset {
  
  @scala.inline
  def apply(Input: Input, Name: DatasetName): Dataset = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
  
  @scala.inline
  implicit class DatasetMutableBuilder[Self <: Dataset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
