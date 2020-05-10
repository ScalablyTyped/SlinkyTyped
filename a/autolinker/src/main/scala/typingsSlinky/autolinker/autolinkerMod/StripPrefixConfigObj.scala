package typingsSlinky.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripPrefixConfigObj extends js.Object {
  var scheme: js.UndefOr[Boolean] = js.native
  var www: js.UndefOr[Boolean] = js.native
}

object StripPrefixConfigObj {
  @scala.inline
  def apply(): StripPrefixConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripPrefixConfigObj]
  }
  @scala.inline
  implicit class StripPrefixConfigObjOps[Self <: StripPrefixConfigObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withWww(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWww: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("www")(js.undefined)
        ret
    }
  }
  
}

