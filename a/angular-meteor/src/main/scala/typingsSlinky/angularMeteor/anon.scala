package typingsSlinky.angularMeteor

import typingsSlinky.angularMeteor.mod.meteor.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bind extends StObject {
    
    /**
      * @param scope - The scope the document will be bound to.
      * @param model - The name of the scope's model variable that the document will be bound to.
      */
    def bind(scope: IScope, model: String): Unit = js.native
  }
  object Bind {
    
    @scala.inline
    def apply(bind: (IScope, String) => Unit): Bind = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind))
      __obj.asInstanceOf[Bind]
    }
    
    @scala.inline
    implicit class BindMutableBuilder[Self <: Bind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: (IScope, String) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: String = js.native
  }
  object Email {
    
    @scala.inline
    def apply(email: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var password: String = js.native
    
    var profile: js.UndefOr[js.Object] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object Password {
    
    @scala.inline
    def apply(password: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: js.Object): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait Username extends StObject {
    
    var username: String = js.native
  }
  object Username {
    
    @scala.inline
    def apply(username: String): Username = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    @scala.inline
    implicit class UsernameMutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
