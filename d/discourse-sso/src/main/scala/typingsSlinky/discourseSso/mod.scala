package typingsSlinky.discourseSso

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("discourse-sso", JSImport.Namespace)
  @js.native
  class ^ protected () extends DiscourseSSO {
    def this(ssoSecret: String) = this()
  }
  
  @js.native
  trait DiscourseSSO extends StObject {
    
    def buildLoginString(params: UserParams): String = js.native
    
    def getNonce(payload: String): String = js.native
    
    def validate(payload: String, sig: String): Boolean = js.native
  }
  object DiscourseSSO {
    
    @scala.inline
    def apply(
      buildLoginString: UserParams => String,
      getNonce: String => String,
      validate: (String, String) => Boolean
    ): DiscourseSSO = {
      val __obj = js.Dynamic.literal(buildLoginString = js.Any.fromFunction1(buildLoginString), getNonce = js.Any.fromFunction1(getNonce), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[DiscourseSSO]
    }
    
    @scala.inline
    implicit class DiscourseSSOMutableBuilder[Self <: DiscourseSSO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildLoginString(value: UserParams => String): Self = StObject.set(x, "buildLoginString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNonce(value: String => String): Self = StObject.set(x, "getNonce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidate(value: (String, String) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait UserParams extends StObject {
    
    var add_groups: js.UndefOr[js.Array[String]] = js.native
    
    var admin: js.UndefOr[Boolean] = js.native
    
    var avatar_url: js.UndefOr[String] = js.native
    
    var email: String = js.native
    
    var external_id: String = js.native
    
    var moderator: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nonce: String = js.native
    
    var remove_groups: js.UndefOr[js.Array[String]] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object UserParams {
    
    @scala.inline
    def apply(email: String, external_id: String, nonce: String): UserParams = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserParams]
    }
    
    @scala.inline
    implicit class UserParamsMutableBuilder[Self <: UserParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd_groups(value: js.Array[String]): Self = StObject.set(x, "add_groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdd_groupsUndefined: Self = StObject.set(x, "add_groups", js.undefined)
      
      @scala.inline
      def setAdd_groupsVarargs(value: String*): Self = StObject.set(x, "add_groups", js.Array(value :_*))
      
      @scala.inline
      def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      @scala.inline
      def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModerator(value: Boolean): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeratorUndefined: Self = StObject.set(x, "moderator", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove_groups(value: js.Array[String]): Self = StObject.set(x, "remove_groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove_groupsUndefined: Self = StObject.set(x, "remove_groups", js.undefined)
      
      @scala.inline
      def setRemove_groupsVarargs(value: String*): Self = StObject.set(x, "remove_groups", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
