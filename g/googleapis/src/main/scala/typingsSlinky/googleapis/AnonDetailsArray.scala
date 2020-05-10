package typingsSlinky.googleapis

import typingsSlinky.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetailsArray extends js.Object {
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV4]] = js.native
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
}

object AnonDetailsArray {
  @scala.inline
  def apply(): AnonDetailsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetailsArray]
  }
  @scala.inline
  implicit class AnonDetailsArrayOps[Self <: AnonDetailsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Array[SchemaPagespeedApiFormatStringV4]): Self = {
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
    def withResult(value: SchemaPagespeedApiFormatStringV4): Self = {
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
  }
  
}

