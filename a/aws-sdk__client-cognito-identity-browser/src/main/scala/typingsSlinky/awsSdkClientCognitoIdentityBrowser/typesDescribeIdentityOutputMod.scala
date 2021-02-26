package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeIdentityOutputMod {
  
  @js.native
  trait DescribeIdentityOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>Date on which the identity was created.</p>
      */
    var CreationDate: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
    
    /**
      * <p>Date on which the identity was last modified.</p>
      */
    var LastModifiedDate: js.UndefOr[js.Date] = js.native
    
    /**
      * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
      */
    var Logins: js.UndefOr[js.Array[String]] = js.native
  }
  object DescribeIdentityOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DescribeIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeIdentityOutput]
    }
    
    @scala.inline
    implicit class DescribeIdentityOutputMutableBuilder[Self <: DescribeIdentityOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
      
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
