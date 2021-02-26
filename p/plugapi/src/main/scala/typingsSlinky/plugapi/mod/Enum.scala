package typingsSlinky.plugapi.mod

import typingsSlinky.plugapi.plugapiStrings.advance
import typingsSlinky.plugapi.plugapiStrings.ban
import typingsSlinky.plugapi.plugapiStrings.boothLocked
import typingsSlinky.plugapi.plugapiStrings.chat
import typingsSlinky.plugapi.plugapiStrings.chatDelete
import typingsSlinky.plugapi.plugapiStrings.command
import typingsSlinky.plugapi.plugapiStrings.d
import typingsSlinky.plugapi.plugapiStrings.djListCycle
import typingsSlinky.plugapi.plugapiStrings.djListLocked
import typingsSlinky.plugapi.plugapiStrings.djListUpdate
import typingsSlinky.plugapi.plugapiStrings.earn
import typingsSlinky.plugapi.plugapiStrings.f
import typingsSlinky.plugapi.plugapiStrings.floodChat
import typingsSlinky.plugapi.plugapiStrings.followJoin
import typingsSlinky.plugapi.plugapiStrings.friendRequest
import typingsSlinky.plugapi.plugapiStrings.gifted
import typingsSlinky.plugapi.plugapiStrings.grab
import typingsSlinky.plugapi.plugapiStrings.h
import typingsSlinky.plugapi.plugapiStrings.killSession
import typingsSlinky.plugapi.plugapiStrings.l
import typingsSlinky.plugapi.plugapiStrings.m
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
import typingsSlinky.plugapi.plugapiStrings.s
import typingsSlinky.plugapi.plugapiStrings.sessionClose
import typingsSlinky.plugapi.plugapiStrings.skip
import typingsSlinky.plugapi.plugapiStrings.strobeToggle
import typingsSlinky.plugapi.plugapiStrings.userCounterUpdate
import typingsSlinky.plugapi.plugapiStrings.userFollow
import typingsSlinky.plugapi.plugapiStrings.userJoin
import typingsSlinky.plugapi.plugapiStrings.userLeave
import typingsSlinky.plugapi.plugapiStrings.userUpdate
import typingsSlinky.plugapi.plugapiStrings.vote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Enum {
  
  @js.native
  trait Ban extends StObject {
    
    var DAY: d = js.native
    
    var HOUR: h = js.native
    
    var PERMA: f = js.native
  }
  object Ban {
    
    @scala.inline
    def apply(DAY: d, HOUR: h, PERMA: f): Ban = {
      val __obj = js.Dynamic.literal(DAY = DAY.asInstanceOf[js.Any], HOUR = HOUR.asInstanceOf[js.Any], PERMA = PERMA.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ban]
    }
    
    @scala.inline
    implicit class BanMutableBuilder[Self <: Ban] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDAY(value: d): Self = StObject.set(x, "DAY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOUR(value: h): Self = StObject.set(x, "HOUR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPERMA(value: f): Self = StObject.set(x, "PERMA", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BanReason extends StObject {
    
    var INAPPROPRIATE_GENRE: Double = js.native
    
    var NEGATIVE_ATTITUDE: Double = js.native
    
    var OFFENSIVE_MEDIA: Double = js.native
    
    var SPAMMING_TROLLING: Double = js.native
    
    var VERBAL_ABUSE: Double = js.native
  }
  object BanReason {
    
    @scala.inline
    def apply(
      INAPPROPRIATE_GENRE: Double,
      NEGATIVE_ATTITUDE: Double,
      OFFENSIVE_MEDIA: Double,
      SPAMMING_TROLLING: Double,
      VERBAL_ABUSE: Double
    ): BanReason = {
      val __obj = js.Dynamic.literal(INAPPROPRIATE_GENRE = INAPPROPRIATE_GENRE.asInstanceOf[js.Any], NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_MEDIA = OFFENSIVE_MEDIA.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any])
      __obj.asInstanceOf[BanReason]
    }
    
    @scala.inline
    implicit class BanReasonMutableBuilder[Self <: BanReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setINAPPROPRIATE_GENRE(value: Double): Self = StObject.set(x, "INAPPROPRIATE_GENRE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNEGATIVE_ATTITUDE(value: Double): Self = StObject.set(x, "NEGATIVE_ATTITUDE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOFFENSIVE_MEDIA(value: Double): Self = StObject.set(x, "OFFENSIVE_MEDIA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPAMMING_TROLLING(value: Double): Self = StObject.set(x, "SPAMMING_TROLLING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERBAL_ABUSE(value: Double): Self = StObject.set(x, "VERBAL_ABUSE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Events extends StObject {
    
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
    implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADVANCE(value: advance): Self = StObject.set(x, "ADVANCE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBAN(value: ban): Self = StObject.set(x, "BAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOTH_LOCKED(value: boothLocked): Self = StObject.set(x, "BOOTH_LOCKED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT(value: chat): Self = StObject.set(x, "CHAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT_COMMAND(value: command): Self = StObject.set(x, "CHAT_COMMAND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT_DELETE(value: chatDelete): Self = StObject.set(x, "CHAT_DELETE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHAT_LEVEL_UPDATE(value: roomMinChatLevelUpdate): Self = StObject.set(x, "CHAT_LEVEL_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOMMAND(value: command): Self = StObject.set(x, "COMMAND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJ_LIST_CYCLE(value: djListCycle): Self = StObject.set(x, "DJ_LIST_CYCLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJ_LIST_LOCKED(value: djListLocked): Self = StObject.set(x, "DJ_LIST_LOCKED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJ_LIST_UPDATE(value: djListUpdate): Self = StObject.set(x, "DJ_LIST_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEARN(value: earn): Self = StObject.set(x, "EARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFLOOD_CHAT(value: floodChat): Self = StObject.set(x, "FLOOD_CHAT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFOLLOW_JOIN(value: followJoin): Self = StObject.set(x, "FOLLOW_JOIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFRIEND_REQUEST(value: friendRequest): Self = StObject.set(x, "FRIEND_REQUEST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGIFTED(value: gifted): Self = StObject.set(x, "GIFTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGRAB(value: grab): Self = StObject.set(x, "GRAB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKILL_SESSION(value: killSession): Self = StObject.set(x, "KILL_SESSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAINT_MODE(value: plugMaintenance): Self = StObject.set(x, "MAINT_MODE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAINT_MODE_ALERT(value: plugMaintenanceAlert): Self = StObject.set(x, "MAINT_MODE_ALERT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_ADD_DJ(value: modAddDJ): Self = StObject.set(x, "MODERATE_ADD_DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_ADD_WAITLIST(value: modAddWaitList): Self = StObject.set(x, "MODERATE_ADD_WAITLIST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_AMBASSADOR(value: modAmbassador): Self = StObject.set(x, "MODERATE_AMBASSADOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_BAN(value: modBan): Self = StObject.set(x, "MODERATE_BAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_MOVE_DJ(value: modMoveDJ): Self = StObject.set(x, "MODERATE_MOVE_DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_MUTE(value: modMute): Self = StObject.set(x, "MODERATE_MUTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_REMOVE_DJ(value: modRemoveDJ): Self = StObject.set(x, "MODERATE_REMOVE_DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_REMOVE_WAITLIST(value: modRemoveWaitList): Self = StObject.set(x, "MODERATE_REMOVE_WAITLIST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_SKIP(value: modSkip): Self = StObject.set(x, "MODERATE_SKIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODERATE_STAFF(value: modStaff): Self = StObject.set(x, "MODERATE_STAFF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOTIFY(value: notify): Self = StObject.set(x, "NOTIFY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDJ_MESSAGE(value: pdjMessage): Self = StObject.set(x, "PDJ_MESSAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDJ_UPDATE(value: pdjUpdate): Self = StObject.set(x, "PDJ_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPING(value: ping): Self = StObject.set(x, "PING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLAYLIST_CYCLE(value: playlistCycle): Self = StObject.set(x, "PLAYLIST_CYCLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUEST_DURATION(value: requestDuration): Self = StObject.set(x, "REQUEST_DURATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREQUEST_DURATION_RETRY(value: requestDurationRetry): Self = StObject.set(x, "REQUEST_DURATION_RETRY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_CHANGE(value: roomChanged): Self = StObject.set(x, "ROOM_CHANGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_DESCRIPTION_UPDATE(value: roomDescriptionUpdate): Self = StObject.set(x, "ROOM_DESCRIPTION_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_JOIN(value: roomJoin): Self = StObject.set(x, "ROOM_JOIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_NAME_UPDATE(value: roomNameUpdate): Self = StObject.set(x, "ROOM_NAME_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_VOTE_SKIP(value: roomVoteSkip): Self = StObject.set(x, "ROOM_VOTE_SKIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROOM_WELCOME_UPDATE(value: roomWelcomeUpdate): Self = StObject.set(x, "ROOM_WELCOME_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSESSION_CLOSE(value: sessionClose): Self = StObject.set(x, "SESSION_CLOSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSKIP(value: skip): Self = StObject.set(x, "SKIP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTROBE_TOGGLE(value: strobeToggle): Self = StObject.set(x, "STROBE_TOGGLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_COUNTER_UPDATE(value: userCounterUpdate): Self = StObject.set(x, "USER_COUNTER_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_FOLLOW(value: userFollow): Self = StObject.set(x, "USER_FOLLOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_JOIN(value: userJoin): Self = StObject.set(x, "USER_JOIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_LEAVE(value: userLeave): Self = StObject.set(x, "USER_LEAVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_UPDATE(value: userUpdate): Self = StObject.set(x, "USER_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVOTE(value: vote): Self = StObject.set(x, "VOTE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalRole extends StObject {
    
    var ADMIN: Double = js.native
    
    var AMBASSADOR: Double = js.native
    
    var LEADER: Double = js.native
    
    var NONE: Double = js.native
    
    var VOLUNTEER: Double = js.native
  }
  object GlobalRole {
    
    @scala.inline
    def apply(ADMIN: Double, AMBASSADOR: Double, LEADER: Double, NONE: Double, VOLUNTEER: Double): GlobalRole = {
      val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], AMBASSADOR = AMBASSADOR.asInstanceOf[js.Any], LEADER = LEADER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], VOLUNTEER = VOLUNTEER.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalRole]
    }
    
    @scala.inline
    implicit class GlobalRoleMutableBuilder[Self <: GlobalRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADMIN(value: Double): Self = StObject.set(x, "ADMIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAMBASSADOR(value: Double): Self = StObject.set(x, "AMBASSADOR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEADER(value: Double): Self = StObject.set(x, "LEADER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVOLUNTEER(value: Double): Self = StObject.set(x, "VOLUNTEER", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mute extends StObject {
    
    var LONG: l = js.native
    
    var MEDIUM: m = js.native
    
    var SHORT: s = js.native
  }
  object Mute {
    
    @scala.inline
    def apply(LONG: l, MEDIUM: m, SHORT: s): Mute = {
      val __obj = js.Dynamic.literal(LONG = LONG.asInstanceOf[js.Any], MEDIUM = MEDIUM.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mute]
    }
    
    @scala.inline
    implicit class MuteMutableBuilder[Self <: Mute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLONG(value: l): Self = StObject.set(x, "LONG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEDIUM(value: m): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHORT(value: s): Self = StObject.set(x, "SHORT", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MuteReason extends StObject {
    
    var NEGATIVE_ATTITUDE: Double = js.native
    
    var OFFENSIVE_LANGUAGE: Double = js.native
    
    var SPAMMING_TROLLING: Double = js.native
    
    var VERBAL_ABUSE: Double = js.native
    
    var VIOLATING_COMMUNITY_RULES: Double = js.native
  }
  object MuteReason {
    
    @scala.inline
    def apply(
      NEGATIVE_ATTITUDE: Double,
      OFFENSIVE_LANGUAGE: Double,
      SPAMMING_TROLLING: Double,
      VERBAL_ABUSE: Double,
      VIOLATING_COMMUNITY_RULES: Double
    ): MuteReason = {
      val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any], VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuteReason]
    }
    
    @scala.inline
    implicit class MuteReasonMutableBuilder[Self <: MuteReason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNEGATIVE_ATTITUDE(value: Double): Self = StObject.set(x, "NEGATIVE_ATTITUDE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOFFENSIVE_LANGUAGE(value: Double): Self = StObject.set(x, "OFFENSIVE_LANGUAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSPAMMING_TROLLING(value: Double): Self = StObject.set(x, "SPAMMING_TROLLING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVERBAL_ABUSE(value: Double): Self = StObject.set(x, "VERBAL_ABUSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIOLATING_COMMUNITY_RULES(value: Double): Self = StObject.set(x, "VIOLATING_COMMUNITY_RULES", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoomRole extends StObject {
    
    var BOUNCER: Double = js.native
    
    var COHOST: Double = js.native
    
    var HOST: Double = js.native
    
    var MANAGER: Double = js.native
    
    var NONE: Double = js.native
    
    var RESIDENTDJ: Double = js.native
  }
  object RoomRole {
    
    @scala.inline
    def apply(BOUNCER: Double, COHOST: Double, HOST: Double, MANAGER: Double, NONE: Double, RESIDENTDJ: Double): RoomRole = {
      val __obj = js.Dynamic.literal(BOUNCER = BOUNCER.asInstanceOf[js.Any], COHOST = COHOST.asInstanceOf[js.Any], HOST = HOST.asInstanceOf[js.Any], MANAGER = MANAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RESIDENTDJ = RESIDENTDJ.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomRole]
    }
    
    @scala.inline
    implicit class RoomRoleMutableBuilder[Self <: RoomRole] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBOUNCER(value: Double): Self = StObject.set(x, "BOUNCER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOHOST(value: Double): Self = StObject.set(x, "COHOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHOST(value: Double): Self = StObject.set(x, "HOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMANAGER(value: Double): Self = StObject.set(x, "MANAGER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESIDENTDJ(value: Double): Self = StObject.set(x, "RESIDENTDJ", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Status extends StObject {
    
    var OFFLINE: Double = js.native
    
    var ONLINE: Double = js.native
  }
  object Status {
    
    @scala.inline
    def apply(OFFLINE: Double, ONLINE: Double): Status = {
      val __obj = js.Dynamic.literal(OFFLINE = OFFLINE.asInstanceOf[js.Any], ONLINE = ONLINE.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOFFLINE(value: Double): Self = StObject.set(x, "OFFLINE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setONLINE(value: Double): Self = StObject.set(x, "ONLINE", value.asInstanceOf[js.Any])
    }
  }
}
