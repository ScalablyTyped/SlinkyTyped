package typingsSlinky.leafletEditable.mod

import typingsSlinky.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to L.Editable when instanciating.
  */
@js.native
trait EditOptions extends js.Object {
  /**
    * CSS class to be added to the map container while drawing.
    */
  var drawingCSSClass: js.UndefOr[String] = js.native
  /**
    * Layer used to store edit tools (vertex, line guide…).
    */
  var editLayer: js.UndefOr[
    LayerGroup_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
    ]
  ] = js.native
  /**
    * Default layer used to store drawn features (marker, polyline…).
    */
  var featuresLayer: js.UndefOr[LayerGroup_[Polyline | Polygon | Marker]] = js.native
  /**
    * Options to be passed to the line guides.
    */
  var lineGuideOptions: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used when creating a new Marker.
    */
  var markerClass: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used as Marker editor.
    */
  var markerEditorClass: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used as middle vertex, pulled by the user to create a new point in the middle of a path.
    */
  var middleMarkerClass: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used when creating a new Polygon.
    */
  var polygonClass: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used as Polygon editor.
    */
  var polygonEditorClass: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used when creating a new Polyline.
    */
  var polylineClass: js.UndefOr[js.Object] = js.native
  /**
    * Class to be used as Polyline editor.
    */
  var polylineEditorClass: js.UndefOr[js.Object] = js.native
  /**
    * Set this to true if you don't want middle markers.
    */
  var skipMiddleMarkers: js.UndefOr[Boolean] = js.native
  /**
    * Class to be used as vertex, for path editing.
    */
  var vertexMarkerClass: js.UndefOr[js.Object] = js.native
}

object EditOptions {
  @scala.inline
  def apply(): EditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditOptions]
  }
  @scala.inline
  implicit class EditOptionsOps[Self <: EditOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawingCSSClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingCSSClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawingCSSClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawingCSSClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEditLayer(
      value: LayerGroup_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withFeaturesLayer(value: LayerGroup_[Polyline | Polygon | Marker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuresLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeaturesLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featuresLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withLineGuideOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineGuideOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineGuideOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineGuideOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerEditorClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEditorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerEditorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerEditorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleMarkerClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleMarkerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleMarkerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleMarkerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonEditorClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonEditorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonEditorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonEditorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineEditorClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineEditorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineEditorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineEditorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipMiddleMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMiddleMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipMiddleMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMiddleMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexMarkerClass(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexMarkerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexMarkerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexMarkerClass")(js.undefined)
        ret
    }
  }
  
}

