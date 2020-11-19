package typingsSlinky.antd

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.IsImageUrl
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import typingsSlinky.antd.uploadInterfaceMod.UploadListProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object uploadListMod extends js.Object {
  
  @js.native
  trait UploadList
    extends Component[UploadListProps[js.Any], js.Any, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    
    def handleActionIconRender(customIcon: ReactElement, callback: js.Function0[Unit], prefixCls: String): ReactElement = js.native
    def handleActionIconRender(customIcon: ReactElement, callback: js.Function0[Unit], prefixCls: String, title: String): ReactElement = js.native
    
    def handleClose(file: UploadFile[_]): Unit = js.native
    
    def handleDownload(file: UploadFile[_]): Unit = js.native
    
    def handleIconRender(file: UploadFile[_]): js.UndefOr[js.Object | Null] = js.native
    
    def handlePreview(file: UploadFile[_], e: SyntheticEvent[Event, HTMLElement]): Unit = js.native
    
    def renderUploadList(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  class default () extends UploadList
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: IsImageUrl = js.native
  }
}
