package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  /**
    * The keys that are included in this group.
    */
  var Keys: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Keys] = js.native
  
  /**
    * The metrics that are included in this group.
    */
  var Metrics: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Metrics] = js.native
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: Keys): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Key*): Self = StObject.set(x, "Keys", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
  }
}
