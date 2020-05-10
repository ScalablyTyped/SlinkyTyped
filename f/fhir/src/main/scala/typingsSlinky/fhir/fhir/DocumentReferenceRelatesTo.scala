package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationships to other documents
  */
@js.native
trait DocumentReferenceRelatesTo extends BackboneElement {
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
  var target: Reference = js.native
}

object DocumentReferenceRelatesTo {
  @scala.inline
  def apply(code: code, target: Reference): DocumentReferenceRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceRelatesTo]
  }
  @scala.inline
  implicit class DocumentReferenceRelatesToOps[Self <: DocumentReferenceRelatesTo] (val x: Self) extends AnyVal {
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
    def withTarget(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
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
  }
  
}

