package typingsSlinky.amapJsApiPlaceSearch.anon

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEvent
import typingsSlinky.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typingsSlinky.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastSelected extends js.Object {
  var lastSelected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) | Null = js.native
  var selected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) = js.native
}

object LastSelected {
  @scala.inline
  def apply(
    selected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ])
  ): LastSelected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSelected]
  }
  @scala.inline
  implicit class LastSelectedOps[Self <: LastSelected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelected(
      value: SelectChangeEventData | (SelectChangeEvent[
          markerClick | listElementClick, 
          (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelected(
      value: SelectChangeEventData | (SelectChangeEvent[
          markerClick | listElementClick, 
          (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelected")(null)
        ret
    }
  }
  
}

