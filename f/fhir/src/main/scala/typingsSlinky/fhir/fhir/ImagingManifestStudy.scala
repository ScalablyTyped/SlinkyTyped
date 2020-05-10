package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Study identity of the selected instances
  */
@js.native
trait ImagingManifestStudy extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * Study access service endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reference to ImagingStudy
    */
  var imagingStudy: js.UndefOr[Reference] = js.native
  /**
    * Series identity of the selected instances
    */
  var series: js.Array[ImagingManifestStudySeries] = js.native
  /**
    * Study instance UID
    */
  var uid: oid = js.native
}

object ImagingManifestStudy {
  @scala.inline
  def apply(series: js.Array[ImagingManifestStudySeries], uid: oid): ImagingManifestStudy = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudy]
  }
  @scala.inline
  implicit class ImagingManifestStudyOps[Self <: ImagingManifestStudy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeries(value: js.Array[ImagingManifestStudySeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uid(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_uid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uid")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withImagingStudy(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagingStudy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagingStudy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagingStudy")(js.undefined)
        ret
    }
  }
  
}

