package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Items to re-adjudicate
  */
@js.native
trait ProcessRequestItem extends BackboneElement {
  /**
    * Contains extended information for property 'sequenceLinkId'.
    */
  var _sequenceLinkId: js.UndefOr[Element] = js.native
  /**
    * Service instance
    */
  var sequenceLinkId: integer = js.native
}

object ProcessRequestItem {
  @scala.inline
  def apply(sequenceLinkId: integer): ProcessRequestItem = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRequestItem]
  }
  @scala.inline
  implicit class ProcessRequestItemOps[Self <: ProcessRequestItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSequenceLinkId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sequenceLinkId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequenceLinkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sequenceLinkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequenceLinkId")(js.undefined)
        ret
    }
  }
  
}

