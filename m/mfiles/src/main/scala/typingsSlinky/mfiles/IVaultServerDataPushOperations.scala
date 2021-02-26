package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultServerDataPushOperations extends StObject {
  
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault = js.native
  
  def SendCancel(RequestID: Double): Unit = js.native
  
  def SendError(RequestID: Double, Error: String): Unit = js.native
  
  def SendHeartbeat(RequestID: Double): Unit = js.native
  
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit = js.native
  
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit = js.native
}
object IVaultServerDataPushOperations {
  
  @scala.inline
  def apply(
    CloneVaultForServerDataPush: IServerDataPushSink => IVault,
    SendCancel: Double => Unit,
    SendError: (Double, String) => Unit,
    SendHeartbeat: Double => Unit,
    SendResponse: (Double, String) => Unit,
    SetServerDataPushSink: IServerDataPushSink => Unit
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal(CloneVaultForServerDataPush = js.Any.fromFunction1(CloneVaultForServerDataPush), SendCancel = js.Any.fromFunction1(SendCancel), SendError = js.Any.fromFunction2(SendError), SendHeartbeat = js.Any.fromFunction1(SendHeartbeat), SendResponse = js.Any.fromFunction2(SendResponse), SetServerDataPushSink = js.Any.fromFunction1(SetServerDataPushSink))
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
  
  @scala.inline
  implicit class IVaultServerDataPushOperationsMutableBuilder[Self <: IVaultServerDataPushOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloneVaultForServerDataPush(value: IServerDataPushSink => IVault): Self = StObject.set(x, "CloneVaultForServerDataPush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendCancel(value: Double => Unit): Self = StObject.set(x, "SendCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendError(value: (Double, String) => Unit): Self = StObject.set(x, "SendError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendHeartbeat(value: Double => Unit): Self = StObject.set(x, "SendHeartbeat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendResponse(value: (Double, String) => Unit): Self = StObject.set(x, "SendResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetServerDataPushSink(value: IServerDataPushSink => Unit): Self = StObject.set(x, "SetServerDataPushSink", js.Any.fromFunction1(value))
  }
}
