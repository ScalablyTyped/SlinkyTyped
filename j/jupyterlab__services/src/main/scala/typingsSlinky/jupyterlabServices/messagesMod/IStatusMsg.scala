package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Executionstate
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.status
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStatusMsg
  extends IIOPubMessage[status]
     with _Message {
  
  @JSName("content")
  var content_IStatusMsg: Executionstate = js.native
}
object IStatusMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Executionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IStatusMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusMsg]
  }
  
  @scala.inline
  implicit class IStatusMsgMutableBuilder[Self <: IStatusMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Executionstate): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
