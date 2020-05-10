package typingsSlinky.fluentBundle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FluentBundleAddResourceOptions extends js.Object {
  var allowOverrides: js.UndefOr[Boolean] = js.native
}

object FluentBundleAddResourceOptions {
  @scala.inline
  def apply(): FluentBundleAddResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FluentBundleAddResourceOptions]
  }
  @scala.inline
  implicit class FluentBundleAddResourceOptionsOps[Self <: FluentBundleAddResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOverrides(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverrides")(js.undefined)
        ret
    }
  }
  
}

