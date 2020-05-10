package typingsSlinky.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderFilter extends js.Object {
  var nameContains: js.UndefOr[js.Any] = js.native
  var nameEquals: js.UndefOr[String] = js.native
  var namePrefix: js.UndefOr[String] = js.native
  var nameSuffix: js.UndefOr[String] = js.native
  var valueContains: js.UndefOr[js.Any] = js.native
  var valueEquals: js.UndefOr[String] = js.native
  var valuePrefix: js.UndefOr[String] = js.native
  var valueSuffix: js.UndefOr[String] = js.native
}

object HeaderFilter {
  @scala.inline
  def apply(): HeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFilter]
  }
  @scala.inline
  implicit class HeaderFilterOps[Self <: HeaderFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameContains(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameContains")(js.undefined)
        ret
    }
    @scala.inline
    def withNameEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNameSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withValueContains(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueContains")(js.undefined)
        ret
    }
    @scala.inline
    def withValueEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(js.undefined)
        ret
    }
  }
  
}

