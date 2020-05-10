package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectParametersProperties extends js.Object {
  /**
    * The input geometries to project.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSR)
    */
  var outSR: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * Indicates whether to transform forward or not. The forward or reverse direction of transformation is implied in the name of the transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward)
    */
  var transformForward: js.UndefOr[Boolean] = js.native
  /**
    * The well-known id {wkid:number} or well-known text {wkt:string} of the datum transformation to be applied to the projected geometries. See [Datum transformations](https://developers.arcgis.com/rest/services-reference/datum-transformations.htm) for a list of valid datum transformations that may be used here.  If a transformation is specified, a value must also be specified in the [transformForward](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformForward) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ProjectParameters.html#transformation)
    */
  var transformation: js.UndefOr[ProjectParametersTransformation] = js.native
}

object ProjectParametersProperties {
  @scala.inline
  def apply(): ProjectParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectParametersProperties]
  }
  @scala.inline
  implicit class ProjectParametersPropertiesOps[Self <: ProjectParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometries(value: js.Array[GeometryProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(js.undefined)
        ret
    }
    @scala.inline
    def withOutSR(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutSR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSR")(js.undefined)
        ret
    }
    @scala.inline
    def withOutSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformForward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformForward")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformation(value: ProjectParametersTransformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformation")(js.undefined)
        ret
    }
  }
  
}

