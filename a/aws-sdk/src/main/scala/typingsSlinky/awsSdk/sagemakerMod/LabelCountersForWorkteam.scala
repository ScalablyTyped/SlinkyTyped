package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCountersForWorkteam extends StObject {
  
  /**
    * The total number of data objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of data objects that need to be labeled by a human worker.
    */
  var PendingHuman: js.UndefOr[LabelCounter] = js.native
  
  /**
    * The total number of tasks in the labeling job.
    */
  var Total: js.UndefOr[LabelCounter] = js.native
}
object LabelCountersForWorkteam {
  
  @scala.inline
  def apply(): LabelCountersForWorkteam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelCountersForWorkteam]
  }
  
  @scala.inline
  implicit class LabelCountersForWorkteamMutableBuilder[Self <: LabelCountersForWorkteam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLabeled(value: LabelCounter): Self = StObject.set(x, "HumanLabeled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLabeledUndefined: Self = StObject.set(x, "HumanLabeled", js.undefined)
    
    @scala.inline
    def setPendingHuman(value: LabelCounter): Self = StObject.set(x, "PendingHuman", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingHumanUndefined: Self = StObject.set(x, "PendingHuman", js.undefined)
    
    @scala.inline
    def setTotal(value: LabelCounter): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
