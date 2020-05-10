package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratifier criteria for the measure
  */
@js.native
trait MeasureGroupStratifier extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * How the measure should be stratified
    */
  var criteria: js.UndefOr[String] = js.native
  /**
    * The identifier for the stratifier used to coordinate the reported data back to this stratifier
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Path to the stratifier
    */
  var path: js.UndefOr[String] = js.native
}

object MeasureGroupStratifier {
  @scala.inline
  def apply(): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
  @scala.inline
  implicit class MeasureGroupStratifierOps[Self <: MeasureGroupStratifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_criteria(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_criteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_criteria")(js.undefined)
        ret
    }
    @scala.inline
    def with_path(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(js.undefined)
        ret
    }
    @scala.inline
    def withCriteria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

