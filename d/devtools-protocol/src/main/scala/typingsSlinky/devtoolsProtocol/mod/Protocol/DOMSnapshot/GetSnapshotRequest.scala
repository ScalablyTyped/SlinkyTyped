package typingsSlinky.devtoolsProtocol.mod.Protocol.DOMSnapshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnapshotRequest extends StObject {
  
  /**
    * Whitelist of computed styles to return.
    */
  var computedStyleWhitelist: js.Array[String] = js.native
  
  /**
    * Whether or not to retrieve details of DOM listeners (default false).
    */
  var includeEventListeners: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to determine and include the paint order index of LayoutTreeNodes (default false).
    */
  var includePaintOrder: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to include UA shadow tree in the snapshot (default false).
    */
  var includeUserAgentShadowTree: js.UndefOr[Boolean] = js.native
}
object GetSnapshotRequest {
  
  @scala.inline
  def apply(computedStyleWhitelist: js.Array[String]): GetSnapshotRequest = {
    val __obj = js.Dynamic.literal(computedStyleWhitelist = computedStyleWhitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotRequest]
  }
  
  @scala.inline
  implicit class GetSnapshotRequestMutableBuilder[Self <: GetSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedStyleWhitelist(value: js.Array[String]): Self = StObject.set(x, "computedStyleWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedStyleWhitelistVarargs(value: String*): Self = StObject.set(x, "computedStyleWhitelist", js.Array(value :_*))
    
    @scala.inline
    def setIncludeEventListeners(value: Boolean): Self = StObject.set(x, "includeEventListeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEventListenersUndefined: Self = StObject.set(x, "includeEventListeners", js.undefined)
    
    @scala.inline
    def setIncludePaintOrder(value: Boolean): Self = StObject.set(x, "includePaintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePaintOrderUndefined: Self = StObject.set(x, "includePaintOrder", js.undefined)
    
    @scala.inline
    def setIncludeUserAgentShadowTree(value: Boolean): Self = StObject.set(x, "includeUserAgentShadowTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUserAgentShadowTreeUndefined: Self = StObject.set(x, "includeUserAgentShadowTree", js.undefined)
  }
}
