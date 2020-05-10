package typingsSlinky.burns.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Burns configuration settings
  */
@js.native
trait Config extends js.Object {
  var broadcaster: js.UndefOr[String | Null] = js.native
  var defaultHandler: js.UndefOr[HandlerFn] = js.native
  var pusher: js.UndefOr[Record[String, _]] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcaster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcaster")(js.undefined)
        ret
    }
    @scala.inline
    def withBroadcasterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcaster")(null)
        ret
    }
    @scala.inline
    def withDefaultHandler(value: /* payload */ js.UndefOr[js.Any] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDefaultHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPusher(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pusher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPusher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pusher")(js.undefined)
        ret
    }
  }
  
}

