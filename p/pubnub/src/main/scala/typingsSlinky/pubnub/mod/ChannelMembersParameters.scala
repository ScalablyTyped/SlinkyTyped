package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.ChannelFields
import typingsSlinky.pubnub.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMembersParameters extends StObject {
  
  var filter: js.UndefOr[String] = js.native
  
  var include: js.UndefOr[ChannelFields] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Next] = js.native
  
  var sort: js.UndefOr[js.Object] = js.native
}
object ChannelMembersParameters {
  
  @scala.inline
  def apply(): ChannelMembersParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembersParameters]
  }
  
  @scala.inline
  implicit class ChannelMembersParametersMutableBuilder[Self <: ChannelMembersParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setInclude(value: ChannelFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPage(value: Next): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSort(value: js.Object): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
