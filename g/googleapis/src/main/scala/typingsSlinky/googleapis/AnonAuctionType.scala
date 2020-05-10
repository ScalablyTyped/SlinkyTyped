package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuctionType extends js.Object {
  var auctionType: js.UndefOr[js.Array[String]] = js.native
  var contextType: js.UndefOr[String] = js.native
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.native
  var platform: js.UndefOr[js.Array[String]] = js.native
}

object AnonAuctionType {
  @scala.inline
  def apply(): AnonAuctionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAuctionType]
  }
  @scala.inline
  implicit class AnonAuctionTypeOps[Self <: AnonAuctionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuctionType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuctionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auctionType")(js.undefined)
        ret
    }
    @scala.inline
    def withContextType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextType")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoCriteriaId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoCriteriaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
  }
  
}

