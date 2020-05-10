package typingsSlinky.googleapis

import typingsSlinky.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetailsResult extends js.Object {
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV2]] = js.native
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
}

object AnonDetailsResult {
  @scala.inline
  def apply(): AnonDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetailsResult]
  }
  @scala.inline
  implicit class AnonDetailsResultOps[Self <: AnonDetailsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Array[SchemaPagespeedApiFormatStringV2]): Self = {
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
    def withResult(value: SchemaPagespeedApiFormatStringV2): Self = {
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

