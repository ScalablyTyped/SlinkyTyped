package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBInstanceMessage extends StObject {
  
  /**
    * Indicates that minor engine upgrades are applied automatically to the instance during the maintenance window. Default: true 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The Amazon EC2 Availability Zone that the instance is created in.  Default: A random, system-chosen Availability Zone in the endpoint's AWS Region. Example: us-east-1d 
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the cluster that the instance will belong to.
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    * The compute and memory capacity of the instance; for example, db.r5.large. 
    */
  var DBInstanceClass: String = js.native
  
  /**
    * The instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String = js.native
  
  /**
    * The name of the database engine to be used for this instance. Valid value: docdb 
    */
  var Engine: String = js.native
  
  /**
    * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The tags to be assigned to the instance. You can assign up to 10 tags to an instance.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateDBInstanceMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String, DBInstanceClass: String, DBInstanceIdentifier: String, Engine: String): CreateDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], DBInstanceClass = DBInstanceClass.asInstanceOf[js.Any], DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBInstanceMessage]
  }
  
  @scala.inline
  implicit class CreateDBInstanceMessageMutableBuilder[Self <: CreateDBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
