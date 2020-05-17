package typingsSlinky.lernaGetPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalTsTypings extends js.Object {
  var additionalTsTypings: js.UndefOr[js.Array[String]] = js.native
}

object AdditionalTsTypings {
  @scala.inline
  def apply(): AdditionalTsTypings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalTsTypings]
  }
  @scala.inline
  implicit class AdditionalTsTypingsOps[Self <: AdditionalTsTypings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalTsTypings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTsTypings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalTsTypings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTsTypings")(js.undefined)
        ret
    }
  }
  
}

