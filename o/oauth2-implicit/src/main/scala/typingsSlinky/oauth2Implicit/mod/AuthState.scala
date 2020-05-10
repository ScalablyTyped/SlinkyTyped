package typingsSlinky.oauth2Implicit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthState
  extends /* key */ StringDictionary[js.Any] {
  var originalUrl: String = js.native
}

object AuthState {
  @scala.inline
  def apply(originalUrl: String): AuthState = {
    val __obj = js.Dynamic.literal(originalUrl = originalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthState]
  }
  @scala.inline
  implicit class AuthStateOps[Self <: AuthState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

