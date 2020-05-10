package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Link to a resource that concerns the same actual person
  */
@js.native
trait PersonLink extends BackboneElement {
  /**
    * Contains extended information for property 'assurance'.
    */
  var _assurance: js.UndefOr[Element] = js.native
  /**
    * level1 | level2 | level3 | level4
    */
  var assurance: js.UndefOr[code] = js.native
  /**
    * The resource to which this actual person is associated
    */
  var target: Reference = js.native
}

object PersonLink {
  @scala.inline
  def apply(target: Reference): PersonLink = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonLink]
  }
  @scala.inline
  implicit class PersonLinkOps[Self <: PersonLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_assurance(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_assurance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_assurance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_assurance")(js.undefined)
        ret
    }
    @scala.inline
    def withAssurance(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assurance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssurance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assurance")(js.undefined)
        ret
    }
  }
  
}

