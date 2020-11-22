package typingsSlinky.iitc.searchMod.global

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.spectrum.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iitc.searchMod.global.SearchResultPosition
  - typingsSlinky.iitc.searchMod.global.SearchResultBounds
*/
trait SearchResult extends js.Object
object SearchResult {
  
  @scala.inline
  def SearchResultPosition(
    description: JQuery | js.Array[_] | Element | Text | String,
    position: LatLngExpression,
    title: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  def SearchResultBounds(
    bounds: LatLngBoundsExpression,
    description: JQuery | js.Array[_] | Element | Text | String,
    title: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}
