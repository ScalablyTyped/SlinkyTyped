package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLookupDeveloperIdentityOutputMod {
  
  @js.native
  trait LookupDeveloperIdentityOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>This is the list of developer user identifiers associated with an identity ID. Cognito supports the association of multiple developer user identifiers with an identity ID.</p>
      */
    var DeveloperUserIdentifierList: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * <p>A unique identifier in the format REGION:GUID.</p>
      */
    var IdentityId: js.UndefOr[String] = js.native
    
    /**
      * <p>A pagination token. The first call you make will have <code>NextToken</code> set to null. After that the service will return <code>NextToken</code> values as needed. For example, let's say you make a request with <code>MaxResults</code> set to 10, and there are 20 matches in the database. The service will return a pagination token as a part of the response. This token can be used to call the API again and get results starting from the 11th match.</p>
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object LookupDeveloperIdentityOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): LookupDeveloperIdentityOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupDeveloperIdentityOutput]
    }
    
    @scala.inline
    implicit class LookupDeveloperIdentityOutputMutableBuilder[Self <: LookupDeveloperIdentityOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperUserIdentifierList(value: js.Array[String]): Self = StObject.set(x, "DeveloperUserIdentifierList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeveloperUserIdentifierListUndefined: Self = StObject.set(x, "DeveloperUserIdentifierList", js.undefined)
      
      @scala.inline
      def setDeveloperUserIdentifierListVarargs(value: String*): Self = StObject.set(x, "DeveloperUserIdentifierList", js.Array(value :_*))
      
      @scala.inline
      def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
}
