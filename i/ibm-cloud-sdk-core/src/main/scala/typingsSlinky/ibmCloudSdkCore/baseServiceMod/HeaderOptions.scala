package typingsSlinky.ibmCloudSdkCore.baseServiceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderOptions
  extends /* key */ StringDictionary[js.Any] {
  var `X-Watson-Learning-Opt-Out`: js.UndefOr[Boolean] = js.native
}

object HeaderOptions {
  @scala.inline
  def apply(): HeaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderOptions]
  }
  @scala.inline
  implicit class HeaderOptionsOps[Self <: HeaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-Watson-Learning-Opt-Out`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-Watson-Learning-Opt-Out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-Watson-Learning-Opt-Out`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X-Watson-Learning-Opt-Out")(js.undefined)
        ret
    }
  }
  
}

