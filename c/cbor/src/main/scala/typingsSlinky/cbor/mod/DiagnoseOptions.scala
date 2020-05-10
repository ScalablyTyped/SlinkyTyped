package typingsSlinky.cbor.mod

import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagnoseOptions extends TransformOptions {
  var max_depth: js.UndefOr[Double] = js.native
  var separator: js.UndefOr[String] = js.native
  var stream_errors: js.UndefOr[Boolean] = js.native
}

object DiagnoseOptions {
  @scala.inline
  def apply(): DiagnoseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnoseOptions]
  }
  @scala.inline
  implicit class DiagnoseOptionsOps[Self <: DiagnoseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_depth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_depth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_depth")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withStream_errors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream_errors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_errors")(js.undefined)
        ret
    }
  }
  
}

