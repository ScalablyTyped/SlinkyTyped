package typingsSlinky.reactCssModules.mod

import typingsSlinky.reactCssModules.reactCssModulesStrings.`throw`
import typingsSlinky.reactCssModules.reactCssModulesStrings.ignore
import typingsSlinky.reactCssModules.reactCssModulesStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOptions extends js.Object {
  var allowMultiple: js.UndefOr[Boolean] = js.native
  var handleNotFoundStyleName: js.UndefOr[`throw` | log | ignore] = js.native
}

object TypeOptions {
  @scala.inline
  def apply(): TypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeOptions]
  }
  @scala.inline
  implicit class TypeOptionsOps[Self <: TypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleNotFoundStyleName(value: `throw` | log | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNotFoundStyleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleNotFoundStyleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNotFoundStyleName")(js.undefined)
        ret
    }
  }
  
}

