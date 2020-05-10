package typingsSlinky.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunAutomationDetails extends js.Object {
  /**
    * A stable, unique identifier for the equivalence class of runs to which this object's containing run object
    * belongs in the form of a GUID.
    */
  var correlationGuid: js.UndefOr[String] = js.native
  /**
    * A description of the identity and role played within the engineering system by this object's containing run
    * object.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * A stable, unique identifer for this object's containing run object in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * A hierarchical string that uniquely identifies this object's containing run object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the run automation details.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object RunAutomationDetails {
  @scala.inline
  def apply(): RunAutomationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunAutomationDetails]
  }
  @scala.inline
  implicit class RunAutomationDetailsOps[Self <: RunAutomationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelationGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

