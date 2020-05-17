package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait applicationCache extends js.Object {
  @JSName("MSHTML.applicationCache_typekey")
  var MSHTMLDotapplicationCache_typekey: applicationCache = js.native
  var oncached: js.Any = js.native
  var onchecking: js.Any = js.native
  var ondownloading: js.Any = js.native
  var onerror: js.Any = js.native
  var onnoupdate: js.Any = js.native
  var onobsolete: js.Any = js.native
  var onprogress: js.Any = js.native
  var onupdateready: js.Any = js.native
  val status: Double = js.native
  def abort(): Unit = js.native
  def swapCache(): Unit = js.native
  def update(): Unit = js.native
}

object applicationCache {
  @scala.inline
  def apply(
    MSHTMLDotapplicationCache_typekey: applicationCache,
    abort: () => Unit,
    oncached: js.Any,
    onchecking: js.Any,
    ondownloading: js.Any,
    onerror: js.Any,
    onnoupdate: js.Any,
    onobsolete: js.Any,
    onprogress: js.Any,
    onupdateready: js.Any,
    status: Double,
    swapCache: () => Unit,
    update: () => Unit
  ): applicationCache = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), oncached = oncached.asInstanceOf[js.Any], onchecking = onchecking.asInstanceOf[js.Any], ondownloading = ondownloading.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onnoupdate = onnoupdate.asInstanceOf[js.Any], onobsolete = onobsolete.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onupdateready = onupdateready.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], swapCache = js.Any.fromFunction0(swapCache), update = js.Any.fromFunction0(update))
    __obj.updateDynamic("MSHTML.applicationCache_typekey")(MSHTMLDotapplicationCache_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[applicationCache]
  }
  @scala.inline
  implicit class applicationCacheOps[Self <: applicationCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotapplicationCache_typekey(value: applicationCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.applicationCache_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOncached(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnchecking(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchecking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndownloading(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondownloading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnerror(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnnoupdate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onnoupdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnobsolete(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onobsolete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnprogress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnupdateready(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onupdateready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwapCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swapCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

