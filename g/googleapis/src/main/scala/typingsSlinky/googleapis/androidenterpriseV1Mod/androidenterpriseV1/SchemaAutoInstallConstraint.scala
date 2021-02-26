package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The auto-install constraint. Defines a set of restrictions for
  * installation. At least one of the fields must be set.
  */
@js.native
trait SchemaAutoInstallConstraint extends StObject {
  
  /**
    * Charging state constraint.
    */
  var chargingStateConstraint: js.UndefOr[String] = js.native
  
  /**
    * Device idle state constraint.
    */
  var deviceIdleStateConstraint: js.UndefOr[String] = js.native
  
  /**
    * Network type constraint.
    */
  var networkTypeConstraint: js.UndefOr[String] = js.native
}
object SchemaAutoInstallConstraint {
  
  @scala.inline
  def apply(): SchemaAutoInstallConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoInstallConstraint]
  }
  
  @scala.inline
  implicit class SchemaAutoInstallConstraintMutableBuilder[Self <: SchemaAutoInstallConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChargingStateConstraint(value: String): Self = StObject.set(x, "chargingStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargingStateConstraintUndefined: Self = StObject.set(x, "chargingStateConstraint", js.undefined)
    
    @scala.inline
    def setDeviceIdleStateConstraint(value: String): Self = StObject.set(x, "deviceIdleStateConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdleStateConstraintUndefined: Self = StObject.set(x, "deviceIdleStateConstraint", js.undefined)
    
    @scala.inline
    def setNetworkTypeConstraint(value: String): Self = StObject.set(x, "networkTypeConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeConstraintUndefined: Self = StObject.set(x, "networkTypeConstraint", js.undefined)
  }
}
