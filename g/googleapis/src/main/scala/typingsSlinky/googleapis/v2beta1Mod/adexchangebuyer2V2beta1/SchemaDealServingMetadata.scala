package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message captures metadata about the serving status of a deal.
  */
@js.native
trait SchemaDealServingMetadata extends js.Object {
  /**
    * Tracks which parties (if any) have paused a deal. @OutputOnly
    */
  var dealPauseStatus: js.UndefOr[SchemaDealPauseStatus] = js.native
}

object SchemaDealServingMetadata {
  @scala.inline
  def apply(): SchemaDealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealServingMetadata]
  }
  @scala.inline
  implicit class SchemaDealServingMetadataOps[Self <: SchemaDealServingMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDealPauseStatus(value: SchemaDealPauseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealPauseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealPauseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealPauseStatus")(js.undefined)
        ret
    }
  }
  
}

