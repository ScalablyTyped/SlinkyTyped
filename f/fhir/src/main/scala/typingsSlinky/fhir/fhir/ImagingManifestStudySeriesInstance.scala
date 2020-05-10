package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The selected instance
  */
@js.native
trait ImagingManifestStudySeriesInstance extends BackboneElement {
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * SOP class UID of instance
    */
  var sopClass: oid = js.native
  /**
    * Selected instance UID
    */
  var uid: oid = js.native
}

object ImagingManifestStudySeriesInstance {
  @scala.inline
  def apply(sopClass: oid, uid: oid): ImagingManifestStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeriesInstance]
  }
  @scala.inline
  implicit class ImagingManifestStudySeriesInstanceOps[Self <: ImagingManifestStudySeriesInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSopClass(value: oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sopClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sopClass(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sopClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sopClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sopClass")(js.undefined)
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
  }
  
}

