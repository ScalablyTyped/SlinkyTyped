package typingsSlinky.angularlocalstorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValue extends js.Object {
  var defaultValue: js.UndefOr[js.Any] = js.native
  var storeName: js.UndefOr[String] = js.native
}

object DefaultValue {
  @scala.inline
  def apply(): DefaultValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultValue]
  }
  @scala.inline
  implicit class DefaultValueOps[Self <: DefaultValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(js.undefined)
        ret
    }
  }
  
}

