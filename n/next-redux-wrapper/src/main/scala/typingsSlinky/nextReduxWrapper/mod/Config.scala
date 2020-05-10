package typingsSlinky.nextReduxWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var deserializeState: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.native
  var overrideIsServer: js.UndefOr[Boolean] = js.native
  var serializeState: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.native
  var storeKey: js.UndefOr[String] = js.native
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
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserializeState(value: /* any */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializeState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeserializeState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserializeState")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideIsServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideIsServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideIsServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideIsServer")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeState(value: /* any */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializeState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeState")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeKey")(js.undefined)
        ret
    }
  }
  
}

