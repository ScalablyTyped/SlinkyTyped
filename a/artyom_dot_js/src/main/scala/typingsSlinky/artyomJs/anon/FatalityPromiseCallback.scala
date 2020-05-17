package typingsSlinky.artyomJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FatalityPromiseCallback extends js.Object {
  var fatalityPromiseCallback: js.UndefOr[js.Any] = js.native
  var lastSay: js.UndefOr[js.Any] = js.native
  var redirectRecognizedTextOutput: js.UndefOr[js.Any] = js.native
  var remoteProcessorHandler: js.UndefOr[js.Any] = js.native
}

object FatalityPromiseCallback {
  @scala.inline
  def apply(): FatalityPromiseCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FatalityPromiseCallback]
  }
  @scala.inline
  implicit class FatalityPromiseCallbackOps[Self <: FatalityPromiseCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFatalityPromiseCallback(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalityPromiseCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFatalityPromiseCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatalityPromiseCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSay")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectRecognizedTextOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectRecognizedTextOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectRecognizedTextOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectRecognizedTextOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteProcessorHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteProcessorHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteProcessorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteProcessorHandler")(js.undefined)
        ret
    }
  }
  
}

