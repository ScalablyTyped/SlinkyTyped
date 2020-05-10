package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Designations to be excluded
  */
@js.native
trait ExpansionProfileDesignationExclude extends BackboneElement {
  /**
    * The designation to be excluded
    */
  var designation: js.UndefOr[js.Array[ExpansionProfileDesignationExcludeDesignation]] = js.native
}

object ExpansionProfileDesignationExclude {
  @scala.inline
  def apply(): ExpansionProfileDesignationExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionProfileDesignationExclude]
  }
  @scala.inline
  implicit class ExpansionProfileDesignationExcludeOps[Self <: ExpansionProfileDesignationExclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesignation(value: js.Array[ExpansionProfileDesignationExcludeDesignation]): Self = {
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

