package typingsSlinky.primereact.fileUploadMod

import org.scalajs.dom.raw.File
import typingsSlinky.primereact.anon.Files
import typingsSlinky.primereact.anon.FilesAny
import typingsSlinky.primereact.anon.FilesOriginalEvent
import typingsSlinky.primereact.anon.FormData
import typingsSlinky.primereact.anon.Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadProps extends js.Object {
  var accept: js.UndefOr[String] = js.native
  var auto: js.UndefOr[Boolean] = js.native
  var cancelLabel: js.UndefOr[String] = js.native
  var chooseLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var customUpload: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var invalidFileSizeMessageDetail: js.UndefOr[String] = js.native
  var invalidFileSizeMessageSummary: js.UndefOr[String] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onBeforeSend: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.native
  var onBeforeUpload: js.UndefOr[js.Function1[/* e */ FormData, Unit]] = js.native
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* e */ Progress, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ FilesOriginalEvent, Unit]] = js.native
  var onUpload: js.UndefOr[js.Function1[/* e */ Files, Unit]] = js.native
  var onValidationFail: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.native
  var previewWidth: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var uploadHandler: js.UndefOr[js.Function1[/* e */ FilesAny, Unit]] = js.native
  var uploadLabel: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object FileUploadProps {
  @scala.inline
  def apply(): FileUploadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadProps]
  }
  @scala.inline
  implicit class FileUploadPropsOps[Self <: FileUploadProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withChooseLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChooseLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFileSizeMessageDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileSizeMessageDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFileSizeMessageDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileSizeMessageDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidFileSizeMessageSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileSizeMessageSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidFileSizeMessageSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidFileSizeMessageSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeSend(value: /* e */ FormData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUpload(value: /* e */ FormData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* e */ Files => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* e */ Progress => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* e */ FilesOriginalEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpload(value: /* e */ Files => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidationFail(value: /* file */ File => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationFail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidationFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationFail")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadHandler(value: /* e */ FilesAny => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

