package typingsSlinky.maximMazurokGapiClientIamcredentials

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientIamcredentials.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientIamcredentials.anon.Alt
import typingsSlinky.maximMazurokGapiClientIamcredentials.anon.Callback
import typingsSlinky.maximMazurokGapiClientIamcredentials.anon.Fields
import typingsSlinky.maximMazurokGapiClientIamcredentials.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object iamcredentials {
      
      @js.native
      trait GenerateAccessTokenRequest extends StObject {
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.native
        
        /**
          * The desired lifetime duration of the access token in seconds. By default, the maximum allowed value is 1 hour. To set a lifetime of up to 12 hours, you can add the service account
          * as an allowed value in an Organization Policy that enforces the `constraints/iam.allowServiceAccountCredentialLifetimeExtension` constraint. See detailed instructions at
          * https://cloud.google.com/iam/help/credentials/lifetime If a value is not specified, the token's lifetime will be set to a default value of 1 hour.
          */
        var lifetime: js.UndefOr[String] = js.native
        
        /**
          * Required. Code to identify the scopes to be included in the OAuth 2.0 access token. See https://developers.google.com/identity/protocols/googlescopes for more information. At least
          * one value required.
          */
        var scope: js.UndefOr[js.Array[String]] = js.native
      }
      object GenerateAccessTokenRequest {
        
        @scala.inline
        def apply(): GenerateAccessTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateAccessTokenRequest]
        }
        
        @scala.inline
        implicit class GenerateAccessTokenRequestMutableBuilder[Self <: GenerateAccessTokenRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          @scala.inline
          def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
          
          @scala.inline
          def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
          
          @scala.inline
          def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          @scala.inline
          def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
        }
      }
      
      @js.native
      trait GenerateAccessTokenResponse extends StObject {
        
        /** The OAuth 2.0 access token. */
        var accessToken: js.UndefOr[String] = js.native
        
        /** Token expiration time. The expiration time is always set. */
        var expireTime: js.UndefOr[String] = js.native
      }
      object GenerateAccessTokenResponse {
        
        @scala.inline
        def apply(): GenerateAccessTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateAccessTokenResponse]
        }
        
        @scala.inline
        implicit class GenerateAccessTokenResponseMutableBuilder[Self <: GenerateAccessTokenResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
          
          @scala.inline
          def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
        }
      }
      
      @js.native
      trait GenerateIdTokenRequest extends StObject {
        
        /** Required. The audience for the token, such as the API or account that this token grants access to. */
        var audience: js.UndefOr[String] = js.native
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.native
        
        /** Include the service account email in the token. If set to `true`, the token will contain `email` and `email_verified` claims. */
        var includeEmail: js.UndefOr[Boolean] = js.native
      }
      object GenerateIdTokenRequest {
        
        @scala.inline
        def apply(): GenerateIdTokenRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateIdTokenRequest]
        }
        
        @scala.inline
        implicit class GenerateIdTokenRequestMutableBuilder[Self <: GenerateIdTokenRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
          
          @scala.inline
          def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          @scala.inline
          def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
          
          @scala.inline
          def setIncludeEmail(value: Boolean): Self = StObject.set(x, "includeEmail", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIncludeEmailUndefined: Self = StObject.set(x, "includeEmail", js.undefined)
        }
      }
      
      @js.native
      trait GenerateIdTokenResponse extends StObject {
        
        /** The OpenId Connect ID token. */
        var token: js.UndefOr[String] = js.native
      }
      object GenerateIdTokenResponse {
        
        @scala.inline
        def apply(): GenerateIdTokenResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GenerateIdTokenResponse]
        }
        
        @scala.inline
        implicit class GenerateIdTokenResponseMutableBuilder[Self <: GenerateIdTokenResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      @js.native
      trait ProjectsResource extends StObject {
        
        var serviceAccounts: ServiceAccountsResource = js.native
      }
      object ProjectsResource {
        
        @scala.inline
        def apply(serviceAccounts: ServiceAccountsResource): ProjectsResource = {
          val __obj = js.Dynamic.literal(serviceAccounts = serviceAccounts.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProjectsResource]
        }
        
        @scala.inline
        implicit class ProjectsResourceMutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setServiceAccounts(value: ServiceAccountsResource): Self = StObject.set(x, "serviceAccounts", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ServiceAccountsResource extends StObject {
        
        /** Generates an OAuth 2.0 access token for a service account. */
        def generateAccessToken(request: Accesstoken): Request[GenerateAccessTokenResponse] = js.native
        def generateAccessToken(request: Alt, body: GenerateAccessTokenRequest): Request[GenerateAccessTokenResponse] = js.native
        
        def generateIdToken(request: Alt, body: GenerateIdTokenRequest): Request[GenerateIdTokenResponse] = js.native
        /** Generates an OpenID Connect ID token for a service account. */
        def generateIdToken(request: Callback): Request[GenerateIdTokenResponse] = js.native
        
        def signBlob(request: Alt, body: SignBlobRequest): Request[SignBlobResponse] = js.native
        /** Signs a blob using a service account's system-managed private key. */
        def signBlob(request: Fields): Request[SignBlobResponse] = js.native
        
        def signJwt(request: Alt, body: SignJwtRequest): Request[SignJwtResponse] = js.native
        /** Signs a JWT using a service account's system-managed private key. */
        def signJwt(request: Key): Request[SignJwtResponse] = js.native
      }
      
      @js.native
      trait SignBlobRequest extends StObject {
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.native
        
        /** Required. The bytes to sign. */
        var payload: js.UndefOr[String] = js.native
      }
      object SignBlobRequest {
        
        @scala.inline
        def apply(): SignBlobRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignBlobRequest]
        }
        
        @scala.inline
        implicit class SignBlobRequestMutableBuilder[Self <: SignBlobRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          @scala.inline
          def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
          
          @scala.inline
          def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        }
      }
      
      @js.native
      trait SignBlobResponse extends StObject {
        
        /**
          * The ID of the key used to sign the blob. The key used for signing will remain valid for at least 12 hours after the blob is signed. To verify the signature, you can retrieve the
          * public key in several formats from the following endpoints: - RSA public key wrapped in an X.509 v3 certificate:
          * `https://www.googleapis.com/service_accounts/v1/metadata/x509/{ACCOUNT_EMAIL}` - Raw key in JSON format:
          * `https://www.googleapis.com/service_accounts/v1/metadata/raw/{ACCOUNT_EMAIL}` - JSON Web Key (JWK): `https://www.googleapis.com/service_accounts/v1/metadata/jwk/{ACCOUNT_EMAIL}`
          */
        var keyId: js.UndefOr[String] = js.native
        
        /**
          * The signature for the blob. Does not include the original blob. After the key pair referenced by the `key_id` response field expires, Google no longer exposes the public key that
          * can be used to verify the blob. As a result, the receiver can no longer verify the signature.
          */
        var signedBlob: js.UndefOr[String] = js.native
      }
      object SignBlobResponse {
        
        @scala.inline
        def apply(): SignBlobResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignBlobResponse]
        }
        
        @scala.inline
        implicit class SignBlobResponseMutableBuilder[Self <: SignBlobResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
          
          @scala.inline
          def setSignedBlob(value: String): Self = StObject.set(x, "signedBlob", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSignedBlobUndefined: Self = StObject.set(x, "signedBlob", js.undefined)
        }
      }
      
      @js.native
      trait SignJwtRequest extends StObject {
        
        /**
          * The sequence of service accounts in a delegation chain. Each service account must be granted the `roles/iam.serviceAccountTokenCreator` role on its next service account in the
          * chain. The last service account in the chain must be granted the `roles/iam.serviceAccountTokenCreator` role on the service account that is specified in the `name` field of the
          * request. The delegates must have the following format: `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-` wildcard character is required; replacing it with a project
          * ID is invalid.
          */
        var delegates: js.UndefOr[js.Array[String]] = js.native
        
        /**
          * Required. The JWT payload to sign. Must be a serialized JSON object that contains a JWT Claims Set. For example: `{"sub": "user@example.com", "iat": 313435}` If the JWT Claims Set
          * contains an expiration time (`exp`) claim, it must be an integer timestamp that is not in the past and no more than 12 hours in the future.
          */
        var payload: js.UndefOr[String] = js.native
      }
      object SignJwtRequest {
        
        @scala.inline
        def apply(): SignJwtRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignJwtRequest]
        }
        
        @scala.inline
        implicit class SignJwtRequestMutableBuilder[Self <: SignJwtRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDelegates(value: js.Array[String]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
          
          @scala.inline
          def setDelegatesVarargs(value: String*): Self = StObject.set(x, "delegates", js.Array(value :_*))
          
          @scala.inline
          def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        }
      }
      
      @js.native
      trait SignJwtResponse extends StObject {
        
        /**
          * The ID of the key used to sign the JWT. The key used for signing will remain valid for at least 12 hours after the JWT is signed. To verify the signature, you can retrieve the
          * public key in several formats from the following endpoints: - RSA public key wrapped in an X.509 v3 certificate:
          * `https://www.googleapis.com/service_accounts/v1/metadata/x509/{ACCOUNT_EMAIL}` - Raw key in JSON format:
          * `https://www.googleapis.com/service_accounts/v1/metadata/raw/{ACCOUNT_EMAIL}` - JSON Web Key (JWK): `https://www.googleapis.com/service_accounts/v1/metadata/jwk/{ACCOUNT_EMAIL}`
          */
        var keyId: js.UndefOr[String] = js.native
        
        /**
          * The signed JWT. Contains the automatically generated header; the client-supplied payload; and the signature, which is generated using the key referenced by the `kid` field in the
          * header. After the key pair referenced by the `key_id` response field expires, Google no longer exposes the public key that can be used to verify the JWT. As a result, the receiver
          * can no longer verify the signature.
          */
        var signedJwt: js.UndefOr[String] = js.native
      }
      object SignJwtResponse {
        
        @scala.inline
        def apply(): SignJwtResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SignJwtResponse]
        }
        
        @scala.inline
        implicit class SignJwtResponseMutableBuilder[Self <: SignJwtResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
          
          @scala.inline
          def setSignedJwt(value: String): Self = StObject.set(x, "signedJwt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSignedJwtUndefined: Self = StObject.set(x, "signedJwt", js.undefined)
        }
      }
    }
  }
}
