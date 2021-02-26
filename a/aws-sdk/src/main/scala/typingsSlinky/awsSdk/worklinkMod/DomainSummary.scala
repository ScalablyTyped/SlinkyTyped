package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainSummary extends StObject {
  
  /**
    * The time that the domain was created.
    */
  var CreatedTime: js.Date = js.native
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The name of the domain.
    */
  var DomainName: typingsSlinky.awsSdk.worklinkMod.DomainName = js.native
  
  /**
    * The status of the domain.
    */
  var DomainStatus: typingsSlinky.awsSdk.worklinkMod.DomainStatus = js.native
}
object DomainSummary {
  
  @scala.inline
  def apply(CreatedTime: js.Date, DomainName: DomainName, DomainStatus: DomainStatus): DomainSummary = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], DomainStatus = DomainStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
  
  @scala.inline
  implicit class DomainSummaryMutableBuilder[Self <: DomainSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
  }
}
