package typingsSlinky.colorSupport.mod

import typingsSlinky.node.NodeJS.ProcessEnv
import typingsSlinky.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSupportOptions extends js.Object {
  var alwaysReturn: js.UndefOr[Boolean] = js.native
  var env: js.UndefOr[ProcessEnv] = js.native
  var ignoreCI: js.UndefOr[Boolean] = js.native
  var ignoreDumb: js.UndefOr[Boolean] = js.native
  var ignoreTTY: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[ColorSupportLevel] = js.native
  var stream: js.UndefOr[WriteStream] = js.native
  var term: js.UndefOr[String] = js.native
}

object ColorSupportOptions {
  @scala.inline
  def apply(): ColorSupportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSupportOptions]
  }
  @scala.inline
  implicit class ColorSupportOptionsOps[Self <: ColorSupportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysReturn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysReturn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysReturn")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: ProcessEnv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCI")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDumb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDumb")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTTY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTTY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTTY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTTY")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: ColorSupportLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WriteStream): Self = {
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
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(js.undefined)
        ret
    }
  }
  
}

