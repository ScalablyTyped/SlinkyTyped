package typingsSlinky.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerMethodOptions extends js.Object {
  /**
    * a context object passed back to the method function (via this) when called. Defaults to active context (set via server.bind() when the method is registered. Ignored if the method is an arrow
    * function.
    */
  var bind: js.UndefOr[js.Object] = js.native
  /**
    * the same cache configuration used in server.cache(). The generateTimeout option is required.
    */
  var cache: js.UndefOr[ServerMethodCache] = js.native
  /**
    * a function used to generate a unique key (for caching) from the arguments passed to the method function (the flags argument is not passed as input). The server will automatically generate a
    * unique key if the function's arguments are all of types 'string', 'number', or 'boolean'. However if the method uses other types of arguments, a key generation function must be provided which
    * takes the same arguments as the function and returns a unique string (or null if no key can be generated).
    */
  var generateKey: js.UndefOr[js.Function1[/* repeated */ js.Any, String | Null]] = js.native
}

object ServerMethodOptions {
  @scala.inline
  def apply(): ServerMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerMethodOptions]
  }
  @scala.inline
  implicit class ServerMethodOptionsOps[Self <: ServerMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withCache(value: ServerMethodCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateKey(value: /* repeated */ js.Any => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenerateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateKey")(js.undefined)
        ret
    }
  }
  
}

