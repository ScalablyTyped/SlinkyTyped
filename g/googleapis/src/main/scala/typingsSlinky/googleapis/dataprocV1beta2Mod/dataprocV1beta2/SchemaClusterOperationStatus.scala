package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of the operation.
  */
@js.native
trait SchemaClusterOperationStatus extends js.Object {
  /**
    * Output only. A message containing any operation metadata details.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * Output only. A message containing the detailed operation state.
    */
  var innerState: js.UndefOr[String] = js.native
  /**
    * Output only. A message containing the operation state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The time this state was entered.
    */
  var stateStartTime: js.UndefOr[String] = js.native
}

object SchemaClusterOperationStatus {
  @scala.inline
  def apply(): SchemaClusterOperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperationStatus]
  }
  @scala.inline
  implicit class SchemaClusterOperationStatusOps[Self <: SchemaClusterOperationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerState")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStartTime")(js.undefined)
        ret
    }
  }
  
}

