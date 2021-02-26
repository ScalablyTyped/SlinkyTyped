package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGrouping extends StObject {
  
  /** ChannelGrouping fallback name. */
  var fallbackName: js.UndefOr[String] = js.native
  
  /** The kind of resource this is, in this case dfareporting#channelGrouping. */
  var kind: js.UndefOr[String] = js.native
  
  /** ChannelGrouping name. */
  var name: js.UndefOr[String] = js.native
  
  /** The rules contained within this channel grouping. */
  var rules: js.UndefOr[js.Array[ChannelGroupingRule]] = js.native
}
object ChannelGrouping {
  
  @scala.inline
  def apply(): ChannelGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGrouping]
  }
  
  @scala.inline
  implicit class ChannelGroupingMutableBuilder[Self <: ChannelGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackName(value: String): Self = StObject.set(x, "fallbackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackNameUndefined: Self = StObject.set(x, "fallbackName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRules(value: js.Array[ChannelGroupingRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ChannelGroupingRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
