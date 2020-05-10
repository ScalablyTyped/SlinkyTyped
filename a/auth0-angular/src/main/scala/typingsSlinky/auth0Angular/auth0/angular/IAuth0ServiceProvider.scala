package typingsSlinky.auth0Angular.auth0.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuth0ServiceProvider extends js.Object {
  /**
    * Configures the auth service
    * @param options Client options passed into Auth0
    */
  def init(options: IAuth0ClientOptions): Unit = js.native
  /**
    * @param event Name of the event to handle.
    * @param handler Event handler
    */
  def on(event: String, handler: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

object IAuth0ServiceProvider {
  @scala.inline
  def apply(init: IAuth0ClientOptions => Unit, on: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): IAuth0ServiceProvider = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[IAuth0ServiceProvider]
  }
  @scala.inline
  implicit class IAuth0ServiceProviderOps[Self <: IAuth0ServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: IAuth0ClientOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

