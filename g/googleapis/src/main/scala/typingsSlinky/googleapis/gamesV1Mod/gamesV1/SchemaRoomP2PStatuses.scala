package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an update on the status of peers in a room.
  */
@js.native
trait SchemaRoomP2PStatuses extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomP2PStatuses.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The updates for the peers.
    */
  var updates: js.UndefOr[js.Array[SchemaRoomP2PStatus]] = js.native
}
object SchemaRoomP2PStatuses {
  
  @scala.inline
  def apply(): SchemaRoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomP2PStatuses]
  }
  
  @scala.inline
  implicit class SchemaRoomP2PStatusesMutableBuilder[Self <: SchemaRoomP2PStatuses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUpdates(value: js.Array[SchemaRoomP2PStatus]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    @scala.inline
    def setUpdatesVarargs(value: SchemaRoomP2PStatus*): Self = StObject.set(x, "updates", js.Array(value :_*))
  }
}
