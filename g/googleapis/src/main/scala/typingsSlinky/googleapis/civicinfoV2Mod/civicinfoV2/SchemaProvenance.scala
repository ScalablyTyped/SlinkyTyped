package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProvenance extends js.Object {
  var collidedSegmentSource: js.UndefOr[SchemaStreetSegmentList] = js.native
  var ctclContestUuid: js.UndefOr[String] = js.native
  var ctclOfficeUuid: js.UndefOr[String] = js.native
  var datasetId: js.UndefOr[String] = js.native
  var precinctId: js.UndefOr[String] = js.native
  var precinctSplitId: js.UndefOr[String] = js.native
  var tsStreetSegmentId: js.UndefOr[String] = js.native
  var vip5PrecinctId: js.UndefOr[String] = js.native
  var vip5StreetSegmentId: js.UndefOr[String] = js.native
  var vipStreetSegmentId: js.UndefOr[String] = js.native
}

object SchemaProvenance {
  @scala.inline
  def apply(): SchemaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvenance]
  }
  @scala.inline
  implicit class SchemaProvenanceOps[Self <: SchemaProvenance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollidedSegmentSource(value: SchemaStreetSegmentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collidedSegmentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollidedSegmentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collidedSegmentSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCtclContestUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctclContestUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtclContestUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctclContestUuid")(js.undefined)
        ret
    }
    @scala.inline
    def withCtclOfficeUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctclOfficeUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtclOfficeUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctclOfficeUuid")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecinctId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecinctId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecinctSplitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctSplitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecinctSplitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctSplitId")(js.undefined)
        ret
    }
    @scala.inline
    def withTsStreetSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsStreetSegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsStreetSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsStreetSegmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withVip5PrecinctId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vip5PrecinctId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVip5PrecinctId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vip5PrecinctId")(js.undefined)
        ret
    }
    @scala.inline
    def withVip5StreetSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vip5StreetSegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVip5StreetSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vip5StreetSegmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withVipStreetSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vipStreetSegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVipStreetSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vipStreetSegmentId")(js.undefined)
        ret
    }
  }
  
}

