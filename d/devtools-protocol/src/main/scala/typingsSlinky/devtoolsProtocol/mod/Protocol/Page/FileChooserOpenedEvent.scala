package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.selectMultiple
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.selectSingle
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileChooserOpenedEvent extends StObject {
  
  /**
    * Input node id.
    */
  var backendNodeId: BackendNodeId = js.native
  
  /**
    * Id of the frame containing input node.
    */
  var frameId: FrameId = js.native
  
  /**
    * Input mode. (FileChooserOpenedEventMode enum)
    */
  var mode: selectSingle | selectMultiple = js.native
}
object FileChooserOpenedEvent {
  
  @scala.inline
  def apply(backendNodeId: BackendNodeId, frameId: FrameId, mode: selectSingle | selectMultiple): FileChooserOpenedEvent = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChooserOpenedEvent]
  }
  
  @scala.inline
  implicit class FileChooserOpenedEventMutableBuilder[Self <: FileChooserOpenedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: selectSingle | selectMultiple): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
