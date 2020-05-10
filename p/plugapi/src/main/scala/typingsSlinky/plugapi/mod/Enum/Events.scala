package typingsSlinky.plugapi.mod.Enum

import typingsSlinky.plugapi.plugapiStrings.advance
import typingsSlinky.plugapi.plugapiStrings.ban
import typingsSlinky.plugapi.plugapiStrings.boothLocked
import typingsSlinky.plugapi.plugapiStrings.chat
import typingsSlinky.plugapi.plugapiStrings.chatDelete
import typingsSlinky.plugapi.plugapiStrings.command
import typingsSlinky.plugapi.plugapiStrings.djListCycle
import typingsSlinky.plugapi.plugapiStrings.djListLocked
import typingsSlinky.plugapi.plugapiStrings.djListUpdate
import typingsSlinky.plugapi.plugapiStrings.earn
import typingsSlinky.plugapi.plugapiStrings.floodChat
import typingsSlinky.plugapi.plugapiStrings.followJoin
import typingsSlinky.plugapi.plugapiStrings.friendRequest
import typingsSlinky.plugapi.plugapiStrings.gifted
import typingsSlinky.plugapi.plugapiStrings.grab
import typingsSlinky.plugapi.plugapiStrings.killSession
import typingsSlinky.plugapi.plugapiStrings.modAddDJ
import typingsSlinky.plugapi.plugapiStrings.modAddWaitList
import typingsSlinky.plugapi.plugapiStrings.modAmbassador
import typingsSlinky.plugapi.plugapiStrings.modBan
import typingsSlinky.plugapi.plugapiStrings.modMoveDJ
import typingsSlinky.plugapi.plugapiStrings.modMute
import typingsSlinky.plugapi.plugapiStrings.modRemoveDJ
import typingsSlinky.plugapi.plugapiStrings.modRemoveWaitList
import typingsSlinky.plugapi.plugapiStrings.modSkip
import typingsSlinky.plugapi.plugapiStrings.modStaff
import typingsSlinky.plugapi.plugapiStrings.notify
import typingsSlinky.plugapi.plugapiStrings.pdjMessage
import typingsSlinky.plugapi.plugapiStrings.pdjUpdate
import typingsSlinky.plugapi.plugapiStrings.ping
import typingsSlinky.plugapi.plugapiStrings.playlistCycle
import typingsSlinky.plugapi.plugapiStrings.plugMaintenance
import typingsSlinky.plugapi.plugapiStrings.plugMaintenanceAlert
import typingsSlinky.plugapi.plugapiStrings.requestDuration
import typingsSlinky.plugapi.plugapiStrings.requestDurationRetry
import typingsSlinky.plugapi.plugapiStrings.roomChanged
import typingsSlinky.plugapi.plugapiStrings.roomDescriptionUpdate
import typingsSlinky.plugapi.plugapiStrings.roomJoin
import typingsSlinky.plugapi.plugapiStrings.roomMinChatLevelUpdate
import typingsSlinky.plugapi.plugapiStrings.roomNameUpdate
import typingsSlinky.plugapi.plugapiStrings.roomVoteSkip
import typingsSlinky.plugapi.plugapiStrings.roomWelcomeUpdate
import typingsSlinky.plugapi.plugapiStrings.sessionClose
import typingsSlinky.plugapi.plugapiStrings.skip
import typingsSlinky.plugapi.plugapiStrings.strobeToggle
import typingsSlinky.plugapi.plugapiStrings.userCounterUpdate
import typingsSlinky.plugapi.plugapiStrings.userFollow
import typingsSlinky.plugapi.plugapiStrings.userJoin
import typingsSlinky.plugapi.plugapiStrings.userLeave
import typingsSlinky.plugapi.plugapiStrings.userUpdate
import typingsSlinky.plugapi.plugapiStrings.vote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  var ADVANCE: advance = js.native
  var BAN: ban = js.native
  var BOOTH_LOCKED: boothLocked = js.native
  var CHAT: chat = js.native
  var CHAT_COMMAND: command = js.native
  var CHAT_DELETE: chatDelete = js.native
  var CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate = js.native
  var COMMAND: command = js.native
  var DJ_LIST_CYCLE: djListCycle = js.native
  var DJ_LIST_LOCKED: djListLocked = js.native
  var DJ_LIST_UPDATE: djListUpdate = js.native
  var EARN: earn = js.native
  var FLOOD_CHAT: floodChat = js.native
  var FOLLOW_JOIN: followJoin = js.native
  var FRIEND_REQUEST: friendRequest = js.native
  var GIFTED: gifted = js.native
  var GRAB: grab = js.native
  var KILL_SESSION: killSession = js.native
  var MAINT_MODE: plugMaintenance = js.native
  var MAINT_MODE_ALERT: plugMaintenanceAlert = js.native
  var MODERATE_ADD_DJ: modAddDJ = js.native
  var MODERATE_ADD_WAITLIST: modAddWaitList = js.native
  var MODERATE_AMBASSADOR: modAmbassador = js.native
  var MODERATE_BAN: modBan = js.native
  var MODERATE_MOVE_DJ: modMoveDJ = js.native
  var MODERATE_MUTE: modMute = js.native
  var MODERATE_REMOVE_DJ: modRemoveDJ = js.native
  var MODERATE_REMOVE_WAITLIST: modRemoveWaitList = js.native
  var MODERATE_SKIP: modSkip = js.native
  var MODERATE_STAFF: modStaff = js.native
  var NOTIFY: notify = js.native
  var PDJ_MESSAGE: pdjMessage = js.native
  var PDJ_UPDATE: pdjUpdate = js.native
  var PING: ping = js.native
  var PLAYLIST_CYCLE: playlistCycle = js.native
  var REQUEST_DURATION: requestDuration = js.native
  var REQUEST_DURATION_RETRY: requestDurationRetry = js.native
  var ROOM_CHANGE: roomChanged = js.native
  var ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate = js.native
  var ROOM_JOIN: roomJoin = js.native
  var ROOM_NAME_UPDATE: roomNameUpdate = js.native
  var ROOM_VOTE_SKIP: roomVoteSkip = js.native
  var ROOM_WELCOME_UPDATE: roomWelcomeUpdate = js.native
  var SESSION_CLOSE: sessionClose = js.native
  var SKIP: skip = js.native
  var STROBE_TOGGLE: strobeToggle = js.native
  var USER_COUNTER_UPDATE: userCounterUpdate = js.native
  var USER_FOLLOW: userFollow = js.native
  var USER_JOIN: userJoin = js.native
  var USER_LEAVE: userLeave = js.native
  var USER_UPDATE: userUpdate = js.native
  var VOTE: vote = js.native
}

