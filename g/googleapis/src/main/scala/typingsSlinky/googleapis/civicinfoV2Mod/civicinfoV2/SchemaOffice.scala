package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an Office held by one or more Officials.
  */
@js.native
trait SchemaOffice extends js.Object {
  /**
    * The OCD ID of the division with which this office is associated.
    */
  var divisionId: js.UndefOr[String] = js.native
  /**
    * The levels of government of which this office is part. There may be more
    * than one in cases where a jurisdiction effectively acts at two different
    * levels of government; for example, the mayor of the District of Columbia
    * acts at &quot;locality&quot; level, but also effectively at both
    * &quot;administrative-area-2&quot; and &quot;administrative-area-1&quot;.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The human-readable name of the office.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of indices in the officials array of people who presently hold this
    * office.
    */
  var officialIndices: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The roles which this office fulfills. Roles are not meant to be
    * exhaustive, or to exactly specify the entire set of responsibilities of a
    * given office, but are meant to be rough categories that are useful for
    * general selection from or sorting of a list of offices.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of sources for this office. If multiple sources are listed, the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}

object SchemaOffice {
  @scala.inline
  def apply(): SchemaOffice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOffice]
  }
  @scala.inline
  implicit class SchemaOfficeOps[Self <: SchemaOffice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
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
    def withOfficialIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officialIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfficialIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("officialIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
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

