package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionGroup extends StObject {
  
  /**
    * Indicates whether this option group can be applied to both VPC and non-VPC instances. The value true indicates the option group can be applied to both VPC and non-VPC instances. 
    */
  var AllowsVpcAndNonVpcInstanceMemberships: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the name of the engine that this option group can be applied to.
    */
  var EngineName: js.UndefOr[String] = js.native
  
  /**
    * Indicates the major engine version associated with this option group.
    */
  var MajorEngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the option group.
    */
  var OptionGroupArn: js.UndefOr[String] = js.native
  
  /**
    * Provides a description of the option group.
    */
  var OptionGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the option group.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * Indicates what options are available in the option group.
    */
  var Options: js.UndefOr[OptionsList] = js.native
  
  /**
    * If AllowsVpcAndNonVpcInstanceMemberships is false, this field is blank. If AllowsVpcAndNonVpcInstanceMemberships is true and this field is blank, then this option group can be applied to both VPC and non-VPC instances. If this field contains a value, then this option group can only be applied to instances that are in the VPC indicated by this field. 
    */
  var VpcId: js.UndefOr[String] = js.native
}
object OptionGroup {
  
  @scala.inline
  def apply(): OptionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroup]
  }
  
  @scala.inline
  implicit class OptionGroupMutableBuilder[Self <: OptionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsVpcAndNonVpcInstanceMemberships(value: Boolean): Self = StObject.set(x, "AllowsVpcAndNonVpcInstanceMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsVpcAndNonVpcInstanceMembershipsUndefined: Self = StObject.set(x, "AllowsVpcAndNonVpcInstanceMemberships", js.undefined)
    
    @scala.inline
    def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    @scala.inline
    def setMajorEngineVersion(value: String): Self = StObject.set(x, "MajorEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorEngineVersionUndefined: Self = StObject.set(x, "MajorEngineVersion", js.undefined)
    
    @scala.inline
    def setOptionGroupArn(value: String): Self = StObject.set(x, "OptionGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupArnUndefined: Self = StObject.set(x, "OptionGroupArn", js.undefined)
    
    @scala.inline
    def setOptionGroupDescription(value: String): Self = StObject.set(x, "OptionGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupDescriptionUndefined: Self = StObject.set(x, "OptionGroupDescription", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsList): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Option*): Self = StObject.set(x, "Options", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
