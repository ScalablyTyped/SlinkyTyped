package typingsSlinky.eyes.mod

import typingsSlinky.eyes.anon.All
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EyesOptions extends js.Object {
  /** Don't output functions at all */
  var hideFunctions: js.UndefOr[Boolean] = js.native
  /** Truncate output if longer */
  var maxLength: js.UndefOr[Double] = js.native
  /** Indent object literals */
  var pretty: js.UndefOr[Boolean] = js.native
  /** Stream to write to, or null */
  var stream: js.UndefOr[WritableStream] = js.native
  /** Styles applied to stdout */
  var styles: js.UndefOr[All] = js.native
}

object EyesOptions {
  @scala.inline
  def apply(): EyesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EyesOptions]
  }
  @scala.inline
  implicit class EyesOptionsOps[Self <: EyesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPretty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPretty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pretty")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: All): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

