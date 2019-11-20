package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libUploadInterfaceMod.RcFile
import typingsSlinky.antd.libUploadInterfaceMod.UploadChangeParam
import typingsSlinky.antd.libUploadInterfaceMod.UploadFile
import typingsSlinky.antd.libUploadInterfaceMod.UploadLocale
import typingsSlinky.antd.libUploadInterfaceMod.UploadProps
import typingsSlinky.antd.libUploadInterfaceMod.UploadState
import typingsSlinky.antd.libUploadUploadMod.Upload
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object libUploadUploadMod extends js.Object {
  @js.native
  trait Upload
    extends Component[UploadProps, UploadState, js.Any] {
    var progressTimer: js.Any = js.native
    var recentUploadStatus: Boolean | js.Thenable[_] = js.native
    var upload: js.Any = js.native
    def autoUpdateProgress(`_`: js.Any, file: UploadFile): Unit = js.native
    def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
    def clearProgressTimer(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUpload(): Unit = js.native
    def handleRemove(file: UploadFile): Unit = js.native
    def onChange(info: UploadChangeParam[UploadFile]): Unit = js.native
    def onError(error: js.Error, response: js.Any, file: UploadFile): Unit = js.native
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    def onProgress(e: Anon_Percent, file: UploadFile): Unit = js.native
    def onStart(file: RcFile): Unit = js.native
    def onSuccess(response: js.Any, file: UploadFile): Unit = js.native
    def renderUpload(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
    def renderUploadList(locale: UploadLocale): Element = js.native
    def saveUpload(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Upload {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typingsSlinky.antd.libUploadDraggerMod.default] = js.native
    var defaultProps: Anon_AcceptAction = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileListArray | Null = js.native
  }
  
}

