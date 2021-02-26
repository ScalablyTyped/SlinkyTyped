package typingsSlinky.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.matrixAppserviceBridge.bridgeStoreMod.BridgeStore
import typingsSlinky.matrixAppserviceBridge.matrixMod.MatrixRoom
import typingsSlinky.matrixAppserviceBridge.matrixMod.MatrixRoomData
import typingsSlinky.matrixAppserviceBridge.remoteMod.RemoteRoom
import typingsSlinky.nedb.mod.^
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomBridgeStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/room-bridge-store", "RoomBridgeStore")
  @js.native
  class RoomBridgeStore protected () extends BridgeStore {
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
    def this(db: ^[_]) = this()
    
    /**
      * A batched version of `getLinkedRemoteRooms`.
      * @param matrixIds
      * @return A mapping of room_id to RemoteRoom.
      * @see RoomBridgeStore#getLinkedRemoteRooms
      */
    def batchGetLinkedRemoteRooms(matrixIds: js.Array[String]): js.Promise[StringDictionary[js.Array[RemoteRoom]]] = js.native
    
    var delimiter: String = js.native
    
    /**
      * Get a list of entries based on the link's data value.
      * @param data The data values to retrieve based from.
      * @example
      * store.linkRooms(matrixRoom, remoteRoom, { some_key: "some_val" });
      * store.getEntriesByLinkData({
      *     some_key: "some_val"
      * });
      */
    def getEntriesByLinkData(data: Record[String, _]): js.Promise[js.Array[RoomBridgeStoreEntry]] = js.native
    
    /**
      * Get a list of entries based on the matrix_id of each entry.
      * @param matrixId
      */
    def getEntriesByMatrixId(matrixId: String): js.Promise[js.Array[RoomBridgeStoreEntry]] = js.native
    
    /**
      * A batch version of <code>getEntriesByMatrixId</code>.
      * @param ids
      * @return Resolves to a map of room_id => Entry[]
      */
    def getEntriesByMatrixIds(ids: js.Array[String]): js.Promise[StringDictionary[js.Array[RoomBridgeStoreEntry]]] = js.native
    
    /**
      * Get a list of entries based on a MatrixRoom data value.
      * @param data The data values to retrieve based from.
      * @example
      * matrixRoom.set("some_key", "some_val");
      * // store matrixRoom and then:
      * store.getEntriesByMatrixRoomData({
      *     some_key: "some_val"
      * });
      */
    def getEntriesByMatrixRoomData(data: Record[String, _]): js.Promise[js.Array[RoomBridgeStoreEntry]] = js.native
    
    /**
      * Get a list of entries based on the remote_id of each entry.
      * @param remoteId
      */
    def getEntriesByRemoteId(remoteId: String): js.Promise[js.Array[RoomBridgeStoreEntry]] = js.native
    
    /**
      * Get a list of entries based on a RemoteRoom data value.
      * @param data The data values to retrieve based from.
      * @example
      * remoteRoom.set("some_key", "some_val");
      * // store remoteRoom and then:
      * store.getEntriesByRemoteRoomData({
      *     some_key: "some_val"
      * });
      */
    def getEntriesByRemoteRoomData(data: Record[String, _]): js.Promise[js.Array[RoomBridgeStoreEntry]] = js.native
    
    /**
      * Get an existing entry based on the provided entry ID.
      * @param id The ID of the entry to retrieve.
      */
    def getEntryById(id: String): js.Promise[RoomBridgeStoreEntry | Null] = js.native
    
    /**
      * Get all entries with the given remote_id which have a Matrix room within.
      * @param remoteId
      */
    def getLinkedMatrixRooms(remoteId: String): js.Promise[js.Array[MatrixRoom]] = js.native
    
    /**
      * Get all entries with the given matrix_id which have a Remote room within.
      * @param matrixId
      */
    def getLinkedRemoteRooms(matrixId: String): js.Promise[js.Array[RemoteRoom]] = js.native
    
    /**
      * Get an entry's Matrix room based on the provided room_id. The entry MUST have
      * an 'id' of the room_id and there MUST be a Matrix room contained within the
      * entry for this to return.
      * @param roomId
      * @see RoomBridgeStore#setMatrixRoom
      */
    def getMatrixRoom(roomId: String): js.Promise[js.UndefOr[MatrixRoom | Null]] = js.native
    
    /**
      * Create a link between a matrix room and remote room. This will create an entry with:
      * - The matrix_id set to the matrix room ID.
      * - The remote_id set to the remote room ID.
      * - The id set to the id value given OR a concatenation of the matrix and remote IDs
      * if one is not provided.
      * @param matrixRoom The matrix room
      * @param remoteRoom The remote room
      * @param data Information about this mapping.
      * @param linkId The id value to set. If not given, a unique ID will be
      * created from the matrix_id and remote_id.
      */
    def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom): js.Promise[Double] = js.native
    def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom, data: js.UndefOr[scala.Nothing], linkId: String): js.Promise[Double] = js.native
    def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom, data: Record[String, _]): js.Promise[Double] = js.native
    def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom, data: Record[String, _], linkId: String): js.Promise[Double] = js.native
    
    /**
      * Remove entries based on the link's data value.
      * @param data The data to match.
      * @example
      * store.linkRooms(matrixRoom, remoteRoom, { a_key: "a_val" });
      * store.removeEntriesByLinkData({
      *     a_key: "a_val"
      * });
      */
    def removeEntriesByLinkData(data: Record[String, _]): js.Promise[Double] = js.native
    
    /**
      * Remove entries based on matrix room data.
      * @param data The data to match.
      * @example
      * matrixRoom.set("a_key", "a_val");
      * // store matrixRoom and then:
      * store.removeEntriesByMatrixRoomData({
      *     a_key: "a_val"
      * });
      */
    def removeEntriesByMatrixRoomData(data: Record[String, _]): js.Promise[Double] = js.native
    
    /**
      * Remove entries with this matrix room id.
      * @param matrixId The matrix id.
      * @example
      * new MatrixRoom("!foobar:matrix.org");
      * // store the MatrixRoom and then:
      * store.removeEntriesByMatrixRoomId("!foobar:matrix.org");
      */
    def removeEntriesByMatrixRoomId(matrixId: String): js.Promise[Double] = js.native
    
    /**
      * Remove entries based on remote room data.
      * @param data The data to match.
      * @example
      * remoteRoom.set("a_key", "a_val");
      * // store remoteRoom and then:
      * store.removeEntriesByRemoteRoomData({
      *     a_key: "a_val"
      * });
      */
    def removeEntriesByRemoteRoomData(data: Record[String, _]): js.Promise[Double] = js.native
    
    /**
      * Remove entries with this remote room id.
      * @param remoteId The remote id.
      * @example
      * new RemoteRoom("foobar");
      * // store the RemoteRoom and then:
      * store.removeEntriesByRemoteRoomId("foobar");
      */
    def removeEntriesByRemoteRoomId(remoteId: String): js.Promise[Double] = js.native
    
    /**
      * Remove an existing entry based on the provided entry ID.
      * @param id The ID of the entry to remove.
      * @example
      * store.removeEntryById("anid");
      */
    def removeEntryById(id: String): js.Promise[Double] = js.native
    
    /**
      * Create an entry with only a matrix room. Sets the 'id' of the entry to the
      * Matrix room ID. If an entry already exists with this 'id', it will be replaced.
      * This function is useful if you just want to store a room with some data and not
      * worry about any mappings.
      * @param matrixRoom
      * @see RoomBridgeStore#getMatrixRoom
      */
    def setMatrixRoom(matrixRoom: MatrixRoom): js.Promise[Double] = js.native
    
    /**
      * Insert an entry, clobbering based on the ID of the entry.
      * @param entry
      */
    def upsertEntry(entry: RoomBridgeStoreEntry): js.Promise[Double] = js.native
  }
  /* static members */
  object RoomBridgeStore {
    
    @JSImport("matrix-appservice-bridge/lib/components/room-bridge-store", "RoomBridgeStore.createUniqueId")
    @js.native
    def createUniqueId(matrixRoomId: String, remoteRoomId: String, delimiter: String): String = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/room-bridge-store", "RoomBridgeStoreEntry")
  @js.native
  class RoomBridgeStoreEntry () extends StObject {
    def this(doc: RoomStoreEntryDoc) = this()
    
    var data: Record[String, _] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var matrix: js.UndefOr[MatrixRoom] = js.native
    
    var remote: js.UndefOr[RemoteRoom] = js.native
  }
  /* static members */
  object RoomBridgeStoreEntry {
    
    @JSImport("matrix-appservice-bridge/lib/components/room-bridge-store", "RoomBridgeStoreEntry.serializeEntry")
    @js.native
    def serializeEntry(entry: RoomBridgeStoreEntry): RoomStoreEntryDoc = js.native
  }
  
  @js.native
  trait RoomStoreEntryDoc extends StObject {
    
    var data: js.UndefOr[Record[String, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var matrix: js.UndefOr[MatrixRoomData] = js.native
    
    var matrix_id: js.UndefOr[String] = js.native
    
    var remote: js.UndefOr[Record[String, _]] = js.native
    
    var remote_id: js.UndefOr[String] = js.native
  }
  object RoomStoreEntryDoc {
    
    @scala.inline
    def apply(): RoomStoreEntryDoc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoomStoreEntryDoc]
    }
    
    @scala.inline
    implicit class RoomStoreEntryDocMutableBuilder[Self <: RoomStoreEntryDoc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Record[String, _]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMatrix(value: MatrixRoomData): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      @scala.inline
      def setMatrix_id(value: String): Self = StObject.set(x, "matrix_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrix_idUndefined: Self = StObject.set(x, "matrix_id", js.undefined)
      
      @scala.inline
      def setRemote(value: Record[String, _]): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
      
      @scala.inline
      def setRemote_id(value: String): Self = StObject.set(x, "remote_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote_idUndefined: Self = StObject.set(x, "remote_id", js.undefined)
    }
  }
}
