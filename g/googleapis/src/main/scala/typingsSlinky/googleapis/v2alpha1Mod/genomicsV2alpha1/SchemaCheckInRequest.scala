package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameters to the CheckIn method.
  */
@js.native
trait SchemaCheckInRequest extends js.Object {
  /**
    * The deadline has expired and the worker needs more time.
    */
  var deadlineExpired: js.UndefOr[SchemaEmpty] = js.native
  /**
    * A workflow specific event occurred.
    */
  var event: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The operation has finished with the given result.
    */
  var result: js.UndefOr[SchemaStatus] = js.native
  /**
    * Data about the status of the worker VM.
    */
  var workerStatus: js.UndefOr[SchemaWorkerStatus] = js.native
}

object SchemaCheckInRequest {
  @scala.inline
  def apply(): SchemaCheckInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckInRequest]
  }
  @scala.inline
  implicit class SchemaCheckInRequestOps[Self <: SchemaCheckInRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadlineExpired(value: SchemaEmpty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineExpired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadlineExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadlineExpired")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkerStatus(value: SchemaWorkerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkerStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerStatus")(js.undefined)
        ret
    }
  }
  
}

