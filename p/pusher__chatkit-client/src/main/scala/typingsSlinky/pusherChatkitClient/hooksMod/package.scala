package typingsSlinky.pusherChatkitClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  type ReadCursorHook = js.Function1[
    /* cursor */ typingsSlinky.pusherChatkitClient.roomMod.PusherReadCursor, 
    scala.Unit
  ]
  type RoomHook = js.Function1[/* room */ typingsSlinky.pusherChatkitClient.roomMod.PusherRoom, scala.Unit]
  type RoomUserHook = js.Function2[
    /* room */ typingsSlinky.pusherChatkitClient.roomMod.PusherRoom, 
    /* user */ typingsSlinky.pusherChatkitClient.userMod.PusherUser, 
    scala.Unit
  ]
  type UserHook = js.Function1[/* room */ typingsSlinky.pusherChatkitClient.userMod.PusherUser, scala.Unit]
  type UserPresenceHook = js.Function2[
    /* state */ typingsSlinky.pusherChatkitClient.hooksMod.UserPresenceState, 
    /* user */ typingsSlinky.pusherChatkitClient.userMod.PusherUser, 
    scala.Unit
  ]
}
