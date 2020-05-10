package typingsSlinky.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flow extends js.Object {
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  def authorizeUrl(): String = js.native
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  def run(): Unit = js.native
}

object Flow {
  @scala.inline
  def apply(authorizeUrl: () => String, run: () => Unit): Flow = {
    val __obj = js.Dynamic.literal(authorizeUrl = js.Any.fromFunction0(authorizeUrl), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[Flow]
  }
  @scala.inline
  implicit class FlowOps[Self <: Flow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizeUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizeUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRun(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

