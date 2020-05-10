package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventPeriodUpdate extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventPeriodUpdate.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time period being covered by this update.
    */
  var timePeriod: js.UndefOr[SchemaEventPeriodRange] = js.native
  /**
    * The updates being made for this time period.
    */
  var updates: js.UndefOr[js.Array[SchemaEventUpdateRequest]] = js.native
}

object SchemaEventPeriodUpdate {
  @scala.inline
  def apply(): SchemaEventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventPeriodUpdate]
  }
  @scala.inline
  implicit class SchemaEventPeriodUpdateOps[Self <: SchemaEventPeriodUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTimePeriod(value: SchemaEventPeriodRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdates(value: js.Array[SchemaEventUpdateRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(js.undefined)
        ret
    }
  }
  
}

