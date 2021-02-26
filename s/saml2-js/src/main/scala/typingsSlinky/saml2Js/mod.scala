package typingsSlinky.saml2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("saml2-js", "IdentityProvider")
  @js.native
  class IdentityProvider protected () extends StObject {
    def this(options: IdentityProviderOptions) = this()
  }
  
  @JSImport("saml2-js", "ServiceProvider")
  @js.native
  class ServiceProvider protected () extends StObject {
    def this(options: ServiceProviderOptions) = this()
    
    def create_login_request_url(
      IdP: IdentityProvider,
      options: CreateLoginRequestUrlOptions,
      cb: js.Function3[/* error */ js.Any, /* login_url */ String, /* request_id */ String, Unit]
    ): Unit = js.native
    
    def create_logout_request_url(
      IdP: IdentityProvider,
      options: CreateLogoutRequestUrlOptions,
      cb: js.Function2[/* error */ js.Any, /* request_url */ String, Unit]
    ): Unit = js.native
    
    def create_logout_response_url(
      IdP: IdentityProvider,
      options: CreateLogoutResponseUrlOptions,
      cb: js.Function2[/* error */ js.Any, /* response_url */ String, Unit]
    ): Unit = js.native
    
    def create_metadata(): String = js.native
    
    def post_assert(
      IdP: IdentityProvider,
      options: GetAssertOptions,
      cb: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
    ): Unit = js.native
    
    def redirect_assert(
      IdP: IdentityProvider,
      options: GetAssertOptions,
      cb: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait AuthnContextClassRef extends StObject {
    
    var class_refs: js.Array[String] = js.native
    
    var comparison: String = js.native
  }
  object AuthnContextClassRef {
    
    @scala.inline
    def apply(class_refs: js.Array[String], comparison: String): AuthnContextClassRef = {
      val __obj = js.Dynamic.literal(class_refs = class_refs.asInstanceOf[js.Any], comparison = comparison.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthnContextClassRef]
    }
    
    @scala.inline
    implicit class AuthnContextClassRefMutableBuilder[Self <: AuthnContextClassRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass_refs(value: js.Array[String]): Self = StObject.set(x, "class_refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClass_refsVarargs(value: String*): Self = StObject.set(x, "class_refs", js.Array(value :_*))
      
      @scala.inline
      def setComparison(value: String): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateLoginRequestUrlOptions extends StObject {
    
    var auth_context: js.UndefOr[AuthnContextClassRef] = js.native
    
    var force_authn: js.UndefOr[Boolean] = js.native
    
    var nameid_format: js.UndefOr[String] = js.native
    
    var relay_state: js.UndefOr[String] = js.native
    
    var sign_get_request: js.UndefOr[Boolean] = js.native
  }
  object CreateLoginRequestUrlOptions {
    
    @scala.inline
    def apply(): CreateLoginRequestUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLoginRequestUrlOptions]
    }
    
    @scala.inline
    implicit class CreateLoginRequestUrlOptionsMutableBuilder[Self <: CreateLoginRequestUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth_context(value: AuthnContextClassRef): Self = StObject.set(x, "auth_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_contextUndefined: Self = StObject.set(x, "auth_context", js.undefined)
      
      @scala.inline
      def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      @scala.inline
      def setNameid_format(value: String): Self = StObject.set(x, "nameid_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameid_formatUndefined: Self = StObject.set(x, "nameid_format", js.undefined)
      
      @scala.inline
      def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      @scala.inline
      def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  @js.native
  trait CreateLogoutRequestUrlOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
    
    var name_id: js.UndefOr[String] = js.native
    
    var relay_state: js.UndefOr[String] = js.native
    
    var session_index: js.UndefOr[String] = js.native
    
    var sign_get_request: js.UndefOr[Boolean] = js.native
  }
  object CreateLogoutRequestUrlOptions {
    
    @scala.inline
    def apply(): CreateLogoutRequestUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
    }
    
    @scala.inline
    implicit class CreateLogoutRequestUrlOptionsMutableBuilder[Self <: CreateLogoutRequestUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      @scala.inline
      def setName_id(value: String): Self = StObject.set(x, "name_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName_idUndefined: Self = StObject.set(x, "name_id", js.undefined)
      
      @scala.inline
      def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      @scala.inline
      def setSession_index(value: String): Self = StObject.set(x, "session_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_indexUndefined: Self = StObject.set(x, "session_index", js.undefined)
      
      @scala.inline
      def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  @js.native
  trait CreateLogoutResponseUrlOptions extends StObject {
    
    var in_response_to: js.UndefOr[String] = js.native
    
    var relay_state: js.UndefOr[String] = js.native
    
    var sign_get_request: js.UndefOr[Boolean] = js.native
  }
  object CreateLogoutResponseUrlOptions {
    
    @scala.inline
    def apply(): CreateLogoutResponseUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateLogoutResponseUrlOptions]
    }
    
    @scala.inline
    implicit class CreateLogoutResponseUrlOptionsMutableBuilder[Self <: CreateLogoutResponseUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn_response_to(value: String): Self = StObject.set(x, "in_response_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn_response_toUndefined: Self = StObject.set(x, "in_response_to", js.undefined)
      
      @scala.inline
      def setRelay_state(value: String): Self = StObject.set(x, "relay_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelay_stateUndefined: Self = StObject.set(x, "relay_state", js.undefined)
      
      @scala.inline
      def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
  
  @js.native
  trait GetAssertOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
    
    var request_body: js.UndefOr[js.Any] = js.native
  }
  object GetAssertOptions {
    
    @scala.inline
    def apply(): GetAssertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAssertOptions]
    }
    
    @scala.inline
    implicit class GetAssertOptionsMutableBuilder[Self <: GetAssertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      @scala.inline
      def setRequest_body(value: js.Any): Self = StObject.set(x, "request_body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_bodyUndefined: Self = StObject.set(x, "request_body", js.undefined)
    }
  }
  
  @js.native
  trait IdentityProviderOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
    
    var certificates: js.Array[String] = js.native
    
    var force_authn: js.UndefOr[Boolean] = js.native
    
    var sign_get_request: js.UndefOr[Boolean] = js.native
    
    var sso_login_url: String = js.native
    
    var sso_logout_url: String = js.native
  }
  object IdentityProviderOptions {
    
    @scala.inline
    def apply(certificates: js.Array[String], sso_login_url: String, sso_logout_url: String): IdentityProviderOptions = {
      val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], sso_login_url = sso_login_url.asInstanceOf[js.Any], sso_logout_url = sso_logout_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityProviderOptions]
    }
    
    @scala.inline
    implicit class IdentityProviderOptionsMutableBuilder[Self <: IdentityProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      @scala.inline
      def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value :_*))
      
      @scala.inline
      def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      @scala.inline
      def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
      
      @scala.inline
      def setSso_login_url(value: String): Self = StObject.set(x, "sso_login_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSso_logout_url(value: String): Self = StObject.set(x, "sso_logout_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceProviderOptions extends StObject {
    
    var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
    
    var alt_certs: js.UndefOr[js.Array[String]] = js.native
    
    var alt_private_keys: js.UndefOr[js.Array[String]] = js.native
    
    var assert_endpoint: String = js.native
    
    var auth_context: js.UndefOr[AuthnContextClassRef] = js.native
    
    var certificate: String = js.native
    
    var entity_id: String = js.native
    
    var force_authn: js.UndefOr[Boolean] = js.native
    
    var nameid_format: js.UndefOr[String] = js.native
    
    var private_key: String = js.native
    
    var sign_get_request: js.UndefOr[Boolean] = js.native
  }
  object ServiceProviderOptions {
    
    @scala.inline
    def apply(assert_endpoint: String, certificate: String, entity_id: String, private_key: String): ServiceProviderOptions = {
      val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], entity_id = entity_id.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceProviderOptions]
    }
    
    @scala.inline
    implicit class ServiceProviderOptionsMutableBuilder[Self <: ServiceProviderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_unencrypted_assertion(value: Boolean): Self = StObject.set(x, "allow_unencrypted_assertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_unencrypted_assertionUndefined: Self = StObject.set(x, "allow_unencrypted_assertion", js.undefined)
      
      @scala.inline
      def setAlt_certs(value: js.Array[String]): Self = StObject.set(x, "alt_certs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlt_certsUndefined: Self = StObject.set(x, "alt_certs", js.undefined)
      
      @scala.inline
      def setAlt_certsVarargs(value: String*): Self = StObject.set(x, "alt_certs", js.Array(value :_*))
      
      @scala.inline
      def setAlt_private_keys(value: js.Array[String]): Self = StObject.set(x, "alt_private_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlt_private_keysUndefined: Self = StObject.set(x, "alt_private_keys", js.undefined)
      
      @scala.inline
      def setAlt_private_keysVarargs(value: String*): Self = StObject.set(x, "alt_private_keys", js.Array(value :_*))
      
      @scala.inline
      def setAssert_endpoint(value: String): Self = StObject.set(x, "assert_endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_context(value: AuthnContextClassRef): Self = StObject.set(x, "auth_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuth_contextUndefined: Self = StObject.set(x, "auth_context", js.undefined)
      
      @scala.inline
      def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntity_id(value: String): Self = StObject.set(x, "entity_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_authn(value: Boolean): Self = StObject.set(x, "force_authn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForce_authnUndefined: Self = StObject.set(x, "force_authn", js.undefined)
      
      @scala.inline
      def setNameid_format(value: String): Self = StObject.set(x, "nameid_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameid_formatUndefined: Self = StObject.set(x, "nameid_format", js.undefined)
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_get_request(value: Boolean): Self = StObject.set(x, "sign_get_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSign_get_requestUndefined: Self = StObject.set(x, "sign_get_request", js.undefined)
    }
  }
}
