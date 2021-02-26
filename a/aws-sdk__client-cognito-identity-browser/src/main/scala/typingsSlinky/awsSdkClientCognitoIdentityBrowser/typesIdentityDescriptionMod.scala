package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIdentityDescriptionMod {
  
  @js.native
  trait IdentityDescription extends StObject {
    
    /**
      * <p>Date on which the identity was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
    
    /**
      * <p>Date on which the identity was last modified.</p>
      */
    var LastModifiedDate: js.UndefOr[js.Date | String | Double] = js.native
    
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    var Logins: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  }
  object IdentityDescription {
    
    @scala.inline
    def apply(): IdentityDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityDescription]
    }
    
    @scala.inline
    implicit class IdentityDescriptionMutableBuilder[Self <: IdentityDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: js.Date | String | Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: js.Date | String | Double): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setLogins(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginsIterable(value: js.Iterable[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
      
      @scala.inline
      def setLoginsVarargs(value: String*): Self = StObject.set(x, "Logins", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledIdentityDescription extends IdentityDescription {
    
    /**
      * <p>Date on which the identity was created.</p>
      */
    @JSName("CreationDate")
    var CreationDate_UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>Date on which the identity was last modified.</p>
      */
    @JSName("LastModifiedDate")
    var LastModifiedDate_UnmarshalledIdentityDescription: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    @JSName("Logins")
    var Logins_UnmarshalledIdentityDescription: js.UndefOr[js.Array[String]] = js.native
  }
  object UnmarshalledIdentityDescription {
    
    @scala.inline
    def apply(): UnmarshalledIdentityDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledIdentityDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledIdentityDescriptionMutableBuilder[Self <: UnmarshalledIdentityDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
      
      @scala.inline
      def setLogins(value: js.Array[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
      
      @scala.inline
      def setLoginsVarargs(value: String*): Self = StObject.set(x, "Logins", js.Array(value :_*))
    }
  }
}
