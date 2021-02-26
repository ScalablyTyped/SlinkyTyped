package typingsSlinky.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RoomBridgeStore")
@js.native
class RoomBridgeStore protected ()
  extends typingsSlinky.matrixAppserviceBridge.roomBridgeStoreMod.RoomBridgeStore {
  /**
    * Construct a store suitable for room bridging information. Data is stored
    * as {@link RoomBridgeStoreEntry}s which have the following
    * *serialized* format:
    * ```
    * {
    *   id: "unique_id",      // customisable
    *   matrix_id: "room_id",
    *   remote_id: "remote_room_id",
    *   matrix: { serialised matrix room info },
    *   remote: { serialised remote room info },
    *   data: { ... any additional info ... }
    * }
    * ```
    * If a unique 'id' is not given, the store will generate one by concatenating
    * the `matrix_id` and the `remote_id`. The delimiter
    * used is a property on this store and can be modified.
    *
    * The structure of Entry objects means that it is efficient to select based
    * off the 'id', 'matrix_id' or 'remote_id'. Additional indexes can be added
    * manually.
    * @constructor
    * @param db The connected NEDB database instance
    * @param opts Options for this store.
    */
  def this(db: typingsSlinky.nedb.mod.^[_]) = this()
}
/* static members */
object RoomBridgeStore {
  
  @JSImport("matrix-appservice-bridge", "RoomBridgeStore.createUniqueId")
  @js.native
  def createUniqueId(matrixRoomId: String, remoteRoomId: String, delimiter: String): String = js.native
}
