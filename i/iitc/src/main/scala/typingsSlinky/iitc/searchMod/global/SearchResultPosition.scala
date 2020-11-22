package typingsSlinky.iitc.searchMod.global

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.spectrum.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResultPosition
  extends SearchResultBase
     with SearchResult {
  
  var position: LatLngExpression = js.native
}
object SearchResultPosition {
  
  @scala.inline
  def apply(
    description: JQuery | js.Array[_] | Element | Text | String,
    position: LatLngExpression,
    title: String
  ): SearchResultPosition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultPosition]
  }
  
  @scala.inline
  implicit class SearchResultPositionOps[Self <: SearchResultPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPosition(value: LatLngExpression): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
