package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaExtensionInfo extends StObject {
  
  /**
    * A description of the schema extension.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  
  /**
    * The identifier of the directory to which the schema extension is applied.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The date and time that the schema extension was completed.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier of the schema extension.
    */
  var SchemaExtensionId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionId] = js.native
  
  /**
    * The current status of the schema extension.
    */
  var SchemaExtensionStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionStatus] = js.native
  
  /**
    * The reason for the SchemaExtensionStatus.
    */
  var SchemaExtensionStatusReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SchemaExtensionStatusReason] = js.native
  
  /**
    * The date and time that the schema extension started being applied to the directory.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
}
object SchemaExtensionInfo {
  
  @scala.inline
  def apply(): SchemaExtensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExtensionInfo]
  }
  
  @scala.inline
  implicit class SchemaExtensionInfoMutableBuilder[Self <: SchemaExtensionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setSchemaExtensionId(value: SchemaExtensionId): Self = StObject.set(x, "SchemaExtensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExtensionIdUndefined: Self = StObject.set(x, "SchemaExtensionId", js.undefined)
    
    @scala.inline
    def setSchemaExtensionStatus(value: SchemaExtensionStatus): Self = StObject.set(x, "SchemaExtensionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExtensionStatusReason(value: SchemaExtensionStatusReason): Self = StObject.set(x, "SchemaExtensionStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaExtensionStatusReasonUndefined: Self = StObject.set(x, "SchemaExtensionStatusReason", js.undefined)
    
    @scala.inline
    def setSchemaExtensionStatusUndefined: Self = StObject.set(x, "SchemaExtensionStatus", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
  }
}
