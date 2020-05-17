package typingsSlinky.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoredDisabled extends js.Object {
  var encode: js.UndefOr[Boolean] = js.native
  var ignoredDisabled: js.UndefOr[Boolean] = js.native
}

object IgnoredDisabled {
  @scala.inline
  def apply(): IgnoredDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoredDisabled]
  }
  @scala.inline
  implicit class IgnoredDisabledOps[Self <: IgnoredDisabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredDisabled")(js.undefined)
        ret
    }
  }
  
}

