package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Designations to be included
  */
@js.native
trait ExpansionProfileDesignationInclude extends BackboneElement {
  /**
    * The designation to be included
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationIncludeDesignation]] = js.native
}

object ExpansionProfileDesignationInclude {
  @scala.inline
  def apply(): ExpansionProfileDesignationInclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationInclude]
  }
  @scala.inline
  implicit class ExpansionProfileDesignationIncludeOps[Self <: ExpansionProfileDesignationInclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesignation(value: js.Array[ExpansionProfileDesignationIncludeDesignation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesignation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designation")(js.undefined)
        ret
    }
  }
  
}

