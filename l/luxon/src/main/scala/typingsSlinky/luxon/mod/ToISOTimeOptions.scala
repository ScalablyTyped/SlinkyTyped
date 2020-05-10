package typingsSlinky.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToISOTimeOptions extends js.Object {
  var includeOffset: js.UndefOr[Boolean] = js.native
  var suppressMilliseconds: js.UndefOr[Boolean] = js.native
  var suppressSeconds: js.UndefOr[Boolean] = js.native
}

object ToISOTimeOptions {
  @scala.inline
  def apply(): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISOTimeOptions]
  }
  @scala.inline
  implicit class ToISOTimeOptionsOps[Self <: ToISOTimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeOffset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressMilliseconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSeconds")(js.undefined)
        ret
    }
  }
  
}

