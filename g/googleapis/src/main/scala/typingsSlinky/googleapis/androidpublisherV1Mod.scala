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

object androidpublisherV1Mod {
  
  object androidpublisherV1 {
    
    /**
      * Google Play Developer API
      *
      * Accesses Android application developers&#39; Google Play accounts.
      *
      * @example
      * const {google} = require('googleapis');
      * const androidpublisher = google.androidpublisher('v1');
      *
      * @namespace androidpublisher
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Androidpublisher
      */
    @JSImport("googleapis/build/src/apis/androidpublisher/v1", "androidpublisher_v1.Androidpublisher")
    @js.native
    class Androidpublisher protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var purchases: ResourcePurchases = js.native
    }
    
    @JSImport("googleapis/build/src/apis/androidpublisher/v1", "androidpublisher_v1.Resource$Purchases")
    @js.native
    class ResourcePurchases protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * androidpublisher.purchases.cancel
        * @desc Cancels a user's subscription purchase. The subscription remains
        * valid until its expiration time.
        * @alias androidpublisher.purchases.cancel
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
        * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
        * @param {string} params.token The token provided to the user's device when the subscription was purchased.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def cancel(): GaxiosPromise[Unit] = js.native
      def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
      def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
      def cancel(params: ParamsResourcePurchasesCancel): GaxiosPromise[Unit] = js.native
      def cancel(params: ParamsResourcePurchasesCancel, callback: BodyResponseCallback[Unit]): Unit = js.native
      def cancel(
        params: ParamsResourcePurchasesCancel,
        options: BodyResponseCallback[Unit],
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      def cancel(params: ParamsResourcePurchasesCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
      def cancel(
        params: ParamsResourcePurchasesCancel,
        options: MethodOptions,
        callback: BodyResponseCallback[Unit]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
      
      /**
        * androidpublisher.purchases.get
        * @desc Checks whether a user's subscription purchase is valid and returns
        * its expiry time.
        * @alias androidpublisher.purchases.get
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string} params.packageName The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
        * @param {string} params.subscriptionId The purchased subscription ID (for example, 'monthly001').
        * @param {string} params.token The token provided to the user's device when the subscription was purchased.
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def get(): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
      def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(params: ParamsResourcePurchasesGet): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(params: ParamsResourcePurchasesGet, callback: BodyResponseCallback[SchemaSubscriptionPurchase]): Unit = js.native
      def get(
        params: ParamsResourcePurchasesGet,
        options: BodyResponseCallback[SchemaSubscriptionPurchase],
        callback: BodyResponseCallback[SchemaSubscriptionPurchase]
      ): Unit = js.native
      def get(params: ParamsResourcePurchasesGet, options: MethodOptions): GaxiosPromise[SchemaSubscriptionPurchase] = js.native
      def get(
        params: ParamsResourcePurchasesGet,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaSubscriptionPurchase]
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
    trait ParamsResourcePurchasesCancel extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The package name of the application for which this subscription was
        * purchased (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.native
      
      /**
        * The purchased subscription ID (for example, 'monthly001').
        */
      var subscriptionId: js.UndefOr[String] = js.native
      
      /**
        * The token provided to the user's device when the subscription was
        * purchased.
        */
      var token: js.UndefOr[String] = js.native
    }
    object ParamsResourcePurchasesCancel {
      
      @scala.inline
      def apply(): ParamsResourcePurchasesCancel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePurchasesCancel]
      }
      
      @scala.inline
      implicit class ParamsResourcePurchasesCancelMutableBuilder[Self <: ParamsResourcePurchasesCancel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        @scala.inline
        def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourcePurchasesGet extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * The package name of the application for which this subscription was
        * purchased (for example, 'com.some.thing').
        */
      var packageName: js.UndefOr[String] = js.native
      
      /**
        * The purchased subscription ID (for example, 'monthly001').
        */
      var subscriptionId: js.UndefOr[String] = js.native
      
      /**
        * The token provided to the user's device when the subscription was
        * purchased.
        */
      var token: js.UndefOr[String] = js.native
    }
    object ParamsResourcePurchasesGet {
      
      @scala.inline
      def apply(): ParamsResourcePurchasesGet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourcePurchasesGet]
      }
      
      @scala.inline
      implicit class ParamsResourcePurchasesGetMutableBuilder[Self <: ParamsResourcePurchasesGet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
        
        @scala.inline
        def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      }
    }
    
    /**
      * A SubscriptionPurchase resource indicates the status of a user&#39;s
      * subscription purchase.
      */
    @js.native
    trait SchemaSubscriptionPurchase extends StObject {
      
      /**
        * Whether the subscription will automatically be renewed when it reaches
        * its current expiry time.
        */
      var autoRenewing: js.UndefOr[Boolean] = js.native
      
      /**
        * Time at which the subscription was granted, in milliseconds since the
        * Epoch.
        */
      var initiationTimestampMsec: js.UndefOr[String] = js.native
      
      /**
        * This kind represents a subscriptionPurchase object in the
        * androidpublisher service.
        */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * Time at which the subscription will expire, in milliseconds since the
        * Epoch.
        */
      var validUntilTimestampMsec: js.UndefOr[String] = js.native
    }
    object SchemaSubscriptionPurchase {
      
      @scala.inline
      def apply(): SchemaSubscriptionPurchase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaSubscriptionPurchase]
      }
      
      @scala.inline
      implicit class SchemaSubscriptionPurchaseMutableBuilder[Self <: SchemaSubscriptionPurchase] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutoRenewing(value: Boolean): Self = StObject.set(x, "autoRenewing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoRenewingUndefined: Self = StObject.set(x, "autoRenewing", js.undefined)
        
        @scala.inline
        def setInitiationTimestampMsec(value: String): Self = StObject.set(x, "initiationTimestampMsec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitiationTimestampMsecUndefined: Self = StObject.set(x, "initiationTimestampMsec", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setValidUntilTimestampMsec(value: String): Self = StObject.set(x, "validUntilTimestampMsec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidUntilTimestampMsecUndefined: Self = StObject.set(x, "validUntilTimestampMsec", js.undefined)
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
