package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relationship to another action
  */
@js.native
trait RequestGroupActionRelatedAction extends BackboneElement {
  /**
    * Contains extended information for property 'actionId'.
    */
  var _actionId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'relationship'.
    */
  var _relationship: js.UndefOr[Element] = js.native
  /**
    * What action this is related to
    */
  var actionId: id = js.native
  /**
    * Time offset for the relationship
    */
  var offsetDuration: js.UndefOr[Duration] = js.native
  /**
    * Time offset for the relationship
    */
  var offsetRange: js.UndefOr[Range] = js.native
  /**
    * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end | after-start | after | after-end
    */
  var relationship: code = js.native
}

object RequestGroupActionRelatedAction {
  @scala.inline
  def apply(actionId: id, relationship: code): RequestGroupActionRelatedAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestGroupActionRelatedAction]
  }
  @scala.inline
  implicit class RequestGroupActionRelatedActionOps[Self <: RequestGroupActionRelatedAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelationship(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_actionId(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_actionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_actionId")(js.undefined)
        ret
    }
    @scala.inline
    def with_relationship(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_relationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_relationship")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetRange")(js.undefined)
        ret
    }
  }
  
}

