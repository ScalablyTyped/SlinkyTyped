package typingsSlinky.antd.uploadInterfaceMod

import org.scalajs.dom.raw.File
import typingsSlinky.antd.anon.Percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RcCustomRequestOptions extends js.Object {
  var action: String = js.native
  var data: js.Object = js.native
  var file: File = js.native
  var filename: String = js.native
  var headers: js.Object = js.native
  var withCredentials: Boolean = js.native
  def onError(error: js.Error): Unit = js.native
  def onProgress(event: Percent, file: File): Unit = js.native
  def onSuccess(response: js.Object, file: File): Unit = js.native
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
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnProgress(value: (Percent, File) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSuccess(value: (js.Object, File) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

