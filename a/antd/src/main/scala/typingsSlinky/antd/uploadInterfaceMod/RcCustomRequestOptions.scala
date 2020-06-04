package typingsSlinky.antd.uploadInterfaceMod

import org.scalajs.dom.raw.File
import typingsSlinky.antd.anon.Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RcCustomRequestOptions extends js.Object {
  var action: String
  var data: js.Object
  var file: File
  var filename: String
  var headers: js.Object
  var withCredentials: Boolean
  def onError(error: js.Error): Unit
  def onProgress(event: Percent, file: File): Unit
  def onSuccess(response: js.Object, file: File): Unit
}

object RcCustomRequestOptions {
  @scala.inline
  def apply(
    action: String,
    data: js.Object,
    file: File,
    filename: String,
    headers: js.Object,
    onError: js.Error => Unit,
    onProgress: (Percent, File) => Unit,
    onSuccess: (js.Object, File) => Unit,
    withCredentials: Boolean
  ): RcCustomRequestOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onProgress = js.Any.fromFunction2(onProgress), onSuccess = js.Any.fromFunction2(onSuccess), withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcCustomRequestOptions]
  }
  @scala.inline
  implicit class RcCustomRequestOptionsOps[Self <: RcCustomRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: js.Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnProgress(value: (Percent, File) => Unit): Self = this.set("onProgress", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSuccess(value: (js.Object, File) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
  
}

