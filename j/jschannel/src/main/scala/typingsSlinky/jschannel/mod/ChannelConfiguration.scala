package typingsSlinky.jschannel.mod

import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelConfiguration extends js.Object {
  var debugOutput: js.UndefOr[Boolean] = js.native
  var gotMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.native
  var onReady: js.UndefOr[js.Function1[/* channel */ MessagingChannel, Unit]] = js.native
  var origin: String = js.native
  var postMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.native
  var publish: js.UndefOr[Boolean] = js.native
  var reconnect: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String | js.Array[String]] = js.native
  var scope: String = js.native
  var window: Window = js.native
}

object ChannelConfiguration {
  @scala.inline
  def apply(origin: String, scope: String, window: Window): ChannelConfiguration = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConfiguration]
  }
  @scala.inline
  implicit class ChannelConfigurationOps[Self <: ChannelConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugOutput")(js.undefined)
        ret
    }
    @scala.inline
    def withGotMessageObserver(value: (/* origin */ String, /* message */ Message) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotMessageObserver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGotMessageObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotMessageObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* channel */ MessagingChannel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
    @scala.inline
    def withPostMessageObserver(value: (/* origin */ String, /* message */ Message) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageObserver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostMessageObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postMessageObserver")(js.undefined)
        ret
    }
    @scala.inline
    def withPublish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(js.undefined)
        ret
    }
  }
  
}

