package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data controlled by this consent
  */
@js.native
trait ConsentData extends BackboneElement {
  /**
    * Contains extended information for property 'meaning'.
    */
  var _meaning: js.UndefOr[Element] = js.native
  /**
    * instance | related | dependents | authoredby
    */
  var meaning: code = js.native
  /**
    * The actual data reference
    */
  var reference: Reference = js.native
}

object ConsentData {
  @scala.inline
  def apply(meaning: code, reference: Reference): ConsentData = {
    val __obj = js.Dynamic.literal(meaning = meaning.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentData]
  }
  @scala.inline
  implicit class ConsentDataOps[Self <: ConsentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeaning(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meaning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_meaning(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_meaning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_meaning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_meaning")(js.undefined)
        ret
    }
  }
  
}

