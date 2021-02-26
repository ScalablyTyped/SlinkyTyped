package typingsSlinky.relayRuntime.anon

import typingsSlinky.relayRuntime.connectionHandlerMod.ConnectionMetadata
import typingsSlinky.relayRuntime.readerNodeMod.ReaderRefetchMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Refetch extends StObject {
  
  val connection: js.UndefOr[js.Array[ConnectionMetadata]] = js.native
  
  val refetch: ReaderRefetchMetadata = js.native
}
object Refetch {
  
  @scala.inline
  def apply(refetch: ReaderRefetchMetadata): Refetch = {
    val __obj = js.Dynamic.literal(refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refetch]
  }
  
  @scala.inline
  implicit class RefetchMutableBuilder[Self <: Refetch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Array[ConnectionMetadata]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setConnectionVarargs(value: ConnectionMetadata*): Self = StObject.set(x, "connection", js.Array(value :_*))
    
    @scala.inline
    def setRefetch(value: ReaderRefetchMetadata): Self = StObject.set(x, "refetch", value.asInstanceOf[js.Any])
  }
}
