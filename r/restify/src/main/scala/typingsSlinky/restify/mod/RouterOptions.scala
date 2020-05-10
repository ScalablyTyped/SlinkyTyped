package typingsSlinky.restify.mod

import typingsSlinky.bunyan.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterOptions extends js.Object {
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  var log: js.UndefOr[^] = js.native
  var onceNext: js.UndefOr[Boolean] = js.native
  var registry: js.UndefOr[RouterRegistryRadix] = js.native
  var strictNext: js.UndefOr[Boolean] = js.native
}

object RouterOptions {
  @scala.inline
  def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  @scala.inline
  implicit class RouterOptionsOps[Self <: RouterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withLog(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.undefined)
        ret
    }
    @scala.inline
    def withOnceNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnceNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistry(value: RouterRegistryRadix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(js.undefined)
        ret
    }
  }
  
}

