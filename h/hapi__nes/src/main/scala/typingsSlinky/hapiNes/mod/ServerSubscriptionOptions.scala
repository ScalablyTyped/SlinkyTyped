package typingsSlinky.hapiNes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSubscriptionOptions extends js.Object {
  var auth: js.UndefOr[Boolean | ServerSubscriptionOptionsAuthOptions] = js.native
  var filter: js.UndefOr[
    js.Function4[
      /* path */ String, 
      /* message */ js.Any, 
      /* options */ ServerSubscriptionOptionsFilterOptions, 
      /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.native
  var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.native
}

object ServerSubscriptionOptions {
  @scala.inline
  def apply(): ServerSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSubscriptionOptions]
  }
  @scala.inline
  implicit class ServerSubscriptionOptionsOps[Self <: ServerSubscriptionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Boolean | ServerSubscriptionOptionsAuthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* path */ String, /* message */ js.Any, /* options */ ServerSubscriptionOptionsFilterOptions, /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ js.Any) => js.Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnSubscribe(value: ServerOnSubscribe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnsubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnUnsubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnUnsubscribe(value: ServerOnUnSubscribe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnUnsubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnsubscribe")(js.undefined)
        ret
    }
  }
  
}

