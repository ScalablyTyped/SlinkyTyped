package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReshardingStatus extends StObject {
  
  /**
    * Represents the progress of an online resharding operation.
    */
  var SlotMigration: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.SlotMigration] = js.native
}
object ReshardingStatus {
  
  @scala.inline
  def apply(): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReshardingStatus]
  }
  
  @scala.inline
  implicit class ReshardingStatusMutableBuilder[Self <: ReshardingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlotMigration(value: SlotMigration): Self = StObject.set(x, "SlotMigration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMigrationUndefined: Self = StObject.set(x, "SlotMigration", js.undefined)
  }
}
