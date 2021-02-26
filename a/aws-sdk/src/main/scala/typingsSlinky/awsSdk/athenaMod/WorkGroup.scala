package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkGroup extends StObject {
  
  /**
    * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for the workgroup; whether workgroup settings override client-side settings; and the data usage limits for the amount of data scanned per query or per workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var Configuration: js.UndefOr[WorkGroupConfiguration] = js.native
  
  /**
    * The date and time the workgroup was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.native
  
  /**
    * The workgroup name.
    */
  var Name: WorkGroupName = js.native
  
  /**
    * The state of the workgroup: ENABLED or DISABLED.
    */
  var State: js.UndefOr[WorkGroupState] = js.native
}
object WorkGroup {
  
  @scala.inline
  def apply(Name: WorkGroupName): WorkGroup = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkGroup]
  }
  
  @scala.inline
  implicit class WorkGroupMutableBuilder[Self <: WorkGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: WorkGroupConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: WorkGroupDescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: WorkGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: WorkGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
