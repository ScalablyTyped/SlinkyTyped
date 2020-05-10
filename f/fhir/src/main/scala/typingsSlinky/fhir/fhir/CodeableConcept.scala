package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Concept - reference to a terminology or just  text
  */
@js.native
trait CodeableConcept extends Element {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Code defined by a terminology system
    */
  var coding: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Plain text representation of the concept
    */
  var text: js.UndefOr[String] = js.native
}

object CodeableConcept {
  @scala.inline
  def apply(): CodeableConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeableConcept]
  }
  @scala.inline
  implicit class CodeableConceptOps[Self <: CodeableConcept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def withCoding(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coding")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

