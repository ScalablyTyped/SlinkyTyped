package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes information about a regional election administrative area.
  */
@js.native
trait SchemaAdministrationRegion extends js.Object {
  /**
    * The election administration body for this area.
    */
  var electionAdministrationBody: js.UndefOr[SchemaAdministrativeBody] = js.native
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The city or county that provides election information for this voter.
    * This object can have the same elements as state.
    */
  var local_jurisdiction: js.UndefOr[SchemaAdministrationRegion] = js.native
  /**
    * The name of the jurisdiction.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A list of sources for this area. If multiple sources are listed the data
    * has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}

object SchemaAdministrationRegion {
  @scala.inline
  def apply(): SchemaAdministrationRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrationRegion]
  }
  @scala.inline
  implicit class SchemaAdministrationRegionOps[Self <: SchemaAdministrationRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElectionAdministrationBody(value: SchemaAdministrativeBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionAdministrationBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectionAdministrationBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electionAdministrationBody")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocal_jurisdiction(value: SchemaAdministrationRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_jurisdiction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocal_jurisdiction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local_jurisdiction")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[SchemaSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
  }
  
}

