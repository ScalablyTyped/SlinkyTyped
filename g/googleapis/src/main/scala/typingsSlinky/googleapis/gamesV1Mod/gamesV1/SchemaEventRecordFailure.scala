package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event update failure resource.
  */
@js.native
trait SchemaEventRecordFailure extends js.Object {
  /**
    * The ID of the event that was not updated.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * The cause for the update failure. Possible values are:   -
    * &quot;NOT_FOUND&quot; - An attempt was made to set an event that was not
    * defined.  - &quot;INVALID_UPDATE_VALUE&quot; - An attempt was made to
    * increment an event by a non-positive value.
    */
  var failureCause: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventRecordFailure.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEventRecordFailure {
  @scala.inline
  def apply(): SchemaEventRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventRecordFailure]
  }
  @scala.inline
  implicit class SchemaEventRecordFailureOps[Self <: SchemaEventRecordFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureCause")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