object Events {
  @scala.inline
  def apply(
    ADVANCE: advance,
    BAN: ban,
    BOOTH_LOCKED: boothLocked,
    CHAT: chat,
    CHAT_COMMAND: command,
    CHAT_DELETE: chatDelete,
    CHAT_LEVEL_UPDATE: roomMinChatLevelUpdate,
    COMMAND: command,
    DJ_LIST_CYCLE: djListCycle,
    DJ_LIST_LOCKED: djListLocked,
    DJ_LIST_UPDATE: djListUpdate,
    EARN: earn,
    FLOOD_CHAT: floodChat,
    FOLLOW_JOIN: followJoin,
    FRIEND_REQUEST: friendRequest,
    GIFTED: gifted,
    GRAB: grab,
    KILL_SESSION: killSession,
    MAINT_MODE: plugMaintenance,
    MAINT_MODE_ALERT: plugMaintenanceAlert,
    MODERATE_ADD_DJ: modAddDJ,
    MODERATE_ADD_WAITLIST: modAddWaitList,
    MODERATE_AMBASSADOR: modAmbassador,
    MODERATE_BAN: modBan,
    MODERATE_MOVE_DJ: modMoveDJ,
    MODERATE_MUTE: modMute,
    MODERATE_REMOVE_DJ: modRemoveDJ,
    MODERATE_REMOVE_WAITLIST: modRemoveWaitList,
    MODERATE_SKIP: modSkip,
    MODERATE_STAFF: modStaff,
    NOTIFY: notify,
    PDJ_MESSAGE: pdjMessage,
    PDJ_UPDATE: pdjUpdate,
    PING: ping,
    PLAYLIST_CYCLE: playlistCycle,
    REQUEST_DURATION: requestDuration,
    REQUEST_DURATION_RETRY: requestDurationRetry,
    ROOM_CHANGE: roomChanged,
    ROOM_DESCRIPTION_UPDATE: roomDescriptionUpdate,
    ROOM_JOIN: roomJoin,
    ROOM_NAME_UPDATE: roomNameUpdate,
    ROOM_VOTE_SKIP: roomVoteSkip,
    ROOM_WELCOME_UPDATE: roomWelcomeUpdate,
    SESSION_CLOSE: sessionClose,
    SKIP: skip,
    STROBE_TOGGLE: strobeToggle,
    USER_COUNTER_UPDATE: userCounterUpdate,
    USER_FOLLOW: userFollow,
    USER_JOIN: userJoin,
    USER_LEAVE: userLeave,
    USER_UPDATE: userUpdate,
    VOTE: vote
  ): Events = {
    val __obj = js.Dynamic.literal(ADVANCE = ADVANCE.asInstanceOf[js.Any], BAN = BAN.asInstanceOf[js.Any], BOOTH_LOCKED = BOOTH_LOCKED.asInstanceOf[js.Any], CHAT = CHAT.asInstanceOf[js.Any], CHAT_COMMAND = CHAT_COMMAND.asInstanceOf[js.Any], CHAT_DELETE = CHAT_DELETE.asInstanceOf[js.Any], CHAT_LEVEL_UPDATE = CHAT_LEVEL_UPDATE.asInstanceOf[js.Any], COMMAND = COMMAND.asInstanceOf[js.Any], DJ_LIST_CYCLE = DJ_LIST_CYCLE.asInstanceOf[js.Any], DJ_LIST_LOCKED = DJ_LIST_LOCKED.asInstanceOf[js.Any], DJ_LIST_UPDATE = DJ_LIST_UPDATE.asInstanceOf[js.Any], EARN = EARN.asInstanceOf[js.Any], FLOOD_CHAT = FLOOD_CHAT.asInstanceOf[js.Any], FOLLOW_JOIN = FOLLOW_JOIN.asInstanceOf[js.Any], FRIEND_REQUEST = FRIEND_REQUEST.asInstanceOf[js.Any], GIFTED = GIFTED.asInstanceOf[js.Any], GRAB = GRAB.asInstanceOf[js.Any], KILL_SESSION = KILL_SESSION.asInstanceOf[js.Any], MAINT_MODE = MAINT_MODE.asInstanceOf[js.Any], MAINT_MODE_ALERT = MAINT_MODE_ALERT.asInstanceOf[js.Any], MODERATE_ADD_DJ = MODERATE_ADD_DJ.asInstanceOf[js.Any], MODERATE_ADD_WAITLIST = MODERATE_ADD_WAITLIST.asInstanceOf[js.Any], MODERATE_AMBASSADOR = MODERATE_AMBASSADOR.asInstanceOf[js.Any], MODERATE_BAN = MODERATE_BAN.asInstanceOf[js.Any], MODERATE_MOVE_DJ = MODERATE_MOVE_DJ.asInstanceOf[js.Any], MODERATE_MUTE = MODERATE_MUTE.asInstanceOf[js.Any], MODERATE_REMOVE_DJ = MODERATE_REMOVE_DJ.asInstanceOf[js.Any], MODERATE_REMOVE_WAITLIST = MODERATE_REMOVE_WAITLIST.asInstanceOf[js.Any], MODERATE_SKIP = MODERATE_SKIP.asInstanceOf[js.Any], MODERATE_STAFF = MODERATE_STAFF.asInstanceOf[js.Any], NOTIFY = NOTIFY.asInstanceOf[js.Any], PDJ_MESSAGE = PDJ_MESSAGE.asInstanceOf[js.Any], PDJ_UPDATE = PDJ_UPDATE.asInstanceOf[js.Any], PING = PING.asInstanceOf[js.Any], PLAYLIST_CYCLE = PLAYLIST_CYCLE.asInstanceOf[js.Any], REQUEST_DURATION = REQUEST_DURATION.asInstanceOf[js.Any], REQUEST_DURATION_RETRY = REQUEST_DURATION_RETRY.asInstanceOf[js.Any], ROOM_CHANGE = ROOM_CHANGE.asInstanceOf[js.Any], ROOM_DESCRIPTION_UPDATE = ROOM_DESCRIPTION_UPDATE.asInstanceOf[js.Any], ROOM_JOIN = ROOM_JOIN.asInstanceOf[js.Any], ROOM_NAME_UPDATE = ROOM_NAME_UPDATE.asInstanceOf[js.Any], ROOM_VOTE_SKIP = ROOM_VOTE_SKIP.asInstanceOf[js.Any], ROOM_WELCOME_UPDATE = ROOM_WELCOME_UPDATE.asInstanceOf[js.Any], SESSION_CLOSE = SESSION_CLOSE.asInstanceOf[js.Any], SKIP = SKIP.asInstanceOf[js.Any], STROBE_TOGGLE = STROBE_TOGGLE.asInstanceOf[js.Any], USER_COUNTER_UPDATE = USER_COUNTER_UPDATE.asInstanceOf[js.Any], USER_FOLLOW = USER_FOLLOW.asInstanceOf[js.Any], USER_JOIN = USER_JOIN.asInstanceOf[js.Any], USER_LEAVE = USER_LEAVE.asInstanceOf[js.Any], USER_UPDATE = USER_UPDATE.asInstanceOf[js.Any], VOTE = VOTE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADVANCE(value: advance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADVANCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBAN(value: ban): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBOOTH_LOCKED(value: boothLocked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOOTH_LOCKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHAT(value: chat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHAT_COMMAND(value: command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHAT_COMMAND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHAT_DELETE(value: chatDelete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHAT_DELETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHAT_LEVEL_UPDATE(value: roomMinChatLevelUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHAT_LEVEL_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMMAND(value: command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMMAND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDJ_LIST_CYCLE(value: djListCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DJ_LIST_CYCLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDJ_LIST_LOCKED(value: djListLocked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DJ_LIST_LOCKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDJ_LIST_UPDATE(value: djListUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DJ_LIST_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEARN(value: earn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLOOD_CHAT(value: floodChat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLOOD_CHAT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOLLOW_JOIN(value: followJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOLLOW_JOIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFRIEND_REQUEST(value: friendRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRIEND_REQUEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGIFTED(value: gifted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GIFTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRAB(value: grab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRAB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKILL_SESSION(value: killSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KILL_SESSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAINT_MODE(value: plugMaintenance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAINT_MODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAINT_MODE_ALERT(value: plugMaintenanceAlert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAINT_MODE_ALERT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_ADD_DJ(value: modAddDJ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_ADD_DJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_ADD_WAITLIST(value: modAddWaitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_ADD_WAITLIST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_AMBASSADOR(value: modAmbassador): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_AMBASSADOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_BAN(value: modBan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_BAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_MOVE_DJ(value: modMoveDJ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_MOVE_DJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_MUTE(value: modMute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_MUTE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_REMOVE_DJ(value: modRemoveDJ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_REMOVE_DJ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_REMOVE_WAITLIST(value: modRemoveWaitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_REMOVE_WAITLIST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_SKIP(value: modSkip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_SKIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATE_STAFF(value: modStaff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATE_STAFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOTIFY(value: notify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOTIFY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDJ_MESSAGE(value: pdjMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDJ_MESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDJ_UPDATE(value: pdjUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDJ_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPING(value: ping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPLAYLIST_CYCLE(value: playlistCycle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLAYLIST_CYCLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUEST_DURATION(value: requestDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_DURATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUEST_DURATION_RETRY(value: requestDurationRetry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_DURATION_RETRY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOM_CHANGE(value: roomChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOM_CHANGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOM_DESCRIPTION_UPDATE(value: roomDescriptionUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOM_DESCRIPTION_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOM_JOIN(value: roomJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOM_JOIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOM_NAME_UPDATE(value: roomNameUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOM_NAME_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOM_VOTE_SKIP(value: roomVoteSkip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOM_VOTE_SKIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOM_WELCOME_UPDATE(value: roomWelcomeUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOM_WELCOME_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSESSION_CLOSE(value: sessionClose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SESSION_CLOSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSKIP(value: skip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTROBE_TOGGLE(value: strobeToggle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STROBE_TOGGLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSER_COUNTER_UPDATE(value: userCounterUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_COUNTER_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSER_FOLLOW(value: userFollow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_FOLLOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSER_JOIN(value: userJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_JOIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSER_LEAVE(value: userLeave): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_LEAVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSER_UPDATE(value: userUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVOTE(value: vote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VOTE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

