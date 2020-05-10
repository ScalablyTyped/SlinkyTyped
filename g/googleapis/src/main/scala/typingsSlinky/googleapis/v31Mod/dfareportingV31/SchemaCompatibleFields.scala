package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response to the queryCompatibleFields method.
  */
@js.native
trait SchemaCompatibleFields extends js.Object {
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[SchemaCrossDimensionReachReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;FLOODLIGHT&quot;.
    */
  var floodlightReportCompatibleFields: js.UndefOr[SchemaFloodlightReportCompatibleFields] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[SchemaPathToConversionReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;REACH&quot;.
    */
  var reachReportCompatibleFields: js.UndefOr[SchemaReachReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;STANDARD&quot;.
    */
  var reportCompatibleFields: js.UndefOr[SchemaReportCompatibleFields] = js.native
}

object SchemaCompatibleFields {
  @scala.inline
  def apply(): SchemaCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompatibleFields]
  }
  @scala.inline
  implicit class SchemaCompatibleFieldsOps[Self <: SchemaCompatibleFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossDimensionReachReportCompatibleFields(value: SchemaCrossDimensionReachReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDimensionReachReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossDimensionReachReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDimensionReachReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightReportCompatibleFields(value: SchemaFloodlightReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPathToConversionReportCompatibleFields(value: SchemaPathToConversionReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConversionReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathToConversionReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConversionReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withReachReportCompatibleFields(value: SchemaReachReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachReportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachReportCompatibleFields")(js.undefined)
        ret
    }
    @scala.inline
    def withReportCompatibleFields(value: SchemaReportCompatibleFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompatibleFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportCompatibleFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCompatibleFields")(js.undefined)
        ret
    }
  }
  
}

