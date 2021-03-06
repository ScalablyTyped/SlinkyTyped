package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadRepositoryUpdateTitleResponseMod {
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseActionLog extends StObject {
    
    var bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem] = js.native
    
    var description: String = js.native
    
    var text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem] = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseActionLog {
    
    @scala.inline
    def apply(
      bold: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem],
      description: String,
      text_attributes: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
    ): DirectThreadRepositoryUpdateTitleResponseActionLog = {
      val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], text_attributes = text_attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseActionLog]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseActionLogMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseActionLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: js.Array[DirectThreadRepositoryUpdateTitleResponseBoldItem]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldVarargs(value: DirectThreadRepositoryUpdateTitleResponseBoldItem*): Self = StObject.set(x, "bold", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText_attributes(value: js.Array[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]): Self = StObject.set(x, "text_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText_attributesVarargs(value: DirectThreadRepositoryUpdateTitleResponseTextAttributesItem*): Self = StObject.set(x, "text_attributes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseBoldItem extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseBoldItem {
    
    @scala.inline
    def apply(end: Double, start: Double): DirectThreadRepositoryUpdateTitleResponseBoldItem = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseBoldItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseBoldItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseBoldItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean = js.native
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      blocking: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): DirectThreadRepositoryUpdateTitleResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseFriendshipStatusMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseInviter extends StObject {
    
    var allowed_commenter_type: String = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var reel_auto_archive: String = js.native
    
    var username: String = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseInviter {
    
    @scala.inline
    def apply(
      allowed_commenter_type: String,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      username: String
    ): DirectThreadRepositoryUpdateTitleResponseInviter = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseInviter]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseInviterMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseInviter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseItemsItem extends StObject {
    
    var action_log: DirectThreadRepositoryUpdateTitleResponseActionLog = js.native
    
    var item_id: String = js.native
    
    var item_type: String = js.native
    
    var timestamp: String = js.native
    
    var user_id: Double = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseItemsItem {
    
    @scala.inline
    def apply(
      action_log: DirectThreadRepositoryUpdateTitleResponseActionLog,
      item_id: String,
      item_type: String,
      timestamp: String,
      user_id: Double
    ): DirectThreadRepositoryUpdateTitleResponseItemsItem = {
      val __obj = js.Dynamic.literal(action_log = action_log.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseItemsItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseItemsItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_log(value: DirectThreadRepositoryUpdateTitleResponseActionLog): Self = StObject.set(x, "action_log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseLastPermanentItem extends StObject {
    
    var action_log: DirectThreadRepositoryUpdateTitleResponseActionLog = js.native
    
    var item_id: String = js.native
    
    var item_type: String = js.native
    
    var timestamp: String = js.native
    
    var user_id: Double = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseLastPermanentItem {
    
    @scala.inline
    def apply(
      action_log: DirectThreadRepositoryUpdateTitleResponseActionLog,
      item_id: String,
      item_type: String,
      timestamp: String,
      user_id: Double
    ): DirectThreadRepositoryUpdateTitleResponseLastPermanentItem = {
      val __obj = js.Dynamic.literal(action_log = action_log.asInstanceOf[js.Any], item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseLastPermanentItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseLastPermanentItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction_log(value: DirectThreadRepositoryUpdateTitleResponseActionLog): Self = StObject.set(x, "action_log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var thread: DirectThreadRepositoryUpdateTitleResponseThread = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseRootObject {
    
    @scala.inline
    def apply(status: String, thread: DirectThreadRepositoryUpdateTitleResponseThread): DirectThreadRepositoryUpdateTitleResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseRootObject]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseRootObjectMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread(value: DirectThreadRepositoryUpdateTitleResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseTextAttributesItem extends StObject {
    
    var bold: Double = js.native
    
    var color: String = js.native
    
    var end: Double = js.native
    
    var intent: String = js.native
    
    var start: Double = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseTextAttributesItem {
    
    @scala.inline
    def apply(bold: Double, color: String, end: Double, intent: String, start: Double): DirectThreadRepositoryUpdateTitleResponseTextAttributesItem = {
      val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseTextAttributesItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseTextAttributesItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseTextAttributesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseThread extends StObject {
    
    var admin_user_ids: js.Array[Double] = js.native
    
    var approval_required_for_new_members: Boolean = js.native
    
    var archived: Boolean = js.native
    
    var business_thread_folder: Double = js.native
    
    var canonical: Boolean = js.native
    
    var folder: Double = js.native
    
    var has_newer: Boolean = js.native
    
    var has_older: Boolean = js.native
    
    var input_mode: Double = js.native
    
    var inviter: DirectThreadRepositoryUpdateTitleResponseInviter = js.native
    
    var is_group: Boolean = js.native
    
    var is_pin: Boolean = js.native
    
    var items: js.Array[DirectThreadRepositoryUpdateTitleResponseItemsItem] = js.native
    
    var last_activity_at: String = js.native
    
    var last_permanent_item: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem = js.native
    
    var last_seen_at: js.Any = js.native
    
    var left_users: js.Array[_] = js.native
    
    var mentions_muted: Boolean = js.native
    
    var muted: Boolean = js.native
    
    var named: Boolean = js.native
    
    var newest_cursor: String = js.native
    
    var next_cursor: String = js.native
    
    var oldest_cursor: String = js.native
    
    var pending: Boolean = js.native
    
    var pending_score: String = js.native
    
    var prev_cursor: String = js.native
    
    var read_state: Double = js.native
    
    var thread_id: String = js.native
    
    var thread_title: String = js.native
    
    var thread_type: String = js.native
    
    var thread_v2_id: String = js.native
    
    var users: js.Array[DirectThreadRepositoryUpdateTitleResponseUsersItem] = js.native
    
    var valued_request: Boolean = js.native
    
    var vc_muted: Boolean = js.native
    
    var viewer_id: Double = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseThread {
    
    @scala.inline
    def apply(
      admin_user_ids: js.Array[Double],
      approval_required_for_new_members: Boolean,
      archived: Boolean,
      business_thread_folder: Double,
      canonical: Boolean,
      folder: Double,
      has_newer: Boolean,
      has_older: Boolean,
      input_mode: Double,
      inviter: DirectThreadRepositoryUpdateTitleResponseInviter,
      is_group: Boolean,
      is_pin: Boolean,
      items: js.Array[DirectThreadRepositoryUpdateTitleResponseItemsItem],
      last_activity_at: String,
      last_permanent_item: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem,
      last_seen_at: js.Any,
      left_users: js.Array[_],
      mentions_muted: Boolean,
      muted: Boolean,
      named: Boolean,
      newest_cursor: String,
      next_cursor: String,
      oldest_cursor: String,
      pending: Boolean,
      pending_score: String,
      prev_cursor: String,
      read_state: Double,
      thread_id: String,
      thread_title: String,
      thread_type: String,
      thread_v2_id: String,
      users: js.Array[DirectThreadRepositoryUpdateTitleResponseUsersItem],
      valued_request: Boolean,
      vc_muted: Boolean,
      viewer_id: Double
    ): DirectThreadRepositoryUpdateTitleResponseThread = {
      val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], approval_required_for_new_members = approval_required_for_new_members.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], business_thread_folder = business_thread_folder.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], input_mode = input_mode.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], next_cursor = next_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], read_state = read_state.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseThread]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseThreadMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseThread] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin_user_ids(value: js.Array[Double]): Self = StObject.set(x, "admin_user_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmin_user_idsVarargs(value: Double*): Self = StObject.set(x, "admin_user_ids", js.Array(value :_*))
      
      @scala.inline
      def setApproval_required_for_new_members(value: Boolean): Self = StObject.set(x, "approval_required_for_new_members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness_thread_folder(value: Double): Self = StObject.set(x, "business_thread_folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_newer(value: Boolean): Self = StObject.set(x, "has_newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_mode(value: Double): Self = StObject.set(x, "input_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviter(value: DirectThreadRepositoryUpdateTitleResponseInviter): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_group(value: Boolean): Self = StObject.set(x, "is_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pin(value: Boolean): Self = StObject.set(x, "is_pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[DirectThreadRepositoryUpdateTitleResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: DirectThreadRepositoryUpdateTitleResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLast_activity_at(value: String): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_permanent_item(value: DirectThreadRepositoryUpdateTitleResponseLastPermanentItem): Self = StObject.set(x, "last_permanent_item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_seen_at(value: js.Any): Self = StObject.set(x, "last_seen_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_users(value: js.Array[_]): Self = StObject.set(x, "left_users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_usersVarargs(value: js.Any*): Self = StObject.set(x, "left_users", js.Array(value :_*))
      
      @scala.inline
      def setMentions_muted(value: Boolean): Self = StObject.set(x, "mentions_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewest_cursor(value: String): Self = StObject.set(x, "newest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_score(value: String): Self = StObject.set(x, "pending_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_cursor(value: String): Self = StObject.set(x, "prev_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_state(value: Double): Self = StObject.set(x, "read_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_v2_id(value: String): Self = StObject.set(x, "thread_v2_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[DirectThreadRepositoryUpdateTitleResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: DirectThreadRepositoryUpdateTitleResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      @scala.inline
      def setValued_request(value: Boolean): Self = StObject.set(x, "valued_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVc_muted(value: Boolean): Self = StObject.set(x, "vc_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryUpdateTitleResponseUsersItem extends StObject {
    
    var friendship_status: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_directapp_installed: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_using_unified_inbox_for_direct: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object DirectThreadRepositoryUpdateTitleResponseUsersItem {
    
    @scala.inline
    def apply(
      friendship_status: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_directapp_installed: Boolean,
      is_private: Boolean,
      is_using_unified_inbox_for_direct: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): DirectThreadRepositoryUpdateTitleResponseUsersItem = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryUpdateTitleResponseUsersItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryUpdateTitleResponseUsersItemMutableBuilder[Self <: DirectThreadRepositoryUpdateTitleResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: DirectThreadRepositoryUpdateTitleResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_directapp_installed(value: Boolean): Self = StObject.set(x, "is_directapp_installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_using_unified_inbox_for_direct(value: Boolean): Self = StObject.set(x, "is_using_unified_inbox_for_direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
