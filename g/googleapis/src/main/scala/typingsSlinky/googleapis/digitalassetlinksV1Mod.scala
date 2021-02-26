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

object digitalassetlinksV1Mod {
  
  object digitalassetlinksV1 {
    
    /**
      * Digital Asset Links API
      *
      * Discovers relationships between online assets such as websites or mobile
      * apps.
      *
      * @example
      * const {google} = require('googleapis');
      * const digitalassetlinks = google.digitalassetlinks('v1');
      *
      * @namespace digitalassetlinks
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Digitalassetlinks
      */
    @JSImport("googleapis/build/src/apis/digitalassetlinks/v1", "digitalassetlinks_v1.Digitalassetlinks")
    @js.native
    class Digitalassetlinks protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var assetlinks: ResourceAssetlinks = js.native
      
      var context: APIRequestContext = js.native
      
      var statements: ResourceStatements = js.native
    }
    
    @JSImport("googleapis/build/src/apis/digitalassetlinks/v1", "digitalassetlinks_v1.Resource$Assetlinks")
    @js.native
    class ResourceAssetlinks protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      /**
        * digitalassetlinks.assetlinks.check
        * @desc Determines whether the specified (directional) relationship exists
        * between the specified source and target assets.  The relation describes
        * the intent of the link between the two assets as claimed by the source
        * asset.  An example for such relationships is the delegation of privileges
        * or permissions.  This command is most often used by infrastructure
        * systems to check preconditions for an action.  For example, a client may
        * want to know if it is OK to send a web URL to a particular mobile app
        * instead. The client can check for the relevant asset link from the
        * website to the mobile app to decide if the operation should be allowed.
        * A note about security: if you specify a secure asset as the source, such
        * as an HTTPS website or an Android app, the API will ensure that any
        * statements used to generate the response have been made in a secure way
        * by the owner of that asset.  Conversely, if the source asset is an
        * insecure HTTP website (that is, the URL starts with `http://` instead of
        * `https://`), the API cannot verify its statements securely, and it is not
        * possible to ensure that the website's statements have not been altered by
        * a third party.  For more information, see the [Digital Asset Links
        * technical design
        * specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md).
        * @alias digitalassetlinks.assetlinks.check
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.relation Query string for the relation.  We identify relations with strings of the format `<kind>/<detail>`, where `<kind>` must be one of a set of pre-defined purpose categories, and `<detail>` is a free-form lowercase alphanumeric string that describes the specific use case of the statement.  Refer to [our API documentation](/digital-asset-links/v1/relation-strings) for the current list of supported relations.  For a query to match an asset link, both the query's and the asset link's relation strings must match exactly.  Example: A query with relation `delegate_permission/common.handle_all_urls` matches an asset link with relation `delegate_permission/common.handle_all_urls`.
        * @param {string=} params.source.androidApp.certificate.sha256Fingerprint The uppercase SHA-265 fingerprint of the certificate.  From the PEM  certificate, it can be acquired like this:      $ keytool -printcert -file $CERTFILE | grep SHA256:     SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \         42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256     SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \         16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`.  If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
        * @param {string=} params.source.androidApp.packageName Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
        * @param {string=} params.source.web.site Web assets are identified by a URL that contains only the scheme, hostname and port parts.  The format is      http[s]://<hostname>[:<port>]  Hostnames must be fully qualified: they must end in a single period ("`.`").  Only the schemes "http" and "https" are currently allowed.  Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https.  We call this limited URL the "site".  All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset.  Example: the asset with the site `https://www.google.com` contains all these URLs:    *   `https://www.google.com/`   *   `https://www.google.com:443/`   *   `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *   `https://www.google.com/foo#bar`   *   `https://user@password:www.google.com/`  But it does not contain these URLs:    *   `http://www.google.com/`       (wrong scheme)   *   `https://google.com/`          (hostname does not match)   *   `https://www.google.com:444/`  (port does not match) REQUIRED
        * @param {string=} params.target.androidApp.certificate.sha256Fingerprint The uppercase SHA-265 fingerprint of the certificate.  From the PEM  certificate, it can be acquired like this:      $ keytool -printcert -file $CERTFILE | grep SHA256:     SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \         42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256     SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \         16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`.  If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
        * @param {string=} params.target.androidApp.packageName Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
        * @param {string=} params.target.web.site Web assets are identified by a URL that contains only the scheme, hostname and port parts.  The format is      http[s]://<hostname>[:<port>]  Hostnames must be fully qualified: they must end in a single period ("`.`").  Only the schemes "http" and "https" are currently allowed.  Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https.  We call this limited URL the "site".  All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset.  Example: the asset with the site `https://www.google.com` contains all these URLs:    *   `https://www.google.com/`   *   `https://www.google.com:443/`   *   `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *   `https://www.google.com/foo#bar`   *   `https://user@password:www.google.com/`  But it does not contain these URLs:    *   `http://www.google.com/`       (wrong scheme)   *   `https://google.com/`          (hostname does not match)   *   `https://www.google.com:444/`  (port does not match) REQUIRED
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def check(): GaxiosPromise[SchemaCheckResponse] = js.native
      def check(callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
      def check(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
      def check(params: ParamsResourceAssetlinksCheck): GaxiosPromise[SchemaCheckResponse] = js.native
      def check(params: ParamsResourceAssetlinksCheck, callback: BodyResponseCallback[SchemaCheckResponse]): Unit = js.native
      def check(
        params: ParamsResourceAssetlinksCheck,
        options: BodyResponseCallback[SchemaCheckResponse],
        callback: BodyResponseCallback[SchemaCheckResponse]
      ): Unit = js.native
      def check(params: ParamsResourceAssetlinksCheck, options: MethodOptions): GaxiosPromise[SchemaCheckResponse] = js.native
      def check(
        params: ParamsResourceAssetlinksCheck,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaCheckResponse]
      ): Unit = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/digitalassetlinks/v1", "digitalassetlinks_v1.Resource$Statements")
    @js.native
    class ResourceStatements protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      /**
        * digitalassetlinks.statements.list
        * @desc Retrieves a list of all statements from a given source that match
        * the specified target and statement string.  The API guarantees that all
        * statements with secure source assets, such as HTTPS websites or Android
        * apps, have been made in a secure way by the owner of those assets, as
        * described in the [Digital Asset Links technical design
        * specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md).
        * Specifically, you should consider that for insecure websites (that is,
        * where the URL starts with `http://` instead of `https://`), this
        * guarantee cannot be made.  The `List` command is most useful in cases
        * where the API client wants to know all the ways in which two assets are
        * related, or enumerate all the relationships from a particular source
        * asset.  Example: a feature that helps users navigate to related items.
        * When a mobile app is running on a device, the feature would make it easy
        * to navigate to the corresponding web site or Google+ profile.
        * @alias digitalassetlinks.statements.list
        * @memberOf! ()
        *
        * @param {object} params Parameters for request
        * @param {string=} params.relation Use only associations that match the specified relation.  See the [`Statement`](#Statement) message for a detailed definition of relation strings.  For a query to match a statement, one of the following must be true:  *    both the query's and the statement's relation strings match exactly,      or *    the query's relation string is empty or missing.  Example: A query with relation `delegate_permission/common.handle_all_urls` matches an asset link with relation `delegate_permission/common.handle_all_urls`.
        * @param {string=} params.source.androidApp.certificate.sha256Fingerprint The uppercase SHA-265 fingerprint of the certificate.  From the PEM  certificate, it can be acquired like this:      $ keytool -printcert -file $CERTFILE | grep SHA256:     SHA256: 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \         42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509 -in $CERTFILE -noout -fingerprint -sha256     SHA256 Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \         16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the contents of this field would be `14:6D:E9:83:C5:73: 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF: 44:E5`.  If these tools are not available to you, you can convert the PEM certificate into the DER format, compute the SHA-256 hash of that string and represent the result as a hexstring (that is, uppercase hexadecimal representations of each octet, separated by colons).
        * @param {string=} params.source.androidApp.packageName Android App assets are naturally identified by their Java package name. For example, the Google Maps app uses the package name `com.google.android.apps.maps`. REQUIRED
        * @param {string=} params.source.web.site Web assets are identified by a URL that contains only the scheme, hostname and port parts.  The format is      http[s]://<hostname>[:<port>]  Hostnames must be fully qualified: they must end in a single period ("`.`").  Only the schemes "http" and "https" are currently allowed.  Port numbers are given as a decimal number, and they must be omitted if the standard port numbers are used: 80 for http and 443 for https.  We call this limited URL the "site".  All URLs that share the same scheme, hostname and port are considered to be a part of the site and thus belong to the web asset.  Example: the asset with the site `https://www.google.com` contains all these URLs:    *   `https://www.google.com/`   *   `https://www.google.com:443/`   *   `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *   `https://www.google.com/foo#bar`   *   `https://user@password:www.google.com/`  But it does not contain these URLs:    *   `http://www.google.com/`       (wrong scheme)   *   `https://google.com/`          (hostname does not match)   *   `https://www.google.com:444/`  (port does not match) REQUIRED
        * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param {callback} callback The callback that handles the response.
        * @return {object} Request object
        */
      def list(): GaxiosPromise[SchemaListResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaListResponse]): Unit = js.native
      def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListResponse] = js.native
      def list(params: ParamsResourceStatementsList): GaxiosPromise[SchemaListResponse] = js.native
      def list(params: ParamsResourceStatementsList, callback: BodyResponseCallback[SchemaListResponse]): Unit = js.native
      def list(
        params: ParamsResourceStatementsList,
        options: BodyResponseCallback[SchemaListResponse],
        callback: BodyResponseCallback[SchemaListResponse]
      ): Unit = js.native
      def list(params: ParamsResourceStatementsList, options: MethodOptions): GaxiosPromise[SchemaListResponse] = js.native
      def list(
        params: ParamsResourceStatementsList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaListResponse]
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
    trait ParamsResourceAssetlinksCheck extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Query string for the relation.  We identify relations with strings of the
        * format `<kind>/<detail>`, where `<kind>` must be one of a set of
        * pre-defined purpose categories, and `<detail>` is a free-form lowercase
        * alphanumeric string that describes the specific use case of the
        * statement.  Refer to [our API
        * documentation](/digital-asset-links/v1/relation-strings) for the current
        * list of supported relations.  For a query to match an asset link, both
        * the query's and the asset link's relation strings must match exactly.
        * Example: A query with relation
        * `delegate_permission/common.handle_all_urls` matches an asset link with
        * relation `delegate_permission/common.handle_all_urls`.
        */
      var relation: js.UndefOr[String] = js.native
      
      /**
        * The uppercase SHA-265 fingerprint of the certificate.  From the PEM
        * certificate, it can be acquired like this:      $ keytool -printcert
        * -file $CERTFILE | grep SHA256:     SHA256:
        * 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \
        * 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509
        * -in $CERTFILE -noout -fingerprint -sha256     SHA256
        * Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \
        * 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the
        * contents of this field would be `14:6D:E9:83:C5:73:
        * 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:
        * 44:E5`.  If these tools are not available to you, you can convert the PEM
        * certificate into the DER format, compute the SHA-256 hash of that string
        * and represent the result as a hexstring (that is, uppercase hexadecimal
        * representations of each octet, separated by colons).
        */
      @JSName("source.androidApp.certificate.sha256Fingerprint")
      var sourceDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.native
      
      /**
        * Android App assets are naturally identified by their Java package name.
        * For example, the Google Maps app uses the package name
        * `com.google.android.apps.maps`. REQUIRED
        */
      @JSName("source.androidApp.packageName")
      var sourceDotandroidAppDotpackageName: js.UndefOr[String] = js.native
      
      /**
        * Web assets are identified by a URL that contains only the scheme,
        * hostname and port parts.  The format is http[s]://<hostname>[:<port>]
        * Hostnames must be fully qualified: they must end in a single period
        * ("`.`").  Only the schemes "http" and "https" are currently allowed. Port
        * numbers are given as a decimal number, and they must be omitted if the
        * standard port numbers are used: 80 for http and 443 for https.  We call
        * this limited URL the "site".  All URLs that share the same scheme,
        * hostname and port are considered to be a part of the site and thus belong
        * to the web asset.  Example: the asset with the site
        * `https://www.google.com` contains all these URLs:    *
        * `https://www.google.com/`   *   `https://www.google.com:443/`   *
        * `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *
        * `https://www.google.com/foo#bar`   *
        * `https://user@password:www.google.com/`  But it does not contain these
        * URLs:    *   `http://www.google.com/`       (wrong scheme)   *
        * `https://google.com/`          (hostname does not match)   *
        * `https://www.google.com:444/`  (port does not match) REQUIRED
        */
      @JSName("source.web.site")
      var sourceDotwebDotsite: js.UndefOr[String] = js.native
      
      /**
        * The uppercase SHA-265 fingerprint of the certificate.  From the PEM
        * certificate, it can be acquired like this:      $ keytool -printcert
        * -file $CERTFILE | grep SHA256:     SHA256:
        * 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \
        * 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509
        * -in $CERTFILE -noout -fingerprint -sha256     SHA256
        * Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \
        * 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the
        * contents of this field would be `14:6D:E9:83:C5:73:
        * 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:
        * 44:E5`.  If these tools are not available to you, you can convert the PEM
        * certificate into the DER format, compute the SHA-256 hash of that string
        * and represent the result as a hexstring (that is, uppercase hexadecimal
        * representations of each octet, separated by colons).
        */
      @JSName("target.androidApp.certificate.sha256Fingerprint")
      var targetDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.native
      
      /**
        * Android App assets are naturally identified by their Java package name.
        * For example, the Google Maps app uses the package name
        * `com.google.android.apps.maps`. REQUIRED
        */
      @JSName("target.androidApp.packageName")
      var targetDotandroidAppDotpackageName: js.UndefOr[String] = js.native
      
      /**
        * Web assets are identified by a URL that contains only the scheme,
        * hostname and port parts.  The format is http[s]://<hostname>[:<port>]
        * Hostnames must be fully qualified: they must end in a single period
        * ("`.`").  Only the schemes "http" and "https" are currently allowed. Port
        * numbers are given as a decimal number, and they must be omitted if the
        * standard port numbers are used: 80 for http and 443 for https.  We call
        * this limited URL the "site".  All URLs that share the same scheme,
        * hostname and port are considered to be a part of the site and thus belong
        * to the web asset.  Example: the asset with the site
        * `https://www.google.com` contains all these URLs:    *
        * `https://www.google.com/`   *   `https://www.google.com:443/`   *
        * `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *
        * `https://www.google.com/foo#bar`   *
        * `https://user@password:www.google.com/`  But it does not contain these
        * URLs:    *   `http://www.google.com/`       (wrong scheme)   *
        * `https://google.com/`          (hostname does not match)   *
        * `https://www.google.com:444/`  (port does not match) REQUIRED
        */
      @JSName("target.web.site")
      var targetDotwebDotsite: js.UndefOr[String] = js.native
    }
    object ParamsResourceAssetlinksCheck {
      
      @scala.inline
      def apply(): ParamsResourceAssetlinksCheck = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceAssetlinksCheck]
      }
      
      @scala.inline
      implicit class ParamsResourceAssetlinksCheckMutableBuilder[Self <: ParamsResourceAssetlinksCheck] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
        
        @scala.inline
        def setSourceDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = StObject.set(x, "source.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceDotandroidAppDotcertificateDotsha256FingerprintUndefined: Self = StObject.set(x, "source.androidApp.certificate.sha256Fingerprint", js.undefined)
        
        @scala.inline
        def setSourceDotandroidAppDotpackageName(value: String): Self = StObject.set(x, "source.androidApp.packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceDotandroidAppDotpackageNameUndefined: Self = StObject.set(x, "source.androidApp.packageName", js.undefined)
        
        @scala.inline
        def setSourceDotwebDotsite(value: String): Self = StObject.set(x, "source.web.site", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceDotwebDotsiteUndefined: Self = StObject.set(x, "source.web.site", js.undefined)
        
        @scala.inline
        def setTargetDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = StObject.set(x, "target.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetDotandroidAppDotcertificateDotsha256FingerprintUndefined: Self = StObject.set(x, "target.androidApp.certificate.sha256Fingerprint", js.undefined)
        
        @scala.inline
        def setTargetDotandroidAppDotpackageName(value: String): Self = StObject.set(x, "target.androidApp.packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetDotandroidAppDotpackageNameUndefined: Self = StObject.set(x, "target.androidApp.packageName", js.undefined)
        
        @scala.inline
        def setTargetDotwebDotsite(value: String): Self = StObject.set(x, "target.web.site", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetDotwebDotsiteUndefined: Self = StObject.set(x, "target.web.site", js.undefined)
      }
    }
    
    @js.native
    trait ParamsResourceStatementsList extends StandardParameters {
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
      
      /**
        * Use only associations that match the specified relation.  See the
        * [`Statement`](#Statement) message for a detailed definition of relation
        * strings.  For a query to match a statement, one of the following must be
        * true:  *    both the query's and the statement's relation strings match
        * exactly,      or *    the query's relation string is empty or missing.
        * Example: A query with relation
        * `delegate_permission/common.handle_all_urls` matches an asset link with
        * relation `delegate_permission/common.handle_all_urls`.
        */
      var relation: js.UndefOr[String] = js.native
      
      /**
        * The uppercase SHA-265 fingerprint of the certificate.  From the PEM
        * certificate, it can be acquired like this:      $ keytool -printcert
        * -file $CERTFILE | grep SHA256:     SHA256:
        * 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \
        * 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509
        * -in $CERTFILE -noout -fingerprint -sha256     SHA256
        * Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \
        * 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the
        * contents of this field would be `14:6D:E9:83:C5:73:
        * 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:
        * 44:E5`.  If these tools are not available to you, you can convert the PEM
        * certificate into the DER format, compute the SHA-256 hash of that string
        * and represent the result as a hexstring (that is, uppercase hexadecimal
        * representations of each octet, separated by colons).
        */
      @JSName("source.androidApp.certificate.sha256Fingerprint")
      var sourceDotandroidAppDotcertificateDotsha256Fingerprint: js.UndefOr[String] = js.native
      
      /**
        * Android App assets are naturally identified by their Java package name.
        * For example, the Google Maps app uses the package name
        * `com.google.android.apps.maps`. REQUIRED
        */
      @JSName("source.androidApp.packageName")
      var sourceDotandroidAppDotpackageName: js.UndefOr[String] = js.native
      
      /**
        * Web assets are identified by a URL that contains only the scheme,
        * hostname and port parts.  The format is http[s]://<hostname>[:<port>]
        * Hostnames must be fully qualified: they must end in a single period
        * ("`.`").  Only the schemes "http" and "https" are currently allowed. Port
        * numbers are given as a decimal number, and they must be omitted if the
        * standard port numbers are used: 80 for http and 443 for https.  We call
        * this limited URL the "site".  All URLs that share the same scheme,
        * hostname and port are considered to be a part of the site and thus belong
        * to the web asset.  Example: the asset with the site
        * `https://www.google.com` contains all these URLs:    *
        * `https://www.google.com/`   *   `https://www.google.com:443/`   *
        * `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *
        * `https://www.google.com/foo#bar`   *
        * `https://user@password:www.google.com/`  But it does not contain these
        * URLs:    *   `http://www.google.com/`       (wrong scheme)   *
        * `https://google.com/`          (hostname does not match)   *
        * `https://www.google.com:444/`  (port does not match) REQUIRED
        */
      @JSName("source.web.site")
      var sourceDotwebDotsite: js.UndefOr[String] = js.native
    }
    object ParamsResourceStatementsList {
      
      @scala.inline
      def apply(): ParamsResourceStatementsList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceStatementsList]
      }
      
      @scala.inline
      implicit class ParamsResourceStatementsListMutableBuilder[Self <: ParamsResourceStatementsList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
        
        @scala.inline
        def setSourceDotandroidAppDotcertificateDotsha256Fingerprint(value: String): Self = StObject.set(x, "source.androidApp.certificate.sha256Fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceDotandroidAppDotcertificateDotsha256FingerprintUndefined: Self = StObject.set(x, "source.androidApp.certificate.sha256Fingerprint", js.undefined)
        
        @scala.inline
        def setSourceDotandroidAppDotpackageName(value: String): Self = StObject.set(x, "source.androidApp.packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceDotandroidAppDotpackageNameUndefined: Self = StObject.set(x, "source.androidApp.packageName", js.undefined)
        
        @scala.inline
        def setSourceDotwebDotsite(value: String): Self = StObject.set(x, "source.web.site", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceDotwebDotsiteUndefined: Self = StObject.set(x, "source.web.site", js.undefined)
      }
    }
    
    /**
      * Describes an android app asset.
      */
    @js.native
    trait SchemaAndroidAppAsset extends StObject {
      
      /**
        * Because there is no global enforcement of package name uniqueness, we
        * also require a signing certificate, which in combination with the package
        * name uniquely identifies an app.  Some apps&#39; signing keys are
        * rotated, so they may be signed by different keys over time.  We treat
        * these as distinct assets, since we use (package name, cert) as the unique
        * ID.  This should not normally pose any problems as both versions of the
        * app will make the same or similar statements. Other assets making
        * statements about the app will have to be updated when a key is rotated,
        * however.  (Note that the syntaxes for publishing and querying for
        * statements contain syntactic sugar to easily let you specify apps that
        * are known by multiple certificates.) REQUIRED
        */
      var certificate: js.UndefOr[SchemaCertificateInfo] = js.native
      
      /**
        * Android App assets are naturally identified by their Java package name.
        * For example, the Google Maps app uses the package name
        * `com.google.android.apps.maps`. REQUIRED
        */
      var packageName: js.UndefOr[String] = js.native
    }
    object SchemaAndroidAppAsset {
      
      @scala.inline
      def apply(): SchemaAndroidAppAsset = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAndroidAppAsset]
      }
      
      @scala.inline
      implicit class SchemaAndroidAppAssetMutableBuilder[Self <: SchemaAndroidAppAsset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCertificate(value: SchemaCertificateInfo): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
        
        @scala.inline
        def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      }
    }
    
    /**
      * Uniquely identifies an asset.  A digital asset is an identifiable and
      * addressable online entity that typically provides some service or content.
      * Examples of assets are websites, Android apps, Twitter feeds, and Plus
      * Pages.
      */
    @js.native
    trait SchemaAsset extends StObject {
      
      /**
        * Set if this is an Android App asset.
        */
      var androidApp: js.UndefOr[SchemaAndroidAppAsset] = js.native
      
      /**
        * Set if this is a web asset.
        */
      var web: js.UndefOr[SchemaWebAsset] = js.native
    }
    object SchemaAsset {
      
      @scala.inline
      def apply(): SchemaAsset = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaAsset]
      }
      
      @scala.inline
      implicit class SchemaAssetMutableBuilder[Self <: SchemaAsset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAndroidApp(value: SchemaAndroidAppAsset): Self = StObject.set(x, "androidApp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAndroidAppUndefined: Self = StObject.set(x, "androidApp", js.undefined)
        
        @scala.inline
        def setWeb(value: SchemaWebAsset): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
      }
    }
    
    /**
      * Describes an X509 certificate.
      */
    @js.native
    trait SchemaCertificateInfo extends StObject {
      
      /**
        * The uppercase SHA-265 fingerprint of the certificate.  From the PEM
        * certificate, it can be acquired like this:      $ keytool -printcert
        * -file $CERTFILE | grep SHA256:     SHA256:
        * 14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83: \
        * 42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  or like this:      $ openssl x509
        * -in $CERTFILE -noout -fingerprint -sha256     SHA256
        * Fingerprint=14:6D:E9:83:C5:73:06:50:D8:EE:B9:95:2F:34:FC:64: \
        * 16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:44:E5  In this example, the
        * contents of this field would be `14:6D:E9:83:C5:73:
        * 06:50:D8:EE:B9:95:2F:34:FC:64:16:A0:83:42:E6:1D:BE:A8:8A:04:96:B2:3F:CF:
        * 44:E5`.  If these tools are not available to you, you can convert the PEM
        * certificate into the DER format, compute the SHA-256 hash of that string
        * and represent the result as a hexstring (that is, uppercase hexadecimal
        * representations of each octet, separated by colons).
        */
      var sha256Fingerprint: js.UndefOr[String] = js.native
    }
    object SchemaCertificateInfo {
      
      @scala.inline
      def apply(): SchemaCertificateInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCertificateInfo]
      }
      
      @scala.inline
      implicit class SchemaCertificateInfoMutableBuilder[Self <: SchemaCertificateInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSha256Fingerprint(value: String): Self = StObject.set(x, "sha256Fingerprint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSha256FingerprintUndefined: Self = StObject.set(x, "sha256Fingerprint", js.undefined)
      }
    }
    
    /**
      * Response message for the CheckAssetLinks call.
      */
    @js.native
    trait SchemaCheckResponse extends StObject {
      
      /**
        * Human-readable message containing information intended to help end users
        * understand, reproduce and debug the result.   The message will be in
        * English and we are currently not planning to offer any translations.
        * Please note that no guarantees are made about the contents or format of
        * this string.  Any aspect of it may be subject to change without notice.
        * You should not attempt to programmatically parse this data.  For
        * programmatic access, use the error_code field below.
        */
      var debugString: js.UndefOr[String] = js.native
      
      /**
        * Error codes that describe the result of the Check operation.
        */
      var errorCode: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * Set to true if the assets specified in the request are linked by the
        * relation specified in the request.
        */
      var linked: js.UndefOr[Boolean] = js.native
      
      /**
        * From serving time, how much longer the response should be considered
        * valid barring further updates. REQUIRED
        */
      var maxAge: js.UndefOr[String] = js.native
    }
    object SchemaCheckResponse {
      
      @scala.inline
      def apply(): SchemaCheckResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaCheckResponse]
      }
      
      @scala.inline
      implicit class SchemaCheckResponseMutableBuilder[Self <: SchemaCheckResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
        
        @scala.inline
        def setErrorCode(value: js.Array[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
        
        @scala.inline
        def setErrorCodeVarargs(value: String*): Self = StObject.set(x, "errorCode", js.Array(value :_*))
        
        @scala.inline
        def setLinked(value: Boolean): Self = StObject.set(x, "linked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkedUndefined: Self = StObject.set(x, "linked", js.undefined)
        
        @scala.inline
        def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      }
    }
    
    /**
      * Response message for the List call.
      */
    @js.native
    trait SchemaListResponse extends StObject {
      
      /**
        * Human-readable message containing information intended to help end users
        * understand, reproduce and debug the result.   The message will be in
        * English and we are currently not planning to offer any translations.
        * Please note that no guarantees are made about the contents or format of
        * this string.  Any aspect of it may be subject to change without notice.
        * You should not attempt to programmatically parse this data.  For
        * programmatic access, use the error_code field below.
        */
      var debugString: js.UndefOr[String] = js.native
      
      /**
        * Error codes that describe the result of the List operation.
        */
      var errorCode: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * From serving time, how much longer the response should be considered
        * valid barring further updates. REQUIRED
        */
      var maxAge: js.UndefOr[String] = js.native
      
      /**
        * A list of all the matching statements that have been found.
        */
      var statements: js.UndefOr[js.Array[SchemaStatement]] = js.native
    }
    object SchemaListResponse {
      
      @scala.inline
      def apply(): SchemaListResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaListResponse]
      }
      
      @scala.inline
      implicit class SchemaListResponseMutableBuilder[Self <: SchemaListResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
        
        @scala.inline
        def setErrorCode(value: js.Array[String]): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
        
        @scala.inline
        def setErrorCodeVarargs(value: String*): Self = StObject.set(x, "errorCode", js.Array(value :_*))
        
        @scala.inline
        def setMaxAge(value: String): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
        
        @scala.inline
        def setStatements(value: js.Array[SchemaStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
        
        @scala.inline
        def setStatementsVarargs(value: SchemaStatement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      }
    }
    
    /**
      * Describes a reliable statement that has been made about the relationship
      * between a source asset and a target asset.  Statements are always made by
      * the source asset, either directly or by delegating to a statement list that
      * is stored elsewhere.  For more detailed definitions of statements and
      * assets, please refer to our [API documentation landing
      * page](/digital-asset-links/v1/getting-started).
      */
    @js.native
    trait SchemaStatement extends StObject {
      
      /**
        * The relation identifies the use of the statement as intended by the
        * source asset&#39;s owner (that is, the person or entity who issued the
        * statement). Every complete statement has a relation.  We identify
        * relations with strings of the format `&lt;kind&gt;/&lt;detail&gt;`, where
        * `&lt;kind&gt;` must be one of a set of pre-defined purpose categories,
        * and `&lt;detail&gt;` is a free-form lowercase alphanumeric string that
        * describes the specific use case of the statement.  Refer to [our API
        * documentation](/digital-asset-links/v1/relation-strings) for the current
        * list of supported relations.  Example:
        * `delegate_permission/common.handle_all_urls` REQUIRED
        */
      var relation: js.UndefOr[String] = js.native
      
      /**
        * Every statement has a source asset. REQUIRED
        */
      var source: js.UndefOr[SchemaAsset] = js.native
      
      /**
        * Every statement has a target asset. REQUIRED
        */
      var target: js.UndefOr[SchemaAsset] = js.native
    }
    object SchemaStatement {
      
      @scala.inline
      def apply(): SchemaStatement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaStatement]
      }
      
      @scala.inline
      implicit class SchemaStatementMutableBuilder[Self <: SchemaStatement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
        
        @scala.inline
        def setSource(value: SchemaAsset): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setTarget(value: SchemaAsset): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      }
    }
    
    /**
      * Describes a web asset.
      */
    @js.native
    trait SchemaWebAsset extends StObject {
      
      /**
        * Web assets are identified by a URL that contains only the scheme,
        * hostname and port parts.  The format is
        * http[s]://&lt;hostname&gt;[:&lt;port&gt;]  Hostnames must be fully
        * qualified: they must end in a single period (&quot;`.`&quot;).  Only the
        * schemes &quot;http&quot; and &quot;https&quot; are currently allowed.
        * Port numbers are given as a decimal number, and they must be omitted if
        * the standard port numbers are used: 80 for http and 443 for https.  We
        * call this limited URL the &quot;site&quot;.  All URLs that share the same
        * scheme, hostname and port are considered to be a part of the site and
        * thus belong to the web asset.  Example: the asset with the site
        * `https://www.google.com` contains all these URLs:    *
        * `https://www.google.com/`   *   `https://www.google.com:443/`   *
        * `https://www.google.com/foo`   *   `https://www.google.com/foo?bar`   *
        * `https://www.google.com/foo#bar`   *
        * `https://user@password:www.google.com/`  But it does not contain these
        * URLs:    *   `http://www.google.com/`       (wrong scheme)   *
        * `https://google.com/`          (hostname does not match)   *
        * `https://www.google.com:444/`  (port does not match) REQUIRED
        */
      var site: js.UndefOr[String] = js.native
    }
    object SchemaWebAsset {
      
      @scala.inline
      def apply(): SchemaWebAsset = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaWebAsset]
      }
      
      @scala.inline
      implicit class SchemaWebAssetMutableBuilder[Self <: SchemaWebAsset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
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
