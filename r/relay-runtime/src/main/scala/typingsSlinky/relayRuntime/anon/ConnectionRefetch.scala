package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.connectionHandlerMod.ConnectionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionRefetch extends StObject {
  
  val connection: js.Array[ConnectionMetadata] = js.native
  
  val refetch: ReaderRefetchMetadataconn = js.native
}
object ConnectionRefetch {
  
  @scala.inline
  def apply(connection: js.Array[ConnectionMetadata], refetch: ReaderRefetchMetadataconn): ConnectionRefetch = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRefetch]
  }
  
  @scala.inline
  implicit class ConnectionRefetchMutableBuilder[Self <: ConnectionRefetch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value :_*))
    
    @scala.inline
    def setRefetch(value: ReaderRefetchMetadataconn): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
  }
}
