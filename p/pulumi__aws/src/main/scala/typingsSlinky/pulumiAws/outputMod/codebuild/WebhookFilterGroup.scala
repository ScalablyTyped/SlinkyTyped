package typingsSlinky.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookFilterGroup extends StObject {
  
  /**
    * A webhook filter for the group. Filter blocks are documented below.
    */
  var filters: js.UndefOr[js.Array[WebhookFilterGroupFilter]] = js.native
}
object WebhookFilterGroup {
  
  @scala.inline
  def apply(): WebhookFilterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookFilterGroup]
  }
  
  @scala.inline
  implicit class WebhookFilterGroupMutableBuilder[Self <: WebhookFilterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[WebhookFilterGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: WebhookFilterGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
  }
}
