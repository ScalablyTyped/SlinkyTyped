package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderOptions extends js.Object {
  var dont_print: js.UndefOr[Boolean] = js.native
  var enable_reqheaders_recording: js.UndefOr[Boolean] = js.native
  var logging: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  var output_objects: js.UndefOr[Boolean] = js.native
  var use_separator: js.UndefOr[Boolean] = js.native
}

object RecorderOptions {
  @scala.inline
  def apply(): RecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderOptions]
  }
  @scala.inline
  implicit class RecorderOptionsOps[Self <: RecorderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDont_print(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dont_print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDont_print: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dont_print")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable_reqheaders_recording(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_reqheaders_recording")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable_reqheaders_recording: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable_reqheaders_recording")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: /* content */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput_objects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput_objects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_objects")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_separator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_separator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_separator")(js.undefined)
        ret
    }
  }
  
}

