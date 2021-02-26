package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directRepositoryRankedRecipientsResponseMod {
  
  @js.native
  trait DirectRepositoryRankedRecipientsResponseRankedRecipientsItem extends StObject {
    
    var thread: js.UndefOr[DirectRepositoryRankedRecipientsResponseThread] = js.native
    
    var user: js.UndefOr[DirectRepositoryRankedRecipientsResponseUser] = js.native
  }
  object DirectRepositoryRankedRecipientsResponseRankedRecipientsItem {
    
    @scala.inline
    def apply(): DirectRepositoryRankedRecipientsResponseRankedRecipientsItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]
    }
    
    @scala.inline
    implicit class DirectRepositoryRankedRecipientsResponseRankedRecipientsItemMutableBuilder[Self <: DirectRepositoryRankedRecipientsResponseRankedRecipientsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThread(value: DirectRepositoryRankedRecipientsResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadUndefined: Self = StObject.set(x, "thread", js.undefined)
      
      @scala.inline
      def setUser(value: DirectRepositoryRankedRecipientsResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait DirectRepositoryRankedRecipientsResponseRootObject extends StObject {
    
    var expires: Double = js.native
    
    var filtered: Boolean = js.native
    
    var rank_token: String = js.native
    
    var ranked_recipients: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem] = js.native
    
    var request_id: String = js.native
    
    var status: String = js.native
  }
  object DirectRepositoryRankedRecipientsResponseRootObject {
    
    @scala.inline
    def apply(
      expires: Double,
      filtered: Boolean,
      rank_token: String,
      ranked_recipients: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem],
      request_id: String,
      status: String
    ): DirectRepositoryRankedRecipientsResponseRootObject = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], ranked_recipients = ranked_recipients.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRootObject]
    }
    
    @scala.inline
    implicit class DirectRepositoryRankedRecipientsResponseRootObjectMutableBuilder[Self <: DirectRepositoryRankedRecipientsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltered(value: Boolean): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanked_recipients(value: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]): Self = StObject.set(x, "ranked_recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanked_recipientsVarargs(value: DirectRepositoryRankedRecipientsResponseRankedRecipientsItem*): Self = StObject.set(x, "ranked_recipients", js.Array(value :_*))
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectRepositoryRankedRecipientsResponseThread extends StObject {
    
    var canonical: Boolean = js.native
    
    var named: Boolean = js.native
    
    var pending: Boolean = js.native
    
    var thread_id: String = js.native
    
    var thread_title: String = js.native
    
    var thread_type: String = js.native
    
    var users: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem] = js.native
    
    var viewer_id: Double = js.native
  }
  object DirectRepositoryRankedRecipientsResponseThread {
    
    @scala.inline
    def apply(
      canonical: Boolean,
      named: Boolean,
      pending: Boolean,
      thread_id: String,
      thread_title: String,
      thread_type: String,
      users: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem],
      viewer_id: Double
    ): DirectRepositoryRankedRecipientsResponseThread = {
      val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseThread]
    }
    
    @scala.inline
    implicit class DirectRepositoryRankedRecipientsResponseThreadMutableBuilder[Self <: DirectRepositoryRankedRecipientsResponseThread] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[DirectRepositoryRankedRecipientsResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: DirectRepositoryRankedRecipientsResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      @scala.inline
      def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectRepositoryRankedRecipientsResponseUser extends StObject {
    
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
  object DirectRepositoryRankedRecipientsResponseUser {
    
    @scala.inline
    def apply(
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
    ): DirectRepositoryRankedRecipientsResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseUser]
    }
    
    @scala.inline
    implicit class DirectRepositoryRankedRecipientsResponseUserMutableBuilder[Self <: DirectRepositoryRankedRecipientsResponseUser] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait DirectRepositoryRankedRecipientsResponseUsersItem extends StObject {
    
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
  object DirectRepositoryRankedRecipientsResponseUsersItem {
    
    @scala.inline
    def apply(
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
    ): DirectRepositoryRankedRecipientsResponseUsersItem = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseUsersItem]
    }
    
    @scala.inline
    implicit class DirectRepositoryRankedRecipientsResponseUsersItemMutableBuilder[Self <: DirectRepositoryRankedRecipientsResponseUsersItem] (val x: Self) extends AnyVal {
      
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
