package typingsSlinky.googleapis

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.googleapisStrings.v1
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicebrokerV1Mod {
  
  object servicebrokerV1 {
    
    @JSImport("googleapis/build/src/apis/servicebroker/v1", "servicebroker_v1.Resource$V1")
    @js.native
    class ResourceV1 protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * servicebroker.getIamPolicy
        * @desc Gets the access control policy for a resource. Returns an empty
        * policy if the resource exists and does not have a policy set.
        * @alias servicebroker.getIamPolicy
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def getIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def getIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
      def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def getIamPolicy(params: ParamsResourceV1Getiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def getIamPolicy(params: ParamsResourceV1Getiampolicy, callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
      def getIamPolicy(
        params: ParamsResourceV1Getiampolicy,
        options: BodyResponseCallback[SchemaGoogleIamV1Policy],
        callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
      ): Unit = js.native
      def getIamPolicy(params: ParamsResourceV1Getiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def getIamPolicy(
        params: ParamsResourceV1Getiampolicy,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
      ): Unit = js.native
      
      /**
        * servicebroker.setIamPolicy
        * @desc Sets the access control policy on the specified resource. Replaces
        * any existing policy.
        * @alias servicebroker.setIamPolicy
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
        * @param {().GoogleIamV1__SetIamPolicyRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def setIamPolicy(): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def setIamPolicy(callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
      def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def setIamPolicy(params: ParamsResourceV1Setiampolicy): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def setIamPolicy(params: ParamsResourceV1Setiampolicy, callback: BodyResponseCallback[SchemaGoogleIamV1Policy]): Unit = js.native
      def setIamPolicy(
        params: ParamsResourceV1Setiampolicy,
        options: BodyResponseCallback[SchemaGoogleIamV1Policy],
        callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
      ): Unit = js.native
      def setIamPolicy(params: ParamsResourceV1Setiampolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1Policy] = js.native
      def setIamPolicy(
        params: ParamsResourceV1Setiampolicy,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleIamV1Policy]
      ): Unit = js.native
      
      /**
        * servicebroker.testIamPermissions
        * @desc Returns permissions that a caller has on the specified resource. If
        * the resource does not exist, this will return an empty set of
        * permissions, not a NOT_FOUND error.  Note: This operation is designed to
        * be used for building permission-aware UIs and command-line tools, not for
        * authorization checking. This operation may "fail open" without warning.
        * @alias servicebroker.testIamPermissions
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
        * @param {().GoogleIamV1__TestIamPermissionsRequest} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def testIamPermissions(): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
      def testIamPermissions(callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]): Unit = js.native
      def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
      def testIamPermissions(params: ParamsResourceV1Testiampermissions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
      def testIamPermissions(
        params: ParamsResourceV1Testiampermissions,
        callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
      ): Unit = js.native
      def testIamPermissions(
        params: ParamsResourceV1Testiampermissions,
        options: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse],
        callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
      ): Unit = js.native
      def testIamPermissions(params: ParamsResourceV1Testiampermissions, options: MethodOptions): GaxiosPromise[SchemaGoogleIamV1TestIamPermissionsResponse] = js.native
      def testIamPermissions(
        params: ParamsResourceV1Testiampermissions,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleIamV1TestIamPermissionsResponse]
      ): Unit = js.native
    }
    
    /**
      * Service Broker API
      *
      * The Google Cloud Platform Service Broker API provides Google hosted
      * implementation of the Open Service Broker API
      * (https://www.openservicebrokerapi.org/).
      *
      * @example
      * const {google} = require('googleapis');
      * const servicebroker = google.servicebroker('v1');
      *
      * @namespace servicebroker
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Servicebroker
      */
    @JSImport("googleapis/build/src/apis/servicebroker/v1", "servicebroker_v1.Servicebroker")
    @js.native
    class Servicebroker protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var v1: ResourceV1 = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v1 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v1): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceV1Getiampolicy extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * REQUIRED: The resource for which the policy is being requested. See the
        * operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.native
    }
    object ParamsResourceV1Getiampolicy {
      
      @scala.inline
      def apply(): ParamsResourceV1Getiampolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1Getiampolicy]
      }
      
      @scala.inline
      implicit class ParamsResourceV1GetiampolicyMutableBuilder[Self <: ParamsResourceV1Getiampolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceV1Setiampolicy extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGoogleIamV1SetIamPolicyRequest] = js.native
      
      /**
        * REQUIRED: The resource for which the policy is being specified. See the
        * operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.native
    }
    object ParamsResourceV1Setiampolicy {
      
      @scala.inline
      def apply(): ParamsResourceV1Setiampolicy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1Setiampolicy]
      }
      
      @scala.inline
      implicit class ParamsResourceV1SetiampolicyMutableBuilder[Self <: ParamsResourceV1Setiampolicy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaGoogleIamV1SetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceV1Testiampermissions extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaGoogleIamV1TestIamPermissionsRequest] = js.native
      
      /**
        * REQUIRED: The resource for which the policy detail is being requested.
        * See the operation documentation for the appropriate value for this field.
        */
      var resource: js.UndefOr[String] = js.native
    }
    object ParamsResourceV1Testiampermissions {
      
      @scala.inline
      def apply(): ParamsResourceV1Testiampermissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceV1Testiampermissions]
      }
      
      @scala.inline
      implicit class ParamsResourceV1TestiampermissionsMutableBuilder[Self <: ParamsResourceV1Testiampermissions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaGoogleIamV1TestIamPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
        
        @scala.inline
        def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    /**
      * Associates `members` with a `role`.
      */
    @js.native
    trait SchemaGoogleIamV1Binding extends StObject {
      
      /**
        * The condition that is associated with this binding. NOTE: an unsatisfied
        * condition will not allow user access via current binding. Different
        * bindings, including their conditions, are examined independently.
        */
      var condition: js.UndefOr[SchemaGoogleTypeExpr] = js.native
      
      /**
        * Specifies the identities requesting access for a Cloud Platform resource.
        * `members` can have the following values:  * `allUsers`: A special
        * identifier that represents anyone who is    on the internet; with or
        * without a Google account.  * `allAuthenticatedUsers`: A special
        * identifier that represents anyone    who is authenticated with a Google
        * account or a service account.  * `user:{emailid}`: An email address that
        * represents a specific Google    account. For example, `alice@gmail.com` .
        * * `serviceAccount:{emailid}`: An email address that represents a service
        * account. For example, `my-other-app@appspot.gserviceaccount.com`.  *
        * `group:{emailid}`: An email address that represents a Google group. For
        * example, `admins@example.com`.   * `domain:{domain}`: The G Suite domain
        * (primary) that represents all the    users of that domain. For example,
        * `google.com` or `example.com`.
        */
      var members: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Role that is assigned to `members`. For example, `roles/viewer`,
        * `roles/editor`, or `roles/owner`.
        */
      var role: js.UndefOr[String] = js.native
    }
    object SchemaGoogleIamV1Binding {
      
      @scala.inline
      def apply(): SchemaGoogleIamV1Binding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleIamV1Binding]
      }
      
      @scala.inline
      implicit class SchemaGoogleIamV1BindingMutableBuilder[Self <: SchemaGoogleIamV1Binding] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCondition(value: SchemaGoogleTypeExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
        
        @scala.inline
        def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
        
        @scala.inline
        def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      }
    }
    
    /**
      * Defines an Identity and Access Management (IAM) policy. It is used to
      * specify access control policies for Cloud Platform resources.   A `Policy`
      * consists of a list of `bindings`. A `binding` binds a list of `members` to
      * a `role`, where the members can be user accounts, Google groups, Google
      * domains, and service accounts. A `role` is a named list of permissions
      * defined by IAM.  **JSON Example**      {       &quot;bindings&quot;: [ {
      * &quot;role&quot;: &quot;roles/owner&quot;,           &quot;members&quot;: [
      * &quot;user:mike@example.com&quot;, &quot;group:admins@example.com&quot;,
      * &quot;domain:google.com&quot;,
      * &quot;serviceAccount:my-other-app@appspot.gserviceaccount.com&quot; ] }, {
      * &quot;role&quot;: &quot;roles/viewer&quot;,           &quot;members&quot;:
      * [&quot;user:sean@example.com&quot;]         }       ]     }  **YAML
      * Example**      bindings:     - members:       - user:mike@example.com -
      * group:admins@example.com       - domain:google.com       -
      * serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
      * roles/owner     - members:       - user:sean@example.com       role:
      * roles/viewer   For a description of IAM and its features, see the [IAM
      * developer&#39;s guide](https://cloud.google.com/iam/docs).
      */
    @js.native
    trait SchemaGoogleIamV1Policy extends StObject {
      
      /**
        * Associates a list of `members` to a `role`. `bindings` with no members
        * will result in an error.
        */
      var bindings: js.UndefOr[js.Array[SchemaGoogleIamV1Binding]] = js.native
      
      /**
        * `etag` is used for optimistic concurrency control as a way to help
        * prevent simultaneous updates of a policy from overwriting each other. It
        * is strongly suggested that systems make use of the `etag` in the
        * read-modify-write cycle to perform policy updates in order to avoid race
        * conditions: An `etag` is returned in the response to `getIamPolicy`, and
        * systems are expected to put that etag in the request to `setIamPolicy` to
        * ensure that their change will be applied to the same version of the
        * policy.  If no `etag` is provided in the call to `setIamPolicy`, then the
        * existing policy is overwritten blindly.
        */
      var etag: js.UndefOr[String] = js.native
      
      /**
        * Deprecated.
        */
      var version: js.UndefOr[Double] = js.native
    }
    object SchemaGoogleIamV1Policy {
      
      @scala.inline
      def apply(): SchemaGoogleIamV1Policy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleIamV1Policy]
      }
      
      @scala.inline
      implicit class SchemaGoogleIamV1PolicyMutableBuilder[Self <: SchemaGoogleIamV1Policy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBindings(value: js.Array[SchemaGoogleIamV1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
        
        @scala.inline
        def setBindingsVarargs(value: SchemaGoogleIamV1Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * Request message for `SetIamPolicy` method.
      */
    @js.native
    trait SchemaGoogleIamV1SetIamPolicyRequest extends StObject {
      
      /**
        * REQUIRED: The complete policy to be applied to the `resource`. The size
        * of the policy is limited to a few 10s of KB. An empty policy is a valid
        * policy but certain Cloud Platform services (such as Projects) might
        * reject them.
        */
      var policy: js.UndefOr[SchemaGoogleIamV1Policy] = js.native
    }
    object SchemaGoogleIamV1SetIamPolicyRequest {
      
      @scala.inline
      def apply(): SchemaGoogleIamV1SetIamPolicyRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleIamV1SetIamPolicyRequest]
      }
      
      @scala.inline
      implicit class SchemaGoogleIamV1SetIamPolicyRequestMutableBuilder[Self <: SchemaGoogleIamV1SetIamPolicyRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPolicy(value: SchemaGoogleIamV1Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      }
    }
    
    /**
      * Request message for `TestIamPermissions` method.
      */
    @js.native
    trait SchemaGoogleIamV1TestIamPermissionsRequest extends StObject {
      
      /**
        * The set of permissions to check for the `resource`. Permissions with
        * wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not allowed.
        * For more information see [IAM
        * Overview](https://cloud.google.com/iam/docs/overview#permissions).
        */
      var permissions: js.UndefOr[js.Array[String]] = js.native
    }
    object SchemaGoogleIamV1TestIamPermissionsRequest {
      
      @scala.inline
      def apply(): SchemaGoogleIamV1TestIamPermissionsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsRequest]
      }
      
      @scala.inline
      implicit class SchemaGoogleIamV1TestIamPermissionsRequestMutableBuilder[Self <: SchemaGoogleIamV1TestIamPermissionsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        @scala.inline
        def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      }
    }
    
    /**
      * Response message for `TestIamPermissions` method.
      */
    @js.native
    trait SchemaGoogleIamV1TestIamPermissionsResponse extends StObject {
      
      /**
        * A subset of `TestPermissionsRequest.permissions` that the caller is
        * allowed.
        */
      var permissions: js.UndefOr[js.Array[String]] = js.native
    }
    object SchemaGoogleIamV1TestIamPermissionsResponse {
      
      @scala.inline
      def apply(): SchemaGoogleIamV1TestIamPermissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsResponse]
      }
      
      @scala.inline
      implicit class SchemaGoogleIamV1TestIamPermissionsResponseMutableBuilder[Self <: SchemaGoogleIamV1TestIamPermissionsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        @scala.inline
        def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      }
    }
    
    /**
      * Represents an expression text. Example:      title: &quot;User account
      * presence&quot;     description: &quot;Determines whether the request has a
      * user account&quot;     expression: &quot;size(request.user) &gt; 0&quot;
      */
    @js.native
    trait SchemaGoogleTypeExpr extends StObject {
      
      /**
        * An optional description of the expression. This is a longer text which
        * describes the expression, e.g. when hovered over it in a UI.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * Textual representation of an expression in Common Expression Language
        * syntax.  The application context of the containing message determines
        * which well-known feature set of CEL is supported.
        */
      var expression: js.UndefOr[String] = js.native
      
      /**
        * An optional string indicating the location of the expression for error
        * reporting, e.g. a file name and a position in the file.
        */
      var location: js.UndefOr[String] = js.native
      
      /**
        * An optional title for the expression, i.e. a short string describing its
        * purpose. This can be used e.g. in UIs which allow to enter the
        * expression.
        */
      var title: js.UndefOr[String] = js.native
    }
    object SchemaGoogleTypeExpr {
      
      @scala.inline
      def apply(): SchemaGoogleTypeExpr = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleTypeExpr]
      }
      
      @scala.inline
      implicit class SchemaGoogleTypeExprMutableBuilder[Self <: SchemaGoogleTypeExpr] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.native
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.native
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.native
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.native
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.native
      
      /**
        * API key. Your API key identifies your project and provides you with API
        * access, quota, and reports. Required unless you provide an OAuth 2.0
        * token.
        */
      var key: js.UndefOr[String] = js.native
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.native
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.native
      
      /**
        * Available to use for quota purposes for server-side applications. Can be
        * any arbitrary string assigned to a user, but should not exceed 40
        * characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.native
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.native
    }
    object StandardParameters {
      
      @scala.inline
      def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      @scala.inline
      implicit class StandardParametersMutableBuilder[Self <: StandardParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        @scala.inline
        def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        @scala.inline
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        @scala.inline
        def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        @scala.inline
        def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        @scala.inline
        def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        @scala.inline
        def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        @scala.inline
        def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        @scala.inline
        def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
