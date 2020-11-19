package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Accept
import typingsSlinky.antd.anon.FileList
import typingsSlinky.antd.anon.Percent
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.uploadInterfaceMod.RcFile
import typingsSlinky.antd.uploadInterfaceMod.UploadChangeParam
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadLocale
import typingsSlinky.antd.uploadInterfaceMod.UploadProps
import typingsSlinky.antd.uploadInterfaceMod.UploadState
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object uploadUploadMod extends js.Object {
  
  @js.native
  trait Upload
    extends Component[UploadProps[js.Any], UploadState[js.Any], js.Any] {
    
    def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
    
    def clearProgressTimer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUpload(): Unit = js.native
    
    def handleRemove(file: UploadFile[_]): Unit = js.native
    
    def onChange(info: UploadChangeParam[UploadFile[_]]): Unit = js.native
    
    def onError(error: js.Error, response: js.Any, file: UploadFile[_]): Unit = js.native
    
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onProgress(e: Percent, file: UploadFile[_]): Unit = js.native
    
    def onStart(file: RcFile): Unit = js.native
    
    def onSuccess(response: js.Any, file: UploadFile[_], xhr: js.Any): Unit = js.native
    
    var progressTimer: js.Any = js.native
    
    var recentUploadStatus: Boolean | js.Thenable[_] = js.native
    
    def renderUpload(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
    
    def renderUploadList(locale: UploadLocale): ReactElement = js.native
    
    def saveUpload(node: js.Any): Unit = js.native
    
    var upload: js.Any = js.native
  }
  
  @js.native
  class default protected () extends Upload {
    def this(props: UploadProps[_]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Dragger: Instantiable0[typingsSlinky.antd.draggerMod.default] = js.native
    
    var defaultProps: Accept = js.native
    
    def getDerivedStateFromProps(nextProps: UploadProps[_]): FileList | Null = js.native
  }
}
