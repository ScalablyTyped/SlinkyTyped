package typingsSlinky.fluent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluentBundleContructorOptions extends js.Object {
  var functions: js.UndefOr[js.Object] = js.native
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var useIsolating: js.UndefOr[Boolean] = js.native
}

object FluentBundleContructorOptions {
  @scala.inline
  def apply(): FluentBundleContructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FluentBundleContructorOptions]
  }
  @scala.inline
  implicit class FluentBundleContructorOptionsOps[Self <: FluentBundleContructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIsolating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIsolating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIsolating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIsolating")(js.undefined)
        ret
    }
  }
  
}

