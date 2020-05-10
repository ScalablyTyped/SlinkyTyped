package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter that describes what data should be selected or returned from a
  * request.
  */
@js.native
trait SchemaDataFilter extends js.Object {
  /**
    * Selects data that matches the specified A1 range.
    */
  var a1Range: js.UndefOr[String] = js.native
  /**
    * Selects data associated with the developer metadata matching the criteria
    * described by this DeveloperMetadataLookup.
    */
  var developerMetadataLookup: js.UndefOr[SchemaDeveloperMetadataLookup] = js.native
  /**
    * Selects data that matches the range described by the GridRange.
    */
  var gridRange: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaDataFilter {
  @scala.inline
  def apply(): SchemaDataFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataFilter]
  }
  @scala.inline
  implicit class SchemaDataFilterOps[Self <: SchemaDataFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA1Range(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a1Range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA1Range: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a1Range")(js.undefined)
        ret
    }
    @scala.inline
    def withDeveloperMetadataLookup(value: SchemaDeveloperMetadataLookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadataLookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadataLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadataLookup")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRange(value: SchemaGridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRange")(js.undefined)
        ret
    }
  }
  
}

