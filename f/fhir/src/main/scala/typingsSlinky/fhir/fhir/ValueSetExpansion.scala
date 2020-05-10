package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used when the value set is "expanded"
  */
@js.native
trait ValueSetExpansion extends BackboneElement {
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.native
  /**
    * Codes in the value set
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.native
  /**
    * Uniquely identifies this expansion
    */
  var identifier: uri = js.native
  /**
    * Offset at which this resource starts
    */
  var offset: js.UndefOr[integer] = js.native
  /**
    * Parameter that controlled the expansion process
    */
  var parameter: js.UndefOr[js.Array[ValueSetExpansionParameter]] = js.native
  /**
    * Time ValueSet expansion happened
    */
  var timestamp: dateTime = js.native
  /**
    * Total number of codes in the expansion
    */
  var total: js.UndefOr[integer] = js.native
}

object ValueSetExpansion {
  @scala.inline
  def apply(identifier: uri, timestamp: dateTime): ValueSetExpansion = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansion]
  }
  @scala.inline
  implicit class ValueSetExpansionOps[Self <: ValueSetExpansion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_identifier(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_identifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_identifier")(js.undefined)
        ret
    }
    @scala.inline
    def with_offset(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_offset")(js.undefined)
        ret
    }
    @scala.inline
    def with_timestamp(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def with_total(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_total")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: js.Array[ValueSetExpansionContains]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withParameter(value: js.Array[ValueSetExpansionParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

