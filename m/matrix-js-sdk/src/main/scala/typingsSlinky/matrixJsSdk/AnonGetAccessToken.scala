package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetAccessToken extends js.Object {
  def getAccessToken(): js.Promise[String] = js.native
}

object AnonGetAccessToken {
  @scala.inline
  def apply(getAccessToken: () => js.Promise[String]): AnonGetAccessToken = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
    __obj.asInstanceOf[AnonGetAccessToken]
  }
  @scala.inline
  implicit class AnonGetAccessTokenOps[Self <: AnonGetAccessToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccessToken(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessToken")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

