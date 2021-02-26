package typingsSlinky.nodecredstash

import typingsSlinky.nodecredstash.mod.CredstashContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Context extends StObject {
    
    var context: js.UndefOr[CredstashContext] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var name: String = js.native
  }
  object Context {
    
    @scala.inline
    def apply(name: String): Context = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CredstashContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NameVersion extends StObject {
    
    var name: String = js.native
    
    var version: Double = js.native
  }
  object NameVersion {
    
    @scala.inline
    def apply(name: String, version: Double): NameVersion = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameVersion]
    }
    
    @scala.inline
    implicit class NameVersionMutableBuilder[Self <: NameVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Secret extends StObject {
    
    var secret: String = js.native
    
    var version: String = js.native
  }
  object Secret {
    
    @scala.inline
    def apply(secret: String, version: String): Secret = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Secret]
    }
    
    @scala.inline
    implicit class SecretMutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartsWith extends StObject {
    
    var context: js.UndefOr[CredstashContext] = js.native
    
    var startsWith: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object StartsWith {
    
    @scala.inline
    def apply(): StartsWith = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartsWith]
    }
    
    @scala.inline
    implicit class StartsWithMutableBuilder[Self <: StartsWith] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CredstashContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setStartsWith(value: String): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Version extends StObject {
    
    var context: js.UndefOr[CredstashContext] = js.native
    
    var name: String = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object Version {
    
    @scala.inline
    def apply(name: String): Version = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: CredstashContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
