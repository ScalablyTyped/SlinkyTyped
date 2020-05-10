package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExitFullScreenEventUIParam extends js.Object {
  /**
  	 * Get the url of the playing video.
  	 */
  var source: js.UndefOr[String] = js.native
}

object ExitFullScreenEventUIParam {
  @scala.inline
  def apply(): ExitFullScreenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitFullScreenEventUIParam]
  }
  @scala.inline
  implicit class ExitFullScreenEventUIParamOps[Self <: ExitFullScreenEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

