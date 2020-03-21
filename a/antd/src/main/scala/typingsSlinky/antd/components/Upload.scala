package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdStrings.POST
import typingsSlinky.antd.antdStrings.PUT
import typingsSlinky.antd.antdStrings.post_
import typingsSlinky.antd.antdStrings.put_
import typingsSlinky.antd.uploadInterfaceMod.HttpRequestHeader
import typingsSlinky.antd.uploadInterfaceMod.RcCustomRequestOptions
import typingsSlinky.antd.uploadInterfaceMod.RcFile
import typingsSlinky.antd.uploadInterfaceMod.ShowUploadListInterface
import typingsSlinky.antd.uploadInterfaceMod.UploadChangeParam
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadListType
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import typingsSlinky.antd.uploadInterfaceMod.UploadProps
import typingsSlinky.antd.uploadInterfaceMod.UploadType
import typingsSlinky.antd.uploadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Upload
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/upload", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: accept, className, disabled, id, multiple, name, style */
  def apply(
    action: String | (js.Function1[/* file */ RcFile, String | js.Thenable[String]]) = null,
    beforeUpload: (/* file */ RcFile, /* FileList */ js.Array[RcFile]) => Boolean | js.Thenable[Unit] = null,
    customRequest: /* options */ RcCustomRequestOptions => Unit = null,
    data: js.Object | (js.Function1[/* file */ UploadFile[_], js.Object]) = null,
    defaultFileList: js.Array[UploadFile[_]] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    fileList: js.Array[UploadFile[_]] = null,
    headers: HttpRequestHeader = null,
    iconRender: (/* file */ UploadFile[_], /* listType */ js.UndefOr[UploadListType]) => TagMod[Any] = null,
    listType: UploadListType = null,
    locale: UploadLocale = null,
    method: POST | PUT | post_ | put_ = null,
    onChange: /* info */ UploadChangeParam[UploadFile[_]] => Unit = null,
    onDownload: /* file */ UploadFile[_] => Unit = null,
    onPreview: /* file */ UploadFile[_] => Unit = null,
    onRemove: /* file */ UploadFile[_] => Unit | Boolean | (js.Promise[Unit | Boolean]) = null,
    openFileDialogOnClick: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    previewFile: /* file */ File | Blob => js.Thenable[String] = null,
    showUploadList: Boolean | ShowUploadListInterface = null,
    supportServerRender: js.UndefOr[Boolean] = js.undefined,
    transformFile: /* file */ RcFile => String | Blob | File | (js.Thenable[String | Blob | File]) = null,
    `type`: UploadType = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
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
    if (iconRender != null) __obj.updateDynamic("iconRender")(js.Any.fromFunction2(iconRender))
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction1(onDownload))
    if (onPreview != null) __obj.updateDynamic("onPreview")(js.Any.fromFunction1(onPreview))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (!js.isUndefined(openFileDialogOnClick)) __obj.updateDynamic("openFileDialogOnClick")(openFileDialogOnClick.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (previewFile != null) __obj.updateDynamic("previewFile")(js.Any.fromFunction1(previewFile))
    if (showUploadList != null) __obj.updateDynamic("showUploadList")(showUploadList.asInstanceOf[js.Any])
    if (!js.isUndefined(supportServerRender)) __obj.updateDynamic("supportServerRender")(supportServerRender.asInstanceOf[js.Any])
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction1(transformFile))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.uploadMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = UploadProps
}

