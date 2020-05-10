package typingsSlinky.antd.uploadInterfaceMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.TagMod
import typingsSlinky.antd.antdStrings.POST
import typingsSlinky.antd.antdStrings.PUT
import typingsSlinky.antd.antdStrings.post_
import typingsSlinky.antd.antdStrings.put_
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadProps extends js.Object {
  var accept: js.UndefOr[String] = js.native
  var action: js.UndefOr[String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])] = js.native
  var beforeUpload: js.UndefOr[
    js.Function2[/* file */ RcFile, /* FileList */ js.Array[RcFile], Boolean | js.Thenable[Unit]]
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var customRequest: js.UndefOr[js.Function1[/* options */ RcCustomRequestOptions, Unit]] = js.native
  var data: js.UndefOr[js.Object | (js.Function1[/* file */ UploadFile[_], js.Object])] = js.native
  var defaultFileList: js.UndefOr[js.Array[UploadFile[_]]] = js.native
  var directory: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fileList: js.UndefOr[js.Array[UploadFile[_]]] = js.native
  var headers: js.UndefOr[HttpRequestHeader] = js.native
  var iconRender: js.UndefOr[
    js.Function2[/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType], TagMod[Any]]
  ] = js.native
  var id: js.UndefOr[String] = js.native
  var listType: js.UndefOr[UploadListType] = js.native
  var locale: js.UndefOr[UploadLocale] = js.native
  var method: js.UndefOr[POST | PUT | post_ | put_] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* info */ UploadChangeParam[UploadFile[_]], Unit]] = js.native
  var onDownload: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.native
  var onPreview: js.UndefOr[js.Function1[/* file */ UploadFile[_], Unit]] = js.native
  var onRemove: js.UndefOr[
    js.Function1[/* file */ UploadFile[_], Unit | Boolean | (js.Promise[Unit | Boolean])]
  ] = js.native
  var openFileDialogOnClick: js.UndefOr[Boolean] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var previewFile: js.UndefOr[PreviewFileHandler] = js.native
  var showUploadList: js.UndefOr[Boolean | ShowUploadListInterface] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var supportServerRender: js.UndefOr[Boolean] = js.native
  var transformFile: js.UndefOr[TransformFileHandler] = js.native
  var `type`: js.UndefOr[UploadType] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object UploadProps {
  @scala.inline
  def apply(): UploadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadProps]
  }
  @scala.inline
  implicit class UploadPropsOps[Self <: UploadProps] (val x: Self) extends AnyVal {
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
    def withActionFunction1(value: /* file */ RcFile => String | js.Thenable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAction(value: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpload(value: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpload")(js.undefined)
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
    def withCustomRequest(value: /* options */ RcCustomRequestOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFunction1(value: /* file */ UploadFile[_] => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: js.Object | (js.Function1[/* file */ UploadFile[_], js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFileList(value: js.Array[UploadFile[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFileList")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
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
    def withFileList(value: js.Array[UploadFile[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HttpRequestHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIconRender(value: (/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType]) => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIconRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconRender")(js.undefined)
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
    def withListType(value: UploadListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listType")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: UploadLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: POST | PUT | post_ | put_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
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
    def withOnChange(value: /* info */ UploadChangeParam[UploadFile[_]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDownload(value: /* file */ UploadFile[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreview(value: /* file */ UploadFile[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreview")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemove(value: /* file */ UploadFile[_] => Unit | Boolean | (js.Promise[Unit | Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenFileDialogOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFileDialogOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenFileDialogOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFileDialogOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewFile(value: /* file */ File | Blob => js.Thenable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreviewFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewFile")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUploadList(value: Boolean | ShowUploadListInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUploadList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUploadList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUploadList")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withSupportServerRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportServerRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportServerRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportServerRender")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFile(value: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFile")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: UploadType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

