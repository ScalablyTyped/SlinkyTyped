package typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebBrowserV1FrameNewWindowParameter extends js.Object {
  val Flags: Double = js.native
  val Headers: String = js.native
  val PostData: js.Any = js.native
  var Processed: Boolean = js.native
  val TargetFrameName: String = js.native
  val URL: String = js.native
}

object WebBrowserV1FrameNewWindowParameter {
  @scala.inline
  def apply(
    Flags: Double,
    Headers: String,
    PostData: js.Any,
    Processed: Boolean,
    TargetFrameName: String,
    URL: String
  ): WebBrowserV1FrameNewWindowParameter = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], Processed = Processed.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserV1FrameNewWindowParameter]
  }
  @scala.inline
  implicit class WebBrowserV1FrameNewWindowParameterOps[Self <: WebBrowserV1FrameNewWindowParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFrameName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFrameName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

