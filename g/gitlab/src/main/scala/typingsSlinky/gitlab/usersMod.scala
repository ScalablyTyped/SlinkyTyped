package typingsSlinky.gitlab

import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.eventsMod.EventOptions
import typingsSlinky.gitlab.infrastructureMod.BaseService
import typingsSlinky.gitlab.requestHelperMod.BaseRequestOptions
import typingsSlinky.gitlab.requestHelperMod.GetResponse
import typingsSlinky.gitlab.requestHelperMod.PaginatedRequestOptions
import typingsSlinky.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersMod {
  
  @JSImport("gitlab/dist/types/core/services/Users", "Users")
  @js.native
  class Users () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def activities(): js.Promise[GetResponse] = js.native
    def activities(options: Sudo): js.Promise[GetResponse] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def block(userId: Double): js.Promise[js.Object] = js.native
    def block(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def current(): js.Promise[GetResponse] = js.native
    def current(options: Sudo): js.Promise[GetResponse] = js.native
    
    def edit(userId: Double): js.Promise[js.Object] = js.native
    def edit(userId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def events(userId: Double): js.Promise[GetResponse] = js.native
    def events(userId: Double, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
    
    def projects(userId: Double): js.Promise[GetResponse] = js.native
    def projects(userId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(userId: Double): js.Promise[js.Object] = js.native
    def remove(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def search(emailOrUsername: String): js.Promise[GetResponse] = js.native
    def search(emailOrUsername: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def show(userId: Double): js.Promise[GetResponse] = js.native
    def show(userId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def unblock(userId: Double): js.Promise[js.Object] = js.native
    def unblock(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  trait UserDetailSchema extends UserSchema {
    
    var bio: js.UndefOr[String] = js.native
    
    var created_at: js.Date = js.native
    
    var linkedin: String = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var organization: js.UndefOr[String] = js.native
    
    var public_email: String = js.native
    
    var skype: String = js.native
    
    var twitter: String = js.native
    
    var website_url: js.UndefOr[String] = js.native
  }
  object UserDetailSchema {
    
    @scala.inline
    def apply(
      avatar_url: String,
      created_at: js.Date,
      id: Double,
      linkedin: String,
      name: String,
      public_email: String,
      skype: String,
      state: String,
      twitter: String,
      username: String,
      web_url: String
    ): UserDetailSchema = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkedin = linkedin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public_email = public_email.asInstanceOf[js.Any], skype = skype.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDetailSchema]
    }
    
    @scala.inline
    implicit class UserDetailSchemaMutableBuilder[Self <: UserDetailSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
      
      @scala.inline
      def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedin(value: String): Self = StObject.set(x, "linkedin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      @scala.inline
      def setPublic_email(value: String): Self = StObject.set(x, "public_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkype(value: String): Self = StObject.set(x, "skype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsite_url(value: String): Self = StObject.set(x, "website_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsite_urlUndefined: Self = StObject.set(x, "website_url", js.undefined)
    }
  }
  
  @js.native
  trait UserSchema extends StObject {
    
    var avatar_url: String = js.native
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var state: String = js.native
    
    var username: String = js.native
    
    var web_url: String = js.native
  }
  object UserSchema {
    
    @scala.inline
    def apply(avatar_url: String, id: Double, name: String, state: String, username: String, web_url: String): UserSchema = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserSchema]
    }
    
    @scala.inline
    implicit class UserSchemaMutableBuilder[Self <: UserSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
    }
  }
}
