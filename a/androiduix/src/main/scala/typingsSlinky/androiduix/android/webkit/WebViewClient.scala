package typingsSlinky.androiduix.android.webkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewClient extends js.Object {
  def onPageFinished(view: WebView, url: String): Unit = js.native
  def onReceivedTitle(view: WebView, title: String): Unit = js.native
}

object WebViewClient {
  @scala.inline
  def apply(onPageFinished: (WebView, String) => Unit, onReceivedTitle: (WebView, String) => Unit): WebViewClient = {
    val __obj = js.Dynamic.literal(onPageFinished = js.Any.fromFunction2(onPageFinished), onReceivedTitle = js.Any.fromFunction2(onReceivedTitle))
    __obj.asInstanceOf[WebViewClient]
  }
  @scala.inline
  implicit class WebViewClientOps[Self <: WebViewClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPageFinished(value: (WebView, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageFinished")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnReceivedTitle(value: (WebView, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReceivedTitle")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

