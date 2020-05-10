package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Finding and its StateChange.
  */
@js.native
trait SchemaListFindingsResult extends js.Object {
  /**
    * Finding matching the search request.
    */
  var finding: js.UndefOr[SchemaFinding] = js.native
  /**
    * State change of the finding between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}

object SchemaListFindingsResult {
  @scala.inline
  def apply(): SchemaListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResult]
  }
  @scala.inline
  implicit class SchemaListFindingsResultOps[Self <: SchemaListFindingsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinding(value: SchemaFinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finding")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChange")(js.undefined)
        ret
    }
  }
  
}

