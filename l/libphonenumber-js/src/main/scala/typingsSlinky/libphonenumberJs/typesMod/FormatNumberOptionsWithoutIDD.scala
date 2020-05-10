package typingsSlinky.libphonenumberJs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatNumberOptionsWithoutIDD extends js.Object {
  var formatExtension: js.UndefOr[FormatExtension] = js.native
  var v2: js.UndefOr[Boolean] = js.native
}

object FormatNumberOptionsWithoutIDD {
  @scala.inline
  def apply(): FormatNumberOptionsWithoutIDD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
  }
  @scala.inline
  implicit class FormatNumberOptionsWithoutIDDOps[Self <: FormatNumberOptionsWithoutIDD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatExtension(
      value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ Metadata) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtension")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFormatExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withV2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v2")(js.undefined)
        ret
    }
  }
  
}

