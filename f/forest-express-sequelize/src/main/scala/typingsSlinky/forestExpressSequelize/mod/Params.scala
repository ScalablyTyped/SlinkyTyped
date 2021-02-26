package typingsSlinky.forestExpressSequelize.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends StObject {
  
  var fields: StringDictionary[String] = js.native
  
  var filters: Filter | AggregatedFilters = js.native
  
  var page: Page = js.native
  
  var search: String = js.native
  
  var searchExtended: String = js.native
  
  var sort: String = js.native
  
  var timezone: String = js.native
}
object Params {
  
  @scala.inline
  def apply(
    fields: StringDictionary[String],
    filters: Filter | AggregatedFilters,
    page: Page,
    search: String,
    searchExtended: String,
    sort: String,
    timezone: String
  ): Params = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchExtended = searchExtended.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: Filter | AggregatedFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchExtended(value: String): Self = StObject.set(x, "searchExtended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
