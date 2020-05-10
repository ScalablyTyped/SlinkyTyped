package typingsSlinky.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPutOptions extends ItemInfo {
  var maxAge: js.UndefOr[Double] = js.native
  var onExpire: js.UndefOr[OnExpireCallback] = js.native
  var storeOnReject: js.UndefOr[Boolean] = js.native
  var storeOnResolve: js.UndefOr[Boolean] = js.native
}

object GetPutOptions {
  @scala.inline
  def apply(): GetPutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPutOptions]
  }
  @scala.inline
  implicit class GetPutOptionsOps[Self <: GetPutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpire(value: (/* key */ String, /* value */ js.Any, /* done */ js.UndefOr[js.Function]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreOnReject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnReject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreOnReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnReject")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreOnResolve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoreOnResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeOnResolve")(js.undefined)
        ret
    }
  }
  
}

