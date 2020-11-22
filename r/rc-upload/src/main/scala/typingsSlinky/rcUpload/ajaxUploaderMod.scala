package typingsSlinky.rcUpload

import org.scalajs.dom.raw.FileList
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcUpload.anon.Uid
import typingsSlinky.rcUpload.interfaceMod.RcFile
import typingsSlinky.rcUpload.interfaceMod.UploadProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-upload/es/AjaxUploader", JSImport.Namespace)
@js.native
object ajaxUploaderMod extends js.Object {
  
  @js.native
  trait AjaxUploader
    extends Component[UploadProps, js.Object, js.Any] {
    
    var _isMounted: js.Any = js.native
    
    def abort(): Unit = js.native
    def abort(file: js.Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAjaxUploader(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAjaxUploader(): Unit = js.native
    
    var fileInput: js.Any = js.native
    
    def onChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def onClick(e: SyntheticKeyboardEvent[HTMLDivElement]): Unit = js.native
    def onClick(e: SyntheticMouseEvent[HTMLDivElement]): Unit = js.native
    
    def onFileDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
    
    def onKeyDown(e: SyntheticKeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def post(file: RcFile): Unit = js.native
    
    var reqs: js.Any = js.native
    
    def reset(): Unit = js.native
    
    def saveFileInput(node: HTMLInputElement): Unit = js.native
    
    @JSName("state")
    var state_AjaxUploader: Uid = js.native
    
    def upload(file: RcFile, fileList: js.Array[RcFile]): Unit = js.native
    
    def uploadFiles(files: FileList): Unit = js.native
  }
  
  @js.native
  class default () extends AjaxUploader
}
