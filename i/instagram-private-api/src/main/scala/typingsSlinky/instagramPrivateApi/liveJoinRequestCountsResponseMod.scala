package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveJoinRequestCountsResponseMod {
  
  @js.native
  trait LiveJoinRequestCountsResponseRootObject extends StObject {
    
    var fetch_ts: Double = js.native
    
    var num_new_requests: Double = js.native
    
    var num_total_requests: Double = js.native
    
    var num_unseen_requests: Double = js.native
    
    var status: String = js.native
    
    var users: js.Array[LiveJoinRequestCountsResponseUsersItem] = js.native
  }
  object LiveJoinRequestCountsResponseRootObject {
    
    @scala.inline
    def apply(
      fetch_ts: Double,
      num_new_requests: Double,
      num_total_requests: Double,
      num_unseen_requests: Double,
      status: String,
      users: js.Array[LiveJoinRequestCountsResponseUsersItem]
    ): LiveJoinRequestCountsResponseRootObject = {
      val __obj = js.Dynamic.literal(fetch_ts = fetch_ts.asInstanceOf[js.Any], num_new_requests = num_new_requests.asInstanceOf[js.Any], num_total_requests = num_total_requests.asInstanceOf[js.Any], num_unseen_requests = num_unseen_requests.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveJoinRequestCountsResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveJoinRequestCountsResponseRootObjectMutableBuilder[Self <: LiveJoinRequestCountsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch_ts(value: Double): Self = StObject.set(x, "fetch_ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_new_requests(value: Double): Self = StObject.set(x, "num_new_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_total_requests(value: Double): Self = StObject.set(x, "num_total_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_unseen_requests(value: Double): Self = StObject.set(x, "num_unseen_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[LiveJoinRequestCountsResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: LiveJoinRequestCountsResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LiveJoinRequestCountsResponseUsersItem extends StObject {
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var live_with_eligibility: String = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object LiveJoinRequestCountsResponseUsersItem {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      live_with_eligibility: String,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): LiveJoinRequestCountsResponseUsersItem = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], live_with_eligibility = live_with_eligibility.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveJoinRequestCountsResponseUsersItem]
    }
    
    @scala.inline
    implicit class LiveJoinRequestCountsResponseUsersItemMutableBuilder[Self <: LiveJoinRequestCountsResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLive_with_eligibility(value: String): Self = StObject.set(x, "live_with_eligibility", value.asInstanceOf[js.Any])
      
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
