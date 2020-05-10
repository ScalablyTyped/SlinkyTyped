package typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternetExplorerMediumBeforeNavigate2Parameter extends js.Object {
  var Cancel: Boolean = js.native
  val Flags: js.Any = js.native
  val Headers: js.Any = js.native
  val PostData: js.Any = js.native
  val TargetFrameName: js.Any = js.native
  val URL: js.Any = js.native
  val pDisp: js.Any = js.native
}

object InternetExplorerMediumBeforeNavigate2Parameter {
  @scala.inline
  def apply(
    Cancel: Boolean,
    Flags: js.Any,
    Headers: js.Any,
    PostData: js.Any,
    TargetFrameName: js.Any,
    URL: js.Any,
    pDisp: js.Any
  ): InternetExplorerMediumBeforeNavigate2Parameter = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], TargetFrameName = TargetFrameName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternetExplorerMediumBeforeNavigate2Parameter]
  }
  @scala.inline
  implicit class InternetExplorerMediumBeforeNavigate2ParameterOps[Self <: InternetExplorerMediumBeforeNavigate2Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
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
    def withTargetFrameName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetFrameName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDisp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDisp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

