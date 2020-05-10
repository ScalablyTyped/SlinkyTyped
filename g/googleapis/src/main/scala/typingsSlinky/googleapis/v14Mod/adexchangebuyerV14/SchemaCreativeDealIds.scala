package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleapis.AnonArcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The external deal ids associated with a creative.
  */
@js.native
trait SchemaCreativeDealIds extends js.Object {
  /**
    * A list of external deal ids and ARC approval status.
    */
  var dealStatuses: js.UndefOr[js.Array[AnonArcStatus]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCreativeDealIds {
  @scala.inline
  def apply(): SchemaCreativeDealIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealIds]
  }
  @scala.inline
  implicit class SchemaCreativeDealIdsOps[Self <: SchemaCreativeDealIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDealStatuses(value: js.Array[AnonArcStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealStatuses")(js.undefined)
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

