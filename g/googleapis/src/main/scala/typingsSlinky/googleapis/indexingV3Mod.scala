package typingsSlinky.googleapis

import typingsSlinky.gaxios.commonMod.GaxiosPromise
import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import typingsSlinky.googleapis.googleapisStrings.v3
import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.BodyResponseCallback
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexingV3Mod {
  
  object indexingV3 {
    
    /**
      * Indexing API
      *
      * Notifies Google when your web pages change.
      *
      * @example
      * const {google} = require('googleapis');
      * const indexing = google.indexing('v3');
      *
      * @namespace indexing
      * @type {Function}
      * @version v3
      * @variation v3
      * @param {object=} options Options for Indexing
      */
    @JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Indexing")
    @js.native
    class Indexing protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var urlNotifications: ResourceUrlnotifications = js.native
    }
    
    @JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Resource$Urlnotifications")
    @js.native
    class ResourceUrlnotifications protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * indexing.urlNotifications.getMetadata
        * @desc Gets metadata about a Web Document. This method can _only_ be used
        * to query URLs that were previously seen in successful Indexing API
        * notifications. Includes the latest `UrlNotification` received via this
        * API.
        * @alias indexing.urlNotifications.getMetadata
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.url URL that is being queried.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def getMetadata(): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(callback: BodyResponseCallback[SchemaUrlNotificationMetadata]): Unit = js.native
      def getMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
      ): Unit = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        options: BodyResponseCallback[SchemaUrlNotificationMetadata],
        callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
      ): Unit = js.native
      def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata, options: MethodOptions): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
      def getMetadata(
        params: ParamsResourceUrlnotificationsGetmetadata,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
      ): Unit = js.native
      
      /**
        * indexing.urlNotifications.publish
        * @desc Notifies that a URL has been updated or deleted.
        * @alias indexing.urlNotifications.publish
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {().UrlNotification} params.resource Request body data
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def publish(): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]): Unit = js.native
      def publish(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(params: ParamsResourceUrlnotificationsPublish): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
      ): Unit = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        options: BodyResponseCallback[SchemaPublishUrlNotificationResponse],
        callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
      ): Unit = js.native
      def publish(params: ParamsResourceUrlnotificationsPublish, options: MethodOptions): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
      def publish(
        params: ParamsResourceUrlnotificationsPublish,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
      ): Unit = js.native
    }
    
    @js.native
    trait Options extends GlobalOptions {
      
      var version: v3 = js.native
    }
    object Options {
      
      @scala.inline
      def apply(version: v3): Options = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setVersion(value: v3): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ParamsResourceUrlnotificationsGetmetadata extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * URL that is being queried.
        */
      var url: js.UndefOr[String] = js.native
    }
    object ParamsResourceUrlnotificationsGetmetadata {
      
      @scala.inline
      def apply(): ParamsResourceUrlnotificationsGetmetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlnotificationsGetmetadata]
      }
      
      @scala.inline
      implicit class ParamsResourceUrlnotificationsGetmetadataMutableBuilder[Self <: ParamsResourceUrlnotificationsGetmetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceUrlnotificationsPublish extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Request body metadata
        */
      var requestBody: js.UndefOr[SchemaUrlNotification] = js.native
    }
    object ParamsResourceUrlnotificationsPublish {
      
      @scala.inline
      def apply(): ParamsResourceUrlnotificationsPublish = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceUrlnotificationsPublish]
      }
      
      @scala.inline
      implicit class ParamsResourceUrlnotificationsPublishMutableBuilder[Self <: ParamsResourceUrlnotificationsPublish] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRequestBody(value: SchemaUrlNotification): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      }
    }
    
    /**
      * Output for PublishUrlNotification
      */
    @js.native
    trait SchemaPublishUrlNotificationResponse extends StObject {
      
      /**
        * Description of the notification events received for this URL.
        */
      var urlNotificationMetadata: js.UndefOr[SchemaUrlNotificationMetadata] = js.native
    }
    object SchemaPublishUrlNotificationResponse {
      
      @scala.inline
      def apply(): SchemaPublishUrlNotificationResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaPublishUrlNotificationResponse]
      }
      
      @scala.inline
      implicit class SchemaPublishUrlNotificationResponseMutableBuilder[Self <: SchemaPublishUrlNotificationResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrlNotificationMetadata(value: SchemaUrlNotificationMetadata): Self = StObject.set(x, "urlNotificationMetadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlNotificationMetadataUndefined: Self = StObject.set(x, "urlNotificationMetadata", js.undefined)
      }
    }
    
    /**
      * `UrlNotification` is the resource used in all Indexing API calls. It
      * describes one event in the life cycle of a Web Document.
      */
    @js.native
    trait SchemaUrlNotification extends StObject {
      
      /**
        * Creation timestamp for this notification. Users should _not_ specify it,
        * the field is ignored at the request time.
        */
      var notifyTime: js.UndefOr[String] = js.native
      
      /**
        * The URL life cycle event that Google is being notified about.
        */
      var `type`: js.UndefOr[String] = js.native
      
      /**
        * The object of this notification. The URL must be owned by the publisher
        * of this notification and, in case of `URL_UPDATED` notifications, it
        * _must_ be crawlable by Google.
        */
      var url: js.UndefOr[String] = js.native
    }
    object SchemaUrlNotification {
      
      @scala.inline
      def apply(): SchemaUrlNotification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlNotification]
      }
      
      @scala.inline
      implicit class SchemaUrlNotificationMutableBuilder[Self <: SchemaUrlNotification] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNotifyTime(value: String): Self = StObject.set(x, "notifyTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotifyTimeUndefined: Self = StObject.set(x, "notifyTime", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    /**
      * Summary of the most recent Indexing API notifications successfully
      * received, for a given URL.
      */
    @js.native
    trait SchemaUrlNotificationMetadata extends StObject {
      
      /**
        * Latest notification received with type `URL_REMOVED`.
        */
      var latestRemove: js.UndefOr[SchemaUrlNotification] = js.native
      
      /**
        * Latest notification received with type `URL_UPDATED`.
        */
      var latestUpdate: js.UndefOr[SchemaUrlNotification] = js.native
      
      /**
        * URL to which this metadata refers.
        */
      var url: js.UndefOr[String] = js.native
    }
    object SchemaUrlNotificationMetadata {
      
      @scala.inline
      def apply(): SchemaUrlNotificationMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaUrlNotificationMetadata]
      }
      
      @scala.inline
      implicit class SchemaUrlNotificationMetadataMutableBuilder[Self <: SchemaUrlNotificationMetadata] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLatestRemove(value: SchemaUrlNotification): Self = StObject.set(x, "latestRemove", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatestRemoveUndefined: Self = StObject.set(x, "latestRemove", js.undefined)
        
        @scala.inline
        def setLatestUpdate(value: SchemaUrlNotification): Self = StObject.set(x, "latestUpdate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLatestUpdateUndefined: Self = StObject.set(x, "latestUpdate", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
