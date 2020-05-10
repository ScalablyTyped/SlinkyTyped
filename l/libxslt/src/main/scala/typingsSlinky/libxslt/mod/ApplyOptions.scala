package typingsSlinky.libxslt.mod

import typingsSlinky.libxslt.internalTypesMod.OutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyOptions extends js.Object {
  var noWrapParams: js.UndefOr[Boolean] = js.native
  var outputFormat: js.UndefOr[OutputFormat] = js.native
}

object ApplyOptions {
  @scala.inline
  def apply(): ApplyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyOptions]
  }
  @scala.inline
  implicit class ApplyOptionsOps[Self <: ApplyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoWrapParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrapParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWrapParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrapParams")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFormat(value: OutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
  }
  
}

