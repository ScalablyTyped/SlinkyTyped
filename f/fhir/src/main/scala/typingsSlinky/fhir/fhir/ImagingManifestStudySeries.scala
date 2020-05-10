package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Series identity of the selected instances
  */
@js.native
trait ImagingManifestStudySeries extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The selected instance
    */
  var instance: js.Array[ImagingManifestStudySeriesInstance] = js.native
  /**
    * Series instance UID
    */
  var uid: oid = js.native
}

object ImagingManifestStudySeries {
  @scala.inline
  def apply(instance: js.Array[ImagingManifestStudySeriesInstance], uid: oid): ImagingManifestStudySeries = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeries]
  }
  @scala.inline
  implicit class ImagingManifestStudySeriesOps[Self <: ImagingManifestStudySeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: js.Array[ImagingManifestStudySeriesInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
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
  }
  
}

