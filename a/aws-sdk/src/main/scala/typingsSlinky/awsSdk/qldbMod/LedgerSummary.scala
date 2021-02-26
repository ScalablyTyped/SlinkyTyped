package typingsSlinky.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerSummary extends StObject {
  
  /**
    * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the ledger.
    */
  var Name: js.UndefOr[LedgerName] = js.native
  
  /**
    * The current status of the ledger.
    */
  var State: js.UndefOr[LedgerState] = js.native
}
object LedgerSummary {
  
  @scala.inline
  def apply(): LedgerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LedgerSummary]
  }
  
  @scala.inline
  implicit class LedgerSummaryMutableBuilder[Self <: LedgerSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: LedgerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
