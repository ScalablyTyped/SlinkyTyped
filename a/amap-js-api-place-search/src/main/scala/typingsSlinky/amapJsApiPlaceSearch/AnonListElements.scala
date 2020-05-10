package typingsSlinky.amapJsApiPlaceSearch

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsApi.AMap.Marker
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonListElements extends js.Object {
  var listElements: js.Array[HTMLElement] = js.native
  var markers: js.Array[Marker[_]] = js.native
  var result: js.Array[SelectChangeEventData] = js.native
}

object AnonListElements {
  @scala.inline
  def apply(
    listElements: js.Array[HTMLElement],
    markers: js.Array[Marker[_]],
    result: js.Array[SelectChangeEventData]
  ): AnonListElements = {
    val __obj = js.Dynamic.literal(listElements = listElements.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListElements]
  }
  @scala.inline
  implicit class AnonListElementsOps[Self <: AnonListElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListElements(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[Marker[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Array[SelectChangeEventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

