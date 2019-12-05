package typingsSlinky.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap

import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapNumbers.`0`
import typingsSlinky.amapDashJsDashApiDashIndoorDashMap.amapDashJsDashApiDashIndoorDashMapNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap.SearchSuccessResult
  - typings.amapDashJsDashApiDashIndoorDashMap.AMap.IndoorMap.SearchErrorResult
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  def SearchSuccessResult(building: Building, id: String, status: `0`): SearchResult = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  def SearchErrorResult(error: js.Error, id: String, status: `1`): SearchResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

