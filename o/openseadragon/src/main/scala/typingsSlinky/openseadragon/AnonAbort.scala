package typingsSlinky.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbort extends js.Object {
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  var ajaxHeaders: js.UndefOr[String] = js.native
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  var loadWithAjax: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
}

object AnonAbort {
  @scala.inline
  def apply(): AnonAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAbort]
  }
  @scala.inline
  implicit class AnonAbortOps[Self <: AnonAbort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxHeaders(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOriginPolicy(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOriginPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOriginPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadWithAjax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadWithAjax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadWithAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadWithAjax")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

