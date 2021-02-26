package typingsSlinky.googleapis

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.anon.Body
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

object groupsmigrationV1Mod {
  
  object groupsmigrationV1 {
    
    /**
      * Groups Migration API
      *
      * Groups Migration Api.
      *
      * @example
      * const {google} = require('googleapis');
      * const groupsmigration = google.groupsmigration('v1');
      *
      * @namespace groupsmigration
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Groupsmigration
      */
    @JSImport("googleapis/build/src/apis/groupsmigration/v1", "groupsmigration_v1.Groupsmigration")
    @js.native
    class Groupsmigration protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var archive: ResourceArchive = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/groupsmigration/v1", "groupsmigration_v1.Resource$Archive")
    @js.native
    class ResourceArchive protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * groupsmigration.archive.insert
        * @desc Inserts a new mail into the archive of the Google group.
        * @alias groupsmigration.archive.insert
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.groupId The group ID
        * @param {object} params.media Media object
        * @param {string} params.media.mimeType Media mime-type
        * @param {string|object} params.media.body Media body contents
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def insert(): GaxiosPromise[SchemaGroups] = js.native
      def insert(callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def insert(params: ParamsResourceArchiveInsert): GaxiosPromise[SchemaGroups] = js.native
      def insert(params: ParamsResourceArchiveInsert, callback: BodyResponseCallback[SchemaGroups]): Unit = js.native
      def insert(
        params: ParamsResourceArchiveInsert,
        options: BodyResponseCallback[SchemaGroups],
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
      def insert(params: ParamsResourceArchiveInsert, options: MethodOptions): GaxiosPromise[SchemaGroups] = js.native
      def insert(
        params: ParamsResourceArchiveInsert,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGroups]
      ): Unit = js.native
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
    trait ParamsResourceArchiveInsert extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The group ID
        */
      var groupId: js.UndefOr[String] = js.native
      
      /**
        * Media metadata
        */
      var media: js.UndefOr[Body] = js.native
    }
    object ParamsResourceArchiveInsert {
      
      @scala.inline
      def apply(): ParamsResourceArchiveInsert = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceArchiveInsert]
      }
      
      @scala.inline
      implicit class ParamsResourceArchiveInsertMutableBuilder[Self <: ParamsResourceArchiveInsert] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
        
        @scala.inline
        def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      }
    }
    
    /**
      * JSON response template for groups migration API.
      */
    @js.native
    trait SchemaGroups extends StObject {
      
      /**
        * The kind of insert resource this is.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * The status of the insert request.
        */
      var responseCode: js.UndefOr[String] = js.native
    }
    object SchemaGroups {
      
      @scala.inline
      def apply(): SchemaGroups = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGroups]
      }
      
      @scala.inline
      implicit class SchemaGroupsMutableBuilder[Self <: SchemaGroups] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setResponseCode(value: String): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
      }
    }
    
    @js.native
    trait StandardParameters extends StObject {
      
      /**
        * Data format for the response.
        */
      var alt: js.UndefOr[String] = js.native
      
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
        * An opaque string that represents a user for quota purposes. Must not
        * exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.native
      
      /**
        * Deprecated. Please use quotaUser instead.
        */
      var userIp: js.UndefOr[String] = js.native
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
        def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
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
        def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
      }
    }
  }
}
