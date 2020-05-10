package typingsSlinky.gapiClientDiscovery.gapi.client.discovery

import typingsSlinky.gapiClientDiscovery.AnonOauth2
import typingsSlinky.gapiClientDiscovery.AnonX16
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestDescription extends js.Object {
  /** Authentication information. */
  var auth: js.UndefOr[AnonOauth2] = js.native
  /** [DEPRECATED] The base path for REST requests. */
  var basePath: js.UndefOr[String] = js.native
  /** [DEPRECATED] The base URL for REST requests. */
  var baseUrl: js.UndefOr[String] = js.native
  /** The path for REST batch requests. */
  var batchPath: js.UndefOr[String] = js.native
  /** Indicates how the API name should be capitalized and split into various parts. Useful for generating pretty class names. */
  var canonicalName: js.UndefOr[String] = js.native
  /** The description of this API. */
  var description: js.UndefOr[String] = js.native
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[String] = js.native
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[String] = js.native
  /** The ETag for this response. */
  var etag: js.UndefOr[String] = js.native
  /** Enable exponential backoff for suitable methods in the generated clients. */
  var exponentialBackoffDefault: js.UndefOr[Boolean] = js.native
  /** A list of supported features for this API. */
  var features: js.UndefOr[js.Array[String]] = js.native
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[AnonX16] = js.native
  /** The ID of this API. */
  var id: js.UndefOr[String] = js.native
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.native
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[String]] = js.native
  /** API-level methods for this API. */
  var methods: js.UndefOr[Record[String, RestMethod]] = js.native
  /** The name of this API. */
  var name: js.UndefOr[String] = js.native
  /**
    * The domain of the owner of this API. Together with the ownerName and a packagePath values, this can be used to generate a library for this API which
    * would have a unique fully qualified name.
    */
  var ownerDomain: js.UndefOr[String] = js.native
  /** The name of the owner of this API. See ownerDomain. */
  var ownerName: js.UndefOr[String] = js.native
  /** The package of the owner of this API. See ownerDomain. */
  var packagePath: js.UndefOr[String] = js.native
  /** Common parameters that apply across all apis. */
  var parameters: js.UndefOr[Record[String, JsonSchema]] = js.native
  /** The protocol described by this document. */
  var protocol: js.UndefOr[String] = js.native
  /** The resources in this API. */
  var resources: js.UndefOr[Record[String, RestResource]] = js.native
  /** The version of this API. */
  var revision: js.UndefOr[String] = js.native
  /** The root URL under which all API services live. */
  var rootUrl: js.UndefOr[String] = js.native
  /** The schemas for this API. */
  var schemas: js.UndefOr[Record[String, JsonSchema]] = js.native
  /** The base path for all REST requests. */
  var servicePath: js.UndefOr[String] = js.native
  /** The title of this API. */
  var title: js.UndefOr[String] = js.native
  /** The version of this API. */
  var version: js.UndefOr[String] = js.native
  var version_module: js.UndefOr[Boolean] = js.native
}

object RestDescription {
  @scala.inline
  def apply(): RestDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestDescription]
  }
  @scala.inline
  implicit class RestDescriptionOps[Self <: RestDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: AnonOauth2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscoveryVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscoveryVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discoveryVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentationLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationLink")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withExponentialBackoffDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentialBackoffDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponentialBackoffDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentialBackoffDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: AnonX16): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: Record[String, RestMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(js.undefined)
        ret
    }
    @scala.inline
    def withPackagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Record[String, JsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Record[String, RestResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(js.undefined)
        ret
    }
    @scala.inline
    def withRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: Record[String, JsonSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withServicePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServicePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_module(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_module: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_module")(js.undefined)
        ret
    }
  }
  
}

