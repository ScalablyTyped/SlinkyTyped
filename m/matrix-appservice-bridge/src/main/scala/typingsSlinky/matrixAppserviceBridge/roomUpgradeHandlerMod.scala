package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.matrixAppserviceBridge.anon.Roomid
import typingsSlinky.matrixAppserviceBridge.anon.Sender
import typingsSlinky.matrixAppserviceBridge.mod.Bridge
import typingsSlinky.matrixAppserviceBridge.roomBridgeStoreMod.RoomBridgeStoreEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomUpgradeHandlerMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/room-upgrade-handler", "RoomUpgradeHandler")
  @js.native
  class RoomUpgradeHandler protected () extends StObject {
    /**
      * @param {RoomUpgradeHandler~Options} opts
      * @param {Bridge} bridge The parent bridge.
      */
    def this(opts: RoomUpgradeHandlerOpts, bridge: Bridge) = this()
    
    val bridge: js.Any = js.native
    
    var joinNewRoom: js.Any = js.native
    
    var migrateEntry: js.Any = js.native
    
    var migrateStoreEntries: js.Any = js.native
    
    /**
      * Called when an invite event reaches the bridge. This function
      * will check if the invite is from an upgraded room, and will
      * join the room if so.
      * @param ev A Matrix m.room.member event of membership=invite
      *           directed to the bridge bot
      * @return True if the invite is from an upgraded room and shouldn't
      * be processed.
      */
    def onInvite(ev: Roomid): js.Promise[Boolean] = js.native
    
    var onJoinedNewRoom: js.Any = js.native
    
    /**
      * Called when the bridge sees a "m.room.tombstone" event.
      * @param ev The m.room.tombstone event.
      */
    def onTombstone(ev: Sender): js.Promise[Boolean] = js.native
    
    val opts: js.Any = js.native
    
    var waitingForInvite: js.Any = js.native
  }
  
  @js.native
  trait RoomUpgradeHandlerOpts extends StObject {
    
    /**
      * Should upgrade and invite events be processed after being handled
      * by the RoomUpgradeHandler. Defaults to `false`.
      */
    var consumeEvent: Boolean = js.native
    
    /**
      * Invoked when iterating around a rooms entries. Should be used to update entries
      * with a new room id.
      *
      * @param entry The existing entry.
      * @param newRoomId The new roomId.
      * @return Return the entry to upsert it,
      * or null to ignore it.
      */
    var migrateEntry: js.UndefOr[
        js.Function2[
          /* entry */ RoomBridgeStoreEntry, 
          /* newRoomId */ String, 
          js.Promise[RoomBridgeStoreEntry | Null]
        ]
      ] = js.native
    
    /**
      * Should ghost users be migrated to the new room. This will leave
      * any users matching the user regex list in the registration file
      * from the old room, and join them to the new room.
      * Defaults to `true`
      */
    var migrateGhosts: Boolean = js.native
    
    /**
      * Migrate room store entries automatically. Defaults to `true`
      */
    var migrateStoreEntries: Boolean = js.native
    
    /**
      * Invoked after a room has been upgraded and it's entries updated.
      *
      * @param oldRoomId The old roomId.
      * @param newRoomId The new roomId.
      */
    var onRoomMigrated: js.UndefOr[
        js.Function2[/* oldRoomId */ String, /* newRoomId */ String, js.Promise[Unit] | Unit]
      ] = js.native
  }
  object RoomUpgradeHandlerOpts {
    
    @scala.inline
    def apply(consumeEvent: Boolean, migrateGhosts: Boolean, migrateStoreEntries: Boolean): RoomUpgradeHandlerOpts = {
      val __obj = js.Dynamic.literal(consumeEvent = consumeEvent.asInstanceOf[js.Any], migrateGhosts = migrateGhosts.asInstanceOf[js.Any], migrateStoreEntries = migrateStoreEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomUpgradeHandlerOpts]
    }
    
    @scala.inline
    implicit class RoomUpgradeHandlerOptsMutableBuilder[Self <: RoomUpgradeHandlerOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsumeEvent(value: Boolean): Self = StObject.set(x, "consumeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrateEntry(
        value: (/* entry */ RoomBridgeStoreEntry, /* newRoomId */ String) => js.Promise[RoomBridgeStoreEntry | Null]
      ): Self = StObject.set(x, "migrateEntry", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMigrateEntryUndefined: Self = StObject.set(x, "migrateEntry", js.undefined)
      
      @scala.inline
      def setMigrateGhosts(value: Boolean): Self = StObject.set(x, "migrateGhosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrateStoreEntries(value: Boolean): Self = StObject.set(x, "migrateStoreEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRoomMigrated(value: (/* oldRoomId */ String, /* newRoomId */ String) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRoomMigrated", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRoomMigratedUndefined: Self = StObject.set(x, "onRoomMigrated", js.undefined)
    }
  }
}
