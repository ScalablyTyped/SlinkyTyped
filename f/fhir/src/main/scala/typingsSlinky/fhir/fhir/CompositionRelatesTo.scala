package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationships to other compositions/documents
  */
@js.native
trait CompositionRelatesTo extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * replaces | transforms | signs | appends
    */
  var code: typingsSlinky.fhir.fhir.code = js.native
  /**
    * Target of the relationship
    */
  var targetIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Target of the relationship
    */
  var targetReference: js.UndefOr[Reference] = js.native
}

object CompositionRelatesTo {
  @scala.inline
  def apply(code: code): CompositionRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositionRelatesTo]
  }
  @scala.inline
  implicit class CompositionRelatesToOps[Self <: CompositionRelatesTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_code(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_code")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetReference")(js.undefined)
        ret
    }
  }
  
}

