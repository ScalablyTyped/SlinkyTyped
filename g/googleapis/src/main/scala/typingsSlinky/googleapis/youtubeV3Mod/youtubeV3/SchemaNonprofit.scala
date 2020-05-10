package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Nonprofit information.
  */
@js.native
trait SchemaNonprofit extends js.Object {
  /**
    * Id of the nonprofit.
    */
  var nonprofitId: js.UndefOr[SchemaNonprofitId] = js.native
  /**
    * Legal name of the nonprofit.
    */
  var nonprofitLegalName: js.UndefOr[String] = js.native
}

object SchemaNonprofit {
  @scala.inline
  def apply(): SchemaNonprofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonprofit]
  }
  @scala.inline
  implicit class SchemaNonprofitOps[Self <: SchemaNonprofit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonprofitId(value: SchemaNonprofitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonprofitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitId")(js.undefined)
        ret
    }
    @scala.inline
    def withNonprofitLegalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitLegalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonprofitLegalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofitLegalName")(js.undefined)
        ret
    }
  }
  
}

