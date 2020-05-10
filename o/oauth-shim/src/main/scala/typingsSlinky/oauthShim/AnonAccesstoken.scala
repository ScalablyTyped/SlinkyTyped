package typingsSlinky.oauthShim

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccesstoken
  extends /* key */ StringDictionary[js.Any] {
  var access_token: js.UndefOr[String] = js.native
}

object AnonAccesstoken {
  @scala.inline
  def apply(): AnonAccesstoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccesstoken]
  }
  @scala.inline
  implicit class AnonAccesstokenOps[Self <: AnonAccesstoken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(js.undefined)
        ret
    }
  }
  
}

