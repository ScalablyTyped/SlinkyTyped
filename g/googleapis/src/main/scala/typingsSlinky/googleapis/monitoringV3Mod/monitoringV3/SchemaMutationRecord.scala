package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a change made to a configuration.
  */
@js.native
trait SchemaMutationRecord extends js.Object {
  /**
    * When the change occurred.
    */
  var mutateTime: js.UndefOr[String] = js.native
  /**
    * The email address of the user making the change.
    */
  var mutatedBy: js.UndefOr[String] = js.native
}

object SchemaMutationRecord {
  @scala.inline
  def apply(): SchemaMutationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMutationRecord]
  }
  @scala.inline
  implicit class SchemaMutationRecordOps[Self <: SchemaMutationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMutateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMutatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatedBy")(js.undefined)
        ret
    }
  }
  
}

