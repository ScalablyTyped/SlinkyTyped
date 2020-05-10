package typingsSlinky.prettierPackageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var expandUsers: js.UndefOr[Boolean] = js.native
  var keyOrder: js.UndefOr[js.Array[String] | CompareFn] = js.native
  var tabWidth: js.UndefOr[Double] = js.native
  var useTabs: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandUsers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyOrderFunction2(value: (/* a */ String, /* b */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOrder")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKeyOrder(value: js.Array[String] | CompareFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTabWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTabs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTabs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTabs")(js.undefined)
        ret
    }
  }
  
}

