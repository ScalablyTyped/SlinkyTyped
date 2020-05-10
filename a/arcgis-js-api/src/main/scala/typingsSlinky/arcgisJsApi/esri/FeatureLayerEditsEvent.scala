package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerEditsEvent extends js.Object {
  var addedAttachments: js.Array[FeatureEditResult] = js.native
  var addedFeatures: js.Array[FeatureEditResult] = js.native
  var deletedAttachments: js.Array[FeatureEditResult] = js.native
  var deletedFeatures: js.Array[FeatureEditResult] = js.native
  var updatedAttachments: js.Array[FeatureEditResult] = js.native
  var updatedFeatures: js.Array[FeatureEditResult] = js.native
}

object FeatureLayerEditsEvent {
  @scala.inline
  def apply(
    addedAttachments: js.Array[FeatureEditResult],
    addedFeatures: js.Array[FeatureEditResult],
    deletedAttachments: js.Array[FeatureEditResult],
    deletedFeatures: js.Array[FeatureEditResult],
    updatedAttachments: js.Array[FeatureEditResult],
    updatedFeatures: js.Array[FeatureEditResult]
  ): FeatureLayerEditsEvent = {
    val __obj = js.Dynamic.literal(addedAttachments = addedAttachments.asInstanceOf[js.Any], addedFeatures = addedFeatures.asInstanceOf[js.Any], deletedAttachments = deletedAttachments.asInstanceOf[js.Any], deletedFeatures = deletedFeatures.asInstanceOf[js.Any], updatedAttachments = updatedAttachments.asInstanceOf[js.Any], updatedFeatures = updatedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerEditsEvent]
  }
  @scala.inline
  implicit class FeatureLayerEditsEventOps[Self <: FeatureLayerEditsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedAttachments(value: js.Array[FeatureEditResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddedFeatures(value: js.Array[FeatureEditResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedAttachments(value: js.Array[FeatureEditResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedFeatures(value: js.Array[FeatureEditResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAttachments(value: js.Array[FeatureEditResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedFeatures(value: js.Array[FeatureEditResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedFeatures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

