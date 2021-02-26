package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /** Set to true and filter your report by `FILTER_INSERTION_ORDER` or `FILTER_LINE_ITEM` to include data for audience lists specifically targeted by those items. */
  var includeOnlyTargetedUserLists: js.UndefOr[Boolean] = js.native
  
  /** Options that contain Path Filters and Custom Channel Groupings. */
  var pathQueryOptions: js.UndefOr[PathQueryOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeOnlyTargetedUserLists(value: Boolean): Self = StObject.set(x, "includeOnlyTargetedUserLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOnlyTargetedUserListsUndefined: Self = StObject.set(x, "includeOnlyTargetedUserLists", js.undefined)
    
    @scala.inline
    def setPathQueryOptions(value: PathQueryOptions): Self = StObject.set(x, "pathQueryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathQueryOptionsUndefined: Self = StObject.set(x, "pathQueryOptions", js.undefined)
  }
}
