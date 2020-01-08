package typingsSlinky.antd

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.libUploadInterfaceMod.UploadFile
import typingsSlinky.antd.libUploadInterfaceMod.UploadListProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object libUploadUploadListMod extends js.Object {
  @js.native
  trait UploadList
    extends Component[UploadListProps, js.Any, js.Any] {
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    def handleClose(file: UploadFile[_]): Unit = js.native
    def handleDownload(file: UploadFile[_]): Unit = js.native
    def handlePreview(file: UploadFile[_], e: SyntheticEvent[Event, HTMLElement]): Unit = js.native
    def renderUploadList(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends UploadList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_File = js.native
  }
  
}

