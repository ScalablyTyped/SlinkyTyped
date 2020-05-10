package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawProperties extends js.Object {
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html). An instance of the draw action is created when [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: js.UndefOr[DrawActionProperties] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the draw to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}

object DrawProperties {
  @scala.inline
  def apply(): DrawProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawProperties]
  }
  @scala.inline
  implicit class DrawPropertiesOps[Self <: DrawProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveAction(value: DrawActionProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAction")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

