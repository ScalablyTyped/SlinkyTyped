package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventUpdateResponse extends js.Object {
  /**
    * Any batch-wide failures which occurred applying updates.
    */
  var batchFailures: js.UndefOr[js.Array[SchemaEventBatchRecordFailure]] = js.native
  /**
    * Any failures updating a particular event.
    */
  var eventFailures: js.UndefOr[js.Array[SchemaEventRecordFailure]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current status of any updated events
    */
  var playerEvents: js.UndefOr[js.Array[SchemaPlayerEvent]] = js.native
}

object SchemaEventUpdateResponse {
  @scala.inline
  def apply(): SchemaEventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventUpdateResponse]
  }
  @scala.inline
  implicit class SchemaEventUpdateResponseOps[Self <: SchemaEventUpdateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchFailures(value: js.Array[SchemaEventBatchRecordFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withEventFailures(value: js.Array[SchemaEventRecordFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventFailures")(js.undefined)
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
    @scala.inline
    def withPlayerEvents(value: js.Array[SchemaPlayerEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerEvents")(js.undefined)
        ret
    }
  }
  
}

