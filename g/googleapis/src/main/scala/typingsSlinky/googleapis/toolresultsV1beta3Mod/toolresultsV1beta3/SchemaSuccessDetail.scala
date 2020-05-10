package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSuccessDetail extends js.Object {
  /**
    * If a native process other than the app crashed.
    */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
}

object SchemaSuccessDetail {
  @scala.inline
  def apply(): SchemaSuccessDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuccessDetail]
  }
  @scala.inline
  implicit class SchemaSuccessDetailOps[Self <: SchemaSuccessDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtherNativeCrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherNativeCrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherNativeCrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherNativeCrash")(js.undefined)
        ret
    }
  }
  
}

