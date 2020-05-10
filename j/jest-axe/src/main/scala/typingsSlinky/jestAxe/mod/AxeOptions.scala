package typingsSlinky.jestAxe.mod

import typingsSlinky.axeCore.mod.RunOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxeOptions extends js.Object {
  var elementRef: js.UndefOr[Boolean] = js.native
  var iframes: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[js.Object] = js.native
  var runOnly: js.UndefOr[RunOnly] = js.native
  var selectors: js.UndefOr[Boolean] = js.native
}

object AxeOptions {
  @scala.inline
  def apply(): AxeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxeOptions]
  }
  @scala.inline
  implicit class AxeOptionsOps[Self <: AxeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementRef(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIframes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframes")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withRunOnly(value: RunOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
  }
  
}

