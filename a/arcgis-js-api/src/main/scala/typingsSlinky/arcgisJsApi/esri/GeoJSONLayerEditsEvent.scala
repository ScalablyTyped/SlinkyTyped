package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONLayerEditsEvent extends js.Object {
  var addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures] = js.native
  var deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures] = js.native
  var updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures] = js.native
}

object GeoJSONLayerEditsEvent {
  @scala.inline
  def apply(
    addedFeatures: js.Array[GeoJSONLayerEditsEventAddedFeatures],
    deletedFeatures: js.Array[GeoJSONLayerEditsEventDeletedFeatures],
    updatedFeatures: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]
  ): GeoJSONLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEvent]
  }
  @scala.inline
  implicit class GeoJSONLayerEditsEventOps[Self <: GeoJSONLayerEditsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedFeatures(value: js.Array[GeoJSONLayerEditsEventAddedFeatures]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedFeatures(value: js.Array[GeoJSONLayerEditsEventDeletedFeatures]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedFeatures(value: js.Array[GeoJSONLayerEditsEventUpdatedFeatures]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

