package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esUploadInterfaceMod.HttpRequestHeader
import typingsSlinky.antd.esUploadInterfaceMod.RcCustomRequestOptions
import typingsSlinky.antd.esUploadInterfaceMod.RcFile
import typingsSlinky.antd.esUploadInterfaceMod.ShowUploadListInterface
import typingsSlinky.antd.esUploadInterfaceMod.UploadFile
import typingsSlinky.antd.esUploadInterfaceMod.UploadListType
import typingsSlinky.antd.esUploadInterfaceMod.UploadLocale
import typingsSlinky.antd.esUploadInterfaceMod.UploadProps
import typingsSlinky.antd.esUploadInterfaceMod.UploadType
import typingsSlinky.antd.esUploadMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Upload
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esUploadMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: accept, className, disabled, id, multiple, name, onChange */
  def apply(
    action: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit] = null,
    customRequest: /* options */ RcCustomRequestOptions => Unit = null,
    data: js.Object | (js.Function1[/* file */ UploadFile, js.Object]) = null,
    defaultFileList: js.Array[UploadFile] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    fileList: js.Array[UploadFile] = null,
    headers: HttpRequestHeader = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    onDownload: /* file */ UploadFile => Unit = null,
    onPreview: /* file */ UploadFile => Unit = null,
    onRemove: /* file */ UploadFile => Unit | Boolean | (js.Promise[Unit | Boolean]) = null,
    openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => js.Thenable[String] = null,
    showUploadList: Boolean | ShowUploadListInterface = null,
    style: CSSProperties = null,
    supportServerRender: js.UndefOr[Boolean] = js.undefined,
    transformFile: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File]) = null,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (beforeUpload != null) __obj.updateDynamic("beforeUpload")(js.Any.fromFunction2(beforeUpload))
    if (customRequest != null) __obj.updateDynamic("customRequest")(js.Any.fromFunction1(customRequest))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultFileList != null) __obj.updateDynamic("defaultFileList")(defaultFileList.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (fileList != null) __obj.updateDynamic("fileList")(fileList.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1(onDownload))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1(onPreview))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1(previewFile))
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender.asInstanceOf[js.Any])
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction1(transformFile))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = UploadProps
}

